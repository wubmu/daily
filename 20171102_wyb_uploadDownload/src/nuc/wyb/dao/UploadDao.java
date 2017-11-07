package nuc.wyb.dao;

import nuc.wyb.bean.FileMessage;
import nuc.wyb.db.UploadDB;

import java.util.List;

/**
 * Created by 吴亚斌 on 2017/11/3.
 */
public class UploadDao {
    private UploadDB db = new UploadDB();
    public void saveFile(FileMessage f){
        db.list.add(f);
    }
    public List<FileMessage> findAllFile(){
        return db.list;
    }
}
