package com.wyb.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.*;
import com.wyb.vo.User;

import java.util.regex.Pattern;

/**
 * Created by 吴亚斌 on 2017/10/8.
 */
@Validations(
        requiredStrings = {
                @RequiredStringValidator(fieldName = "name",message = "真实姓名不能为空"),
                @RequiredStringValidator(fieldName = "phone",message = "电话不能为空"),
                @RequiredStringValidator(fieldName = "password",message = "密码不能为空"),
                @RequiredStringValidator(fieldName = "email",message = "邮箱不能为空")
        },
        stringLengthFields = {
               @StringLengthFieldValidator(fieldName = "password",minLength = "6",maxLength = "16",message = "密码长度为6-16")
        },
        regexFields = {
                @RegexFieldValidator(fieldName = "email",message = "邮箱格式不正确",regexExpression = "^\\\\w+((-\\\\w+)|(\\\\.\\\\w+))*\\\\@[A-Za-z0-9]+((\\\\.|-)[A-Za-z0-9]+)*\\\\.[A-Za-z0-9]+$")
        }
        )
public class RegisterAction3 extends ActionSupport {
    private String email;
    private String username;
    private String password;
    private String phone;
    private String name;
    private String repassword;
    private String code;
    String regexEmail = "^\\\\w+((-\\\\w+)|(\\\\.\\\\w+))*\\\\@[A-Za-z0-9]+((\\\\.|-)[A-Za-z0-9]+)*\\\\.[A-Za-z0-9]+$";

    String regexName = "[\\u4e00-\\u9fa5]{2,4}";

    String regexPhone = "13[0-9]{9}";
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getEmail() {
        return email;
    }

    /**
     * 声明式验证（在setter方法上）
     * @param email
     */
    //@RequiredStringValidator(type = ValidatorType.FIELD,key = "email.required",message = "")
    //@RegexFieldValidator(regex = "",key = "email.regex",message = "邮箱格式 ")
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

    @Override
    public void validate() {
        String code1= (String) ActionContext.getContext().getSession().get("code");
        if (!code1.toLowerCase().equals(code.toLowerCase()))
            addFieldError("code","验证码不正确");
    }


}
