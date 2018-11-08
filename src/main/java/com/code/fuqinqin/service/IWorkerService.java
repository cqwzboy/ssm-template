package com.code.fuqinqin.service;

import com.code.fuqinqin.entity.Worker;

/**
 * Created by fuqinqin on 2018/9/21.
 */
public interface IWorkerService {
    Worker findById(Long id);

    Worker exampleById(Long id);

    int insert(Worker worker);
}
