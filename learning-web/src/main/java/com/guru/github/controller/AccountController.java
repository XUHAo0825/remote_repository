package com.guru.github.controller;

import com.guru.github.spring.demo.service.IAccountService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

//@Controller
//@RequestMapping("account")
public class AccountController {

    @Resource
    private IAccountService accountService;

    @RequestMapping("/findAll")
    @ResponseBody
    public Object findAll(){
        return accountService.findAll();
    }

    @RequestMapping("/save")
    @ResponseBody
    public Object save(){
        return accountService.findAll();
    }

    @RequestMapping("/update")
    @ResponseBody
    public Object update(){
        return accountService.findAll();
    }

    @RequestMapping("/delete")
    @ResponseBody
    public Object delete(){
        return accountService.findAll();
    }

    @RequestMapping("/transfer")
    @ResponseBody
    public Object transfer(){
        return accountService.findAll();
    }
}
