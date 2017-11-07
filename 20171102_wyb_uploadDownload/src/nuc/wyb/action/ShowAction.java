package nuc.wyb.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import nuc.wyb.bean.FileMessage;
import nuc.wyb.dao.UploadDao;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 吴亚斌 on 2017/11/5.
 */
public class ShowAction extends ActionSupport {
    @Override
    public String execute() throws Exception {
        UploadDao dao = new UploadDao();
        List<FileMessage> fileMessages = dao.findAllFile();
        ActionContext.getContext().getSession().put("fileMessages",fileMessages);
        return "showAll";
    }
}
