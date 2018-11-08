package com.code.fuqinqin.controller;

import com.alibaba.fastjson.JSON;
import com.code.fuqinqin.entity.Worker;
import com.code.fuqinqin.service.IWorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by fuqinqin on 2018/9/21.
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private IWorkerService workerService;

    @GetMapping("/add")
    @ResponseBody
    public String add(@RequestParam("name") String name, @RequestParam("money") Long money){
        Worker worker = new Worker();
        worker.setName(name);
        worker.setMoney(money);
        return "新增成功："+workerService.insert(worker);
    }

    @GetMapping("/{name}")
    @ResponseBody
    public String sayHello(@PathVariable("name") String name){
        return "Hello "+name;
    }

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/worker/{id}")
    @ResponseBody
    public String getWorker(@PathVariable("id") Long id){
        return JSON.toJSONString(workerService.findById(id));
    }

}
