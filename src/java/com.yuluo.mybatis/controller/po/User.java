package controller.po;

import lombok.Data;

import java.util.Date;

@Data
public class User {

    private Integer usrid;

    private String username;

    private String realname;

    private String password;

    private Integer islock;

    private Date createTime;


}
