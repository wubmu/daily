package nuc.wyb.action;

import com.opensymphony.xwork2.ActionSupport;
import nuc.wyb.bean.FileMessage;
import nuc.wyb.dao.UploadDao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.UUID;

/**
 * Created by 吴亚斌 on 2017/11/2.
 */
public class UploadAction extends ActionSupport{
    private File[] upload;
    private String[] uploadContentType;
    private String[] uploadFileName;
    private String savePath;
    @Override
    public String execute() throws Exception {
        UploadDao dao = new UploadDao();
        for (int i = 0; i < upload.length; i++) {
            String newFileName = UUID.randomUUID() + "_" + uploadFileName[i];
            FileInputStream fis = new FileInputStream(upload[i]);
            FileOutputStream fos = new FileOutputStream(savePath + "\\" + newFileName);
            byte[] b = new byte[1024];
            int len = 0;
            FileMessage f = new FileMessage(dao.findAllFile().size()+1,newFileName,uploadFileName[i],uploadContentType[i]);
            dao.saveFile(f);
            while ((len = fis.read(b)) > 0) {
                fos.write(b, 0, b.length);
            }
        }
        System.out.println(this.toString());
        return "uploadOK";
    }
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

    public String[] getUploadFileName() {
        return uploadFileName;
    }

    public void setUploadFileName(String[] uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    public String getSavePath() {
        return savePath;
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }

    @Override
    public String toString() {
        return "UploadAction{" +
                "upload=" + Arrays.toString(upload) +
                ", uploadContentType=" + Arrays.toString(uploadContentType) +
                ", uploadFileName=" + Arrays.toString(uploadFileName) +
                ", savePath='" + savePath + '\'' +
                '}';
    }
}
