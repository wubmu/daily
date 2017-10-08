package com.wyb.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.wyb.vo.User;

import java.util.regex.Pattern;

/**
 * Created by 吴亚斌 on 2017/10/8.
 */
public class RegisterAction extends ActionSupport implements ModelDriven<User> {
    private String email;
    private String username;
    private String password;
    private String phone;
    private String name;
    private String repassword;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRepassword() {
        return repassword;
    }

    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    private User user = new User();
    @Override
    public User getModel() {
        return user;
    }

    @Override
    public String execute() throws Exception {
        return "success";
    }

//    @Override
//    public void validate() {
//        String regexEmail="^\\\\w+((-\\\\w+)|(\\\\.\\\\w+))*\\\\@[A-Za-z0-9]+((\\\\.|-)[A-Za-z0-9]+)*\\\\.[A-Za-z0-9]+$";
//        if(Pattern.matches(user.getEmail(),regexEmail)){
//                addFieldError("email","邮箱格式不正确");
//        }
//    }


}
