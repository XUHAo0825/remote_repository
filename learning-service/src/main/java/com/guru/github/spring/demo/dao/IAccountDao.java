package com.guru.github.spring.demo.dao;

import com.guru.github.spring.demo.po.Account;

import java.util.List;

public interface IAccountDao {

    List<Account> findAll();

    Account findAccount(Integer id);

    void save(Account account);

    void update(Account account);

    void delete(Integer id);

    Account findByName(String name);
}
