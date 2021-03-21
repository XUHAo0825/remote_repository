package com.guru.github.spring.demo.service.impl;

import com.guru.github.spring.demo.service.IAccountService;
import com.guru.github.spring.util.TransactionUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.lang.reflect.Proxy;

@Service("ProxyServiceImpl")
public class ProxyServiceImpl {

    @Resource
    private IAccountService accountService;
    @Resource
    private TransactionUtil transactionUtil;

    public IAccountService getProxyService(){

        return (IAccountService) Proxy.newProxyInstance(accountService.getClass().getClassLoader(),
                accountService.getClass().getInterfaces(),
                (proxy,method,args) ->{
                    Object returnVal;
                    try {
                        transactionUtil.beginTransaction();
                        returnVal = method.invoke(accountService,args);
                        transactionUtil.commitTransaction();
                        return returnVal;
                    }catch (Exception e){
                        transactionUtil.rollbackTransaction();
                        throw new RuntimeException(e);
                    }finally {
                        transactionUtil.releaseTransaction();
                    }
                });
    }
}
