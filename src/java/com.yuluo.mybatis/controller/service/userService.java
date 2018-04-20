package controller.service;


import controller.po.User;
import java.io.Serializable;
import java.util.List;

public interface userService extends Serializable{

    public List<User> getAllEmployees();

    public User getEmployeeId(int id);


}
