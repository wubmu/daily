package nuc.wyb.action;

import com.opensymphony.xwork2.ActionSupport;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.UUID;

/**
 * Created by 吴亚斌 on 2017/10/23.
 */
public class uploadAction extends ActionSupport {
    private File upload;
    private String uploadContentType;
    private String savePath;
    private String uploadFileName;

    @Override
    public String execute() throws Exception {
        String newFileName = UUID.randomUUID()+"_"+uploadFileName;
        FileInputStream fis =new FileInputStream(upload);
        FileOutputStream fos = new FileOutputStream(savePath+"\\"+newFileName);
        byte[] b = new byte[1024];
        int len = 0;
        while ((len = fis.read(b))>0){
            fos.write(b,0,b.length);
        }
        return "uploadOK";
    }

    public File getUpload() {
        return upload;
    }

    public void setUpload(File upload) {
        this.upload = upload;
    }

    public String getUploadContentType() {
        return uploadContentType;
    }

    public void setUploadContentType(String uploadContentType) {
        this.uploadContentType = uploadContentType;
    }

    public String getSavePath() {
        return savePath;
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }

    public String getUploadFileName() {
        return uploadFileName;
    }

    public void setUploadFileName(String uploadFileName) {
        this.uploadFileName = uploadFileName;
    }
}
