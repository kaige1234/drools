package com.sk.drools.controller;

import com.sk.drools.dao.RulePropertyInfoMapper;
import com.sk.drools.entity.RulePropertyInfo;
import com.sk.drools.service.RulePropertyInfoServerice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class Test {

    @Autowired
    private RulePropertyInfoServerice rulePropertyInfoServerice;

    @RequestMapping(value = "/get")
    public void get(){
        Map<String, Object> map =  new HashMap<String,Object>();
        rulePropertyInfoServerice.get();

    }

}
