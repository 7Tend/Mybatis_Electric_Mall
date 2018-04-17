package test;

import controller.dao.UserDao;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import controller.po.User;


public class Demo1Test {
    private ApplicationContext applicationContext;
    @Before
    public void setUp() {
        applicationContext =  new ClassPathXmlApplicationContext("spring-mybatis.xml");
    }

    @Test
    public void findUserById() {
        UserDao userDao = (UserDao)applicationContext.getBean("userDao");
        User user = userDao.getEmployeeId(1);
        System.out.println(user);
    }
}