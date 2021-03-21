package com.guru.github.spring.demo.service;

import com.guru.github.spring.demo.po.Account;

import java.util.List;

public interface IAccountService {

    List<Account> findAll();

    Account findAccount(Integer id);

    void save(Account account);

    void update(Account account);

    void delete(Integer id);

    void transfer(String sourceName,String targetName, Integer money);
}
