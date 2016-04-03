package cusc.mbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class NguoiDung {

    private String username;
    private String password;
    private boolean login = false;

    public boolean isLogin() {
        return login;
    }

    public void checkUser() {
        if (username.equals("admin") && password.equals("123456")) {
            login = true;
        }        
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
