package wyb.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import wyb.vo.User;

import java.util.Map;

/**
 * Created by 吴亚斌 on 2017/9/18.
 */
public class LoginAction extends ActionSupport implements ModelDriven<User>{
    User user =new User();
    private String code;
    private ActionContext context=ActionContext.getContext();
    private Map<String,Object> session=context.getSession();
    private String code1= (String) session.get("code");

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String execute() throws Exception {
        if (user.getType().equals("admin")){
            if (user.getUsername().equals("admin")&&user.getPassword().equals("123")) {
                session.put("admin",user);
                return "adminSuccess";
            }
        }
        if (user.getType().equals("user"))
            if (user.getUsername().equals("user")&&user.getPassword().equals("123")) {
                session.put("user", user);
                return "userSuccess";
            }

            this.addFieldError("error","用户名或密码错误");
            return ERROR;

    }

    @Override
    public void validate() {
        if (user.getUsername()==null||user.getUsername().trim().equals("")){
            this.addFieldError("usernameError","用户名不能为空");
        }
        if (user.getPassword()==null||user.getPassword().trim().equals("")){
            this.addFieldError("passwordError","密码不能为空");
        }
        if (!code1.toLowerCase().equals(code.toLowerCase())){
            System.out.println(code1+"            "+code);
            this.addFieldError("codeError","验证码错误");
        }
    }

    @Override
    public User getModel() {
        return user;
    }
}
