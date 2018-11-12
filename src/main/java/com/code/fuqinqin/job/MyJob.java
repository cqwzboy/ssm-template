package com.code.fuqinqin.job;

import com.tj.platform.job.common.AbstarctMQJob;
import com.tj.platform.job.common.JobMessage;
import com.tj.platform.job.common.JobResult;
import com.tj.platform.job.common.spring.MQJob;

import java.util.Date;

@MQJob(systemCode = "ssm-template", jobName = "job_1")
public class MyJob extends AbstarctMQJob {

    private static int count = 0;
    @Override
    protected JobResult doBusiness(JobMessage jobMessage) {
        JobResult result = new JobResult();
        /** do some biz */
        result.setJobRunId(jobMessage.getJobRunId());
        result.setMsg("这是测试job回调消息");
        result.setCode(JobResult.SUCCESS);
        result.setResultTime(new Date());
        System.out.println(count++ +" - "+jobMessage.getJobRunId()+" - "+jobMessage.getParams());
        return result;
    }

}
