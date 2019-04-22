package com.sk.drools.service;

import com.sk.drools.dao.RulePropertyInfoMapper;
import com.sk.drools.dao.SAccountBalanceMapper;
import com.sk.drools.entity.SAccountBalance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class RulePropertyInfoServerice {

   @Autowired
    private SAccountBalanceMapper sAccountBalanceMapper;

    public void get(){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("orderSn","20180411130503582");
        SAccountBalance s = sAccountBalanceMapper.getbalanceByOrderSn(map);
        System.out.println(s);
    }
}
