package com.guru.github.spring.demo.dao.impl;

import com.guru.github.spring.demo.dao.IAccountDao;
import com.guru.github.spring.demo.po.Account;
import com.guru.github.spring.util.ConnectionUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class AccountDaoImpl implements IAccountDao {

    @Resource
    private QueryRunner runner;
    @Resource
    private ConnectionUtil connectionUtil;

    public List<Account> findAll() {
        try {
            return runner.query(connectionUtil.getThreadConnection(),"select * from t_demo;",new BeanListHandler<Account>(Account.class));
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public Account findAccount(Integer id) {
        try {
            return runner.query(connectionUtil.getThreadConnection(),"select * from t_demo where t_id = ?;",new BeanHandler<Account>(Account.class),id);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public void save(Account account) {
        try {
            runner.update(connectionUtil.getThreadConnection(),"insert into t_demo(t_id,name) values (?,?)",account.getId(),account.getName());
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public void update(Account account) {
        try {
            runner.update(connectionUtil.getThreadConnection(),"update t_demo set name=?,price=? where t_id=?",account.getName(),account.getPrice(),account.getId());
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public void delete(Integer id) {
        try {
            runner.update(connectionUtil.getThreadConnection(),"delete from t_demo where t_id=?",id);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public Account findByName(String name) {
        try {
            List<Account> list = runner.query(connectionUtil.getThreadConnection(),"select * from t_demo where name = ?;",new BeanListHandler<Account>(Account.class),name);
            if(list == null || list.size() != 1){
                throw new RuntimeException("查询数据结果不止一条");
            }
            return list.get(0);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
