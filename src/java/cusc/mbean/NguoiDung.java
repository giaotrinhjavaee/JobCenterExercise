package cusc.mbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

@ManagedBean
@RequestScoped
public class NguoiDung {

    private String username;
    private String password;
    private boolean login = false;

    public boolean isLogin() {
        return login;
    }

    public String checkUser() {       
        return "sanpham";
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

    public void selectIt(ActionEvent e){
        String buttonId = e.getComponent().getClientId();       
        System.out.println(buttonId);
    }    
    
    public void changeIt(ValueChangeEvent e){        
        String newString=e.getNewValue().toString();
        System.out.println(newString);
    }
}
