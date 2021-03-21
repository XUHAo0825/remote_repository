package com.guru.github.spring.util;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;

@Service
public class ConnectionUtil {

    private ThreadLocal<Connection> tl = new ThreadLocal<>();

    @Resource
    private DataSource dataSource;

    /**
     * 获取当前线程上的连接
     * @return
     */
    public Connection getThreadConnection(){
        try{
            //1.先从线程中获取
            Connection connection = tl.get();
            //2.判断当前线程上是否有连接
            if(connection == null){
                //3.从数据源上获取一个连接 并且存入threadlocal中
                connection = dataSource.getConnection();
                tl.set(connection);
            }
            return connection;
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 把连接和线程解绑
     */
    public void removeConnection(){
        try {
            tl.remove();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
