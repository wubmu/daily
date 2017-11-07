package nuc.wyb.action;

import com.opensymphony.xwork2.ActionSupport;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Created by 吴亚斌 on 2017/11/6.
 */
public class DeleteAction extends ActionSupport {
    private String fileName;
    private String path;
    FileInputStream in = null;
    public InputStream getTargetFile(){
        try {
            in = new FileInputStream(path+"//"+fileName);
            File f = new File(path+"//"+fileName);
            f.delete();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return in;
    }
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
