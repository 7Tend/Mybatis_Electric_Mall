package controller.service.impl;

import controller.po.User;
import controller.service.userService;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import java.util.List;


public class userServiceImpl extends SqlSessionDaoSupport implements userService {

    @Override
    public List<User> getAllEmployees() {

        //创建SqlSession
        SqlSession sqlSession = this.getSqlSession();

        //根据查询信息
        try {
            List<User> userList = sqlSession.selectList("selectAllEmployee");
            return userList;
        } finally {
            sqlSession.close();
        }
    }

    @Override
    public User getEmployeeId(int id) {
        SqlSession session = this.getSqlSession();
        try {
            User employee = session.selectOne("selectEmployeeById", id);
            return employee;
        } finally {
            session.close();
        }
    }
}
