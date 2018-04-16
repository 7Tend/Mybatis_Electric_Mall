package test;

import dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import po.User;

import java.applet.AppletContext;


public class Demo1 {

    private ApplicationContext applicationContext;

    public void setUp() throws Exception{
        applicationContext =  new ClassPathXmlApplicationContext("spring-mybatis.xml");

    }

    public void FindUserById() throws Exception {
        UserDao userDao = (UserDao)applicationContext.getBean("userDao");
        User user = userDao.getEmployeeId(1);
    }

}
