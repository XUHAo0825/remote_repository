package com.guru.github.spring.util;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TransactionUtil {

    @Resource
    private ConnectionUtil connectionUtil;

    /**
     * 创建事务
     */
    public void beginTransaction(){
        try {
            //手动提交
            connectionUtil.getThreadConnection().setAutoCommit(false);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 提交事务
     */
    public void commitTransaction(){
        try {
            connectionUtil.getThreadConnection().commit();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 回滚事务
     */
    public void rollbackTransaction(){
        try {
            connectionUtil.getThreadConnection().rollback();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 释放事务
     */
    public void releaseTransaction(){
        try {
            connectionUtil.getThreadConnection().close();

            connectionUtil.removeConnection();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    //连接池的好处 ：把消耗时间获取连接的这一部分放到应用加载开始，在web工厂中当我们启动Tomcat, 加载应用时，我们创建一些连接，从而后续项目运行阶段不再和数据库
    //获取连接，保证我们执行connection的执行效率。
    //那这个时候 我们使用服务器 服务器也会有一个池的技术 叫做线程池 它的特点是当tomcat启动时 会初始化一大堆线程放在一个容器中 接下来我们每次访问 它都是从线程池中拿一个给我们使用
    //那么线程池中的线程和连接池中的连接一样 close方法不是真正的关闭 而是把将连接还回池中
}
