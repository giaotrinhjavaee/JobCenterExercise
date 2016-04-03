package cusc.mbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class NguoiDung2 {

    private String username;
    private String password;

    public String checkUser() {
        String outcome = "dangnhap";
        if (username.equals("admin") && password.equals("123456")) {
            outcome = "sanpham";
        }
        return outcome;
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

