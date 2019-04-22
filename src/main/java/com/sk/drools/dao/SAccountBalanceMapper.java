package com.sk.drools.dao;


import com.sk.drools.entity.SAccountBalance;
import com.sk.drools.utils.Mapper;

import java.util.Map;

/**
 * Created by tangwenchi on 2018/1/18.
 */
public interface SAccountBalanceMapper extends Mapper<SAccountBalance> {

    SAccountBalance getbalanceByOrderSn(Map<String, Object> maps);

}
