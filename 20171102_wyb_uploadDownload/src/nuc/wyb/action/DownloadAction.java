package nuc.wyb.action;

import com.opensymphony.xwork2.ActionSupport;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Created by 吴亚斌 on 2017/11/4.
 */
public class DownloadAction extends ActionSupport {
    private String fileName;
    private String path;
    private String ContentType;
    @Override
    public String toString() {
        return "DownloadAction{" +
                "fileName='" + fileName + '\'' +
                ", path='" + path + '\'' +
                '}';
    }

    public InputStream getTargetFile() throws FileNotFoundException {

        InputStream in = new FileInputStream(path+"\\"+fileName);
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

    public String getContentType() {
        return ContentType;
    }

    public void setContentType(String contentType) {
        ContentType = contentType;
    }
}
