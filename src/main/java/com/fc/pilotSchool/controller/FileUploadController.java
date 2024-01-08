package com.fc.pilotSchool.controller;

import cn.hutool.crypto.digest.MD5;
import com.alibaba.fastjson.JSONObject;
import com.fc.pilotSchool.common.domain.AjaxResult;
import com.fc.pilotSchool.util.FileUtil;
import com.fc.pilotSchool.util.SnowflakeIdWorker;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/fileUpload")
public class FileUploadController {

    @ResponseBody
    @PostMapping("/add")
    public AjaxResult fileAdd(@RequestBody MultipartFile object) throws IOException {

        // 获取时间戳
        SimpleDateFormat format = new SimpleDateFormat("yyMMddHHmmss");
        String dateTime = format.format(new Date()).toString();
        // 获取文件名
        String filename = object.getOriginalFilename();
        // 生成新的文件名
        String newImageName = dateTime+"_"+SnowflakeIdWorker.getUUID()+"_"+filename;
        // 文件存储路径
        String path = FileUtil.PATH + newImageName;
        String vPath = "/upload/"+newImageName;
        File dir = new File(FileUtil.PATH);
        if (!dir.exists()){
            dir.mkdirs();
        }
        System.out.println(path);
        File file = new File(path);
        if (!file.exists()){
            file.createNewFile();
        }
        // 图片传输至新文件
        try {
            object.transferTo(file);
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("path",vPath);
            return AjaxResult.successData(200,jsonObject);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return AjaxResult.error(400,"上传文件错误！");
    }


    @RequestMapping("/get")
    public void downloadFileTwo( HttpServletRequest request, HttpServletResponse response) {

        String fileName = request.getParameter("fileName");
        String downUrl = request.getParameter("downUrl");
        goToDownload(request, response, downUrl, fileName);

    }

    /**
     * 下载
     *
     * @param request
     * @param response
     * @param downUrl  下载的路径
     * @param fjmc     下载文件的名称
     */
    private void goToDownload(HttpServletRequest request, HttpServletResponse response, String downUrl, String fjmc) {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/x-msdownload");
        try {
            String encodenickname = URLEncoder.encode(fjmc,"UTF-8");//转Unicode不然ie会乱码
            response.setHeader("Content-Disposition", "attachment;fileName=" + new String(encodenickname.getBytes("UTF-8"), "ISO8859-1"));
            //这里注掉的代码是本地测试的
//            String path = request.getSession().getServletContext().getRealPath("/");
//            String ATTACH_PATH= AppConfig.getInstance().getProperty("attach.base","");
//            if (StringUtils.isNotEmpty(ATTACH_PATH)) {
//                path = ATTACH_PATH;
//            }
//            logger.debug("=path===" + path);
            File file = new File( downUrl);
            if (!file.exists()) {
                response.sendError(404, "File not found!");
                return;
            }
            long fileLength = file.length();
            response.setHeader("Content-Length", String.valueOf(fileLength));
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
            BufferedOutputStream bos = new BufferedOutputStream(response.getOutputStream());
            byte[] buff = new byte[2048];
            int bytesRead;
            while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
                bos.write(buff, 0, bytesRead);
            }
            bis.close();
            bos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
