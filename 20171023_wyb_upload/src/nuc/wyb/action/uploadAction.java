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
    private File[] upload;

    public File[] getUpload() {
        return upload;
    }

    public void setUpload(File[] upload) {
        this.upload = upload;
    }

    public String[] getUploadContentType() {
        return uploadContentType;
    }

    public void setUploadContentType(String[] uploadContentType) {
        this.uploadContentType = uploadContentType;
    }

    public String getSavePath() {
        return savePath;
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }

    public String[] getUploadFileName() {
        return uploadFileName;
    }

    public void setUploadFileName(String[] uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    private String[] uploadContentType;
    private String savePath;
    private String[] uploadFileName;

    @Override
    public String execute() throws Exception {
        for (int i = 0; i < upload.length; i++) {
            String newFileName = UUID.randomUUID() + "_" + uploadFileName[i];
            FileInputStream fis = new FileInputStream(upload[i]);
            FileOutputStream fos = new FileOutputStream(savePath + "\\" + newFileName);
            byte[] b = new byte[1024];
            int len = 0;
            while ((len = fis.read(b)) > 0) {
                fos.write(b, 0, b.length);
            }
        }

        return "uploadOK";
    }

}