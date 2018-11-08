package com.code.fuqinqin.service.impl;

import com.code.fuqinqin.entity.Worker;
import com.code.fuqinqin.entity.WorkerExample;
import com.code.fuqinqin.mappers.WorkerMapper;
import com.code.fuqinqin.service.IWorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by fuqinqin on 2018/9/21.
 */
@Service
public class WorkerServiceImpl implements IWorkerService {
    @Autowired
    private WorkerMapper workerMapper;

    @Override
    public Worker findById(Long id) {
        return workerMapper.selectByPrimaryKey(id);
    }

    @Override
    public Worker exampleById(Long id) {
        WorkerExample workerExample = new WorkerExample();
        WorkerExample.Criteria criteria = workerExample.createCriteria();
        criteria.andIdEqualTo(id);
        return workerMapper.selectByExample(workerExample).get(0);
    }

    @Override
    public int insert(Worker worker) {
        return workerMapper.insert(worker);
    }
}
