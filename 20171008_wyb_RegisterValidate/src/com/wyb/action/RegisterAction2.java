package com.wyb.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.wyb.vo.User;

import java.util.regex.Pattern;

/**
 * Created by 吴亚斌 on 2017/10/8.
 */
public class RegisterAction2 extends ActionSupport{
    private String email;
    private String username;
    private String password;
    private String phone;
    private String name;
    private String repassword;
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

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

    // @RequiredStringValidator(type = ValidatorType.FIELD,key = "name.required",message = "名字必填")
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
    public String execute() throws Exception {
        return "success";
    }

    public String regist() {

        return "registOK";
    }

    public void validateRegist() {
        String regexEmail = "^\\\\w+((-\\\\w+)|(\\\\.\\\\w+))*\\\\@[A-Za-z0-9]+((\\\\.|-)[A-Za-z0-9]+)*\\\\.[A-Za-z0-9]+$";

        String regexName = "[\\u4e00-\\u9fa5]{2,4}";

        String regexPhone = "13[0-9]{9}";
        if (email == null || email.trim().equals("")) {
            addFieldError("email", "邮箱不能为空");
        } else {
            if (Pattern.matches(regexEmail, email))
                addFieldError("email", "邮箱格式不正确");
        }
        if (password == null || password.trim().equals("")) {
            addFieldError("password", "密码不能为空");
        } else {
            if (password.length() < 6 || password.length() > 16)
                addFieldError("password", "密码长度必须是6-16位");
        }
        if (repassword != password) {
            addFieldError("repassword", "两次密码不一致");
        }
        if (name == null || name.trim().equals("")) {
            addFieldError("name", "必须填写真实姓名");
        } else {
            if (Pattern.matches(regexName, name))
                addFieldError("name", "名字不合法");
        }
        if (phone.trim().equals("") || phone == null) {
            addFieldError("phone", "电话不能为空");
        } else {
            if (Pattern.matches(regexPhone, phone))
                addFieldError("phone", "电话格式不正确");
        }

    }

    @Override
    public void validate() {
        String code1= (String) ActionContext.getContext().getSession().get("code");
        if (!code1.toLowerCase().equals(code.toLowerCase()))
            addFieldError("code","验证码不正确");
    }


}
