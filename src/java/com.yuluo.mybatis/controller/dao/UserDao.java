package controller.dao;


import controller.po.User;
import java.io.Serializable;
import java.util.List;

public interface UserDao extends Serializable{

    public List<User> getAllEmployees();

    public User getEmployeeId(int id);


}
