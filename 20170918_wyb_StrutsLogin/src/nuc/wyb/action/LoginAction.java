package nuc.wyb.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.org.apache.regexp.internal.RE;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by 吴亚斌 on 2017/9/18.
 */
public class LoginAction extends ActionSupport {
    private String username;
    private String password;
    private String type;
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    private ActionContext context=ActionContext.getContext();
    private Map<String,Object> session=context.getSession();
    private String code1= (String) session.get("code");

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String execute() throws Exception {
        if (type.equals("admin")){
            if (username.equals("admin")&&password.equals("123")) {
                session.put("admin",username);
                return "adminSuccess";
            }
        }
        if (type.equals("user"))
            if (username.equals("user")&&password.equals("123")) {
                session.put("user", username);
                return "userSuccess";
            }
            return ERROR;

    }

    @Override
    public void validate() {
        if (username==null||username.trim().equals("")){
            this.addFieldError("usernameError","用户名不能为空");
        }
        if (password==null||password.trim().equals("")){
            this.addFieldError("passwordError","密码不能为空");
        }
        if (!code1.toLowerCase().equals(code.toLowerCase())){
            System.out.println(code1+"            "+code);
            this.addFieldError("codeError","验证码错误");
        }
    }


}
