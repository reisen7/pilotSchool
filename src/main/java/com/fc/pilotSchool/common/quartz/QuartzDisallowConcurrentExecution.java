package com.fc.pilotSchool.common.quartz;

import com.fc.pilotSchool.common.quartz.utils.JobInvokeUtil;
import com.fc.pilotSchool.model.auto.SysQuartzJob;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;

/**
 * 定时任务处理（禁止并发执行）
 * 
 * @author jan 橙寂
 *
 */
@DisallowConcurrentExecution
public class QuartzDisallowConcurrentExecution extends AbstractQuartzJob
{
    @Override
    protected void doExecute(JobExecutionContext context, SysQuartzJob sysJob) throws Exception
    {
        JobInvokeUtil.invokeMethod(sysJob);
    }
}
