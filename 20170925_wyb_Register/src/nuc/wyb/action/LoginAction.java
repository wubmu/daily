package nuc.wyb.action;



/**
 * Created by 吴亚斌 on 2017/10/9.
 */
public class LoginAction {
    private String password;
    private String username;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String regist() throws Exception{
        return "regist";
    }
}
