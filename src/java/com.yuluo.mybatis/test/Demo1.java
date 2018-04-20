package test;

import controller.service.userService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import controller.po.User;



public class Demo1 {

    private ApplicationContext applicationContext;

    public void setUp() throws Exception{
        applicationContext =  new ClassPathXmlApplicationContext("spring-mybatis.xml");

    }

    public void FindUserById() throws Exception {
        userService userDao = (userService)applicationContext.getBean("userDao");
        User user = userDao.getEmployeeId(1);
    }

}
