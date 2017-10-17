package nuc.wyb.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import javafx.application.Application;
import nuc.wyb.model.User;

/**
 * Created by 吴亚斌 on 2017/10/17.
 */
public class RegistAction extends ActionSupport implements ModelDriven<User>
{
    public User user=new User();
    @Override
    public User getModel() {
        return user;
    }

    public String registOk(){
        System.out.println(123);
        ActionContext.getContext().getSession().put("user",user);
        return "registOK";
    }
}
