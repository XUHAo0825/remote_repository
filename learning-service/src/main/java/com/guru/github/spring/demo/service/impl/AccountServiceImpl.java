package com.guru.github.spring.demo.service.impl;

import com.guru.github.spring.demo.dao.IAccountDao;
import com.guru.github.spring.demo.po.Account;
import com.guru.github.spring.demo.service.IAccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("AccountServiceImpl")
public class AccountServiceImpl implements IAccountService {

    @Resource
    private IAccountDao accountDao;

    public List<Account> findAll() {
        return accountDao.findAll();
    }

    public Account findAccount(Integer id) {
        return accountDao.findAccount(id);
    }

    public void save(Account account) {
        accountDao.save(account);
    }

    public void update(Account account) {
        accountDao.update(account);
    }

    public void delete(Integer id) {
        accountDao.delete(id);
    }

    public void transfer(String sourceName, String targetName, Integer money) {
        Account source = accountDao.findByName(sourceName);
        Account target = accountDao.findByName(targetName);

        System.out.println("----"+source.getPrice());
        source.setPrice(source.getPrice()-money);
        target.setPrice(target.getPrice()+money);

        accountDao.update(source);
        System.out.println("----"+source.getPrice());

        int i = 1/0;

        accountDao.update(target);
    }
}
