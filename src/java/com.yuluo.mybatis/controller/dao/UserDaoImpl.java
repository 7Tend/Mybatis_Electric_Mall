package controller.dao;

import controller.po.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import java.util.List;


public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

    @Override
    public List<User> getAllEmployees() {

        //创建SqlSession
        SqlSession sqlSession = this.getSqlSession();

        //根据查询信息
        try {
            List<User> ret = sqlSession.selectList("selectAllEmployee");
            return ret;
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
