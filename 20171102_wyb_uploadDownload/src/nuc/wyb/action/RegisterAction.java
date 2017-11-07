package nuc.wyb.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import nuc.wyb.bean.User;
import nuc.wyb.dao.UserDao;


/**
 * Created by 吴亚斌 on 2017/10/8.
 */
public class RegisterAction extends ActionSupport implements ModelDriven<User> {


    public User user = new User();


    @Override
    public String execute() throws Exception {
        ActionContext.getContext().getSession().put("user",user);
        UserDao dao=new UserDao();

        dao.addUser(user);
        return "success";
    }

    public String regist() {

        System.out.println(user.toString());
        return "registOK";
    }

    @Override
    public void validate() {
        String code1= (String) ActionContext.getContext().getSession().get("code");
            if (!user.getCode().toLowerCase().equals(code1.toLowerCase()))
                addFieldError("code","验证码不正确");
        }


    @Override
    public User getModel() {
        return user;
    }
}
