package nuc.wyb.action;


import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by 吴亚斌 on 2017/9/11.
 */
public class helloAction extends ActionSupport {
    @Override
    public String execute() throws Exception {
        return "success";
    }
}
