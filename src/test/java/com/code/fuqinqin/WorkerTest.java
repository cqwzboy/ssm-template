package com.code.fuqinqin;

import com.alibaba.fastjson.JSON;
import com.code.fuqinqin.entity.Worker;
import com.code.fuqinqin.service.IWorkerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by fuqinqin on 2018/9/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-context.xml"})
public class WorkerTest {
    private static final Logger logger = LoggerFactory.getLogger(WorkerTest.class);

    @Autowired
    private IWorkerService workerService;

    @Test
    public void findWorker(){
//        Worker worker = workerService.findById(1L);
        Worker worker = workerService.exampleById(1L);
        logger.info(JSON.toJSONString(worker));
    }
}
