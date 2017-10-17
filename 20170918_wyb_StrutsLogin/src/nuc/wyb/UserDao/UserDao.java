package nuc.wyb.UserDao;

import nuc.wyb.db.UserDB;
import nuc.wyb.vo.User;

/**
 * Created by 吴亚斌 on 2017/10/11.
 */
public class UserDao {
    public void  addUser(User user){
        UserDB.users.put(user.getUsername(),user.getPassword());
    }
    public boolean login(User user){
        String password= (String) UserDB.users.get(user.getUsername());
        if (user.getPassword().equals(password))
            return true;
        return false;
    }
}
