package nuc.wyb.bean;

import java.util.Date;

/**
 * Created by 吴亚斌 on 2017/11/2.
 */
public class FileMessage {
    int id;
    String uuidName;
    String inputName;
    String ContentType;

    public FileMessage(int id, String uuidName, String inputName, String contentType) {
        this.id = id;
        this.uuidName = uuidName;
        this.inputName = inputName;
        ContentType = contentType;
    }

    public String getContentType() {
        return ContentType;
    }

    public void setContentType(String contentType) {
        ContentType = contentType;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUuidName() {
        return uuidName;
    }

    public void setUuidName(String uuidName) {
        this.uuidName = uuidName;
    }

    public String getInputName() {
        return inputName;
    }

    public void setInputName(String inputName) {
        this.inputName = inputName;
    }

}
