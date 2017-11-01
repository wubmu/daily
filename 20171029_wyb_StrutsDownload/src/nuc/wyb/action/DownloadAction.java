package nuc.wyb.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.InputStream;

/**
 * Created by 吴亚斌 on 2017/10/29.
 */
public class DownloadAction extends ActionSupport {
    private String fileName;

    public String getInputPath() {
        return inputPath;
    }

    public void setInputPath(String inputPath) {
//        this.inputPath = new String (inputPath.getBytes(""),"utf-8");
    }

    private String inputPath;
    private String contentType;

    @Override
    public String toString() {
        return "DownloadAction{" +
                "fileName='" + fileName + '\'' +
                ", inputPath='" + inputPath + '\'' +
                ", contentType='" + contentType + '\'' +
                '}';
    }

    public InputStream getTargetFile(){
        return ServletActionContext.getServletContext().getResourceAsStream(inputPath);
    }
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }


    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    @Override
    public String execute() throws Exception {
        System.out.println(toString());
        return SUCCESS;
    }
}
