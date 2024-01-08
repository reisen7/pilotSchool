package com.fc.pilotSchool.controller;

import com.fc.pilotSchool.common.base.BaseController;

import com.fc.pilotSchool.model.auto.Student;
import com.fc.pilotSchool.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 如果有前台这儿写前台访问方法
 * @ClassName: IndexController
 * @author fuce
 * @date 2019-10-21 00:15
 */
@Api(tags = "首页模块")
@Controller
public class IndexController extends BaseController{
	
	/**
	 * 前台访问 域名:端口 例如:localhost:80的get请求
	 * @param map
	 * @return
	 * @author fuce
	 * @Date 2019年11月20日 下午10:55:13
	 */
	@Autowired
	private StudentService studentService;

	@ApiOperation(value="前台",notes="前台")
	@GetMapping("/login")
	public String index(ModelMap map) {

		//直接访问后台用
		//return "redirect:/admin/login"
    	return "login";
	}
	/**
	 * 前台访问/index的get请求
	 * @param map
	 * @return
	 * @author fuce
	 * @Date 2019年11月20日 下午10:54:56
	 */
	@ApiOperation(value="注册",notes="注册")
	@GetMapping("/index")
	public String index2(ModelMap map) {

		return "login";
	}

}
