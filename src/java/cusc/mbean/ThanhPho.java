package cusc.mbean;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

@ManagedBean
@RequestScoped
public class ThanhPho {
    private ArrayList<String> tpArray= new ArrayList<String>(Arrays.asList("Cần Thơ","Cà Mau","Bạc Liêu","Sóc Trăng"));
    private String tp; 
    public void selectIt(ValueChangeEvent e){        
        tp=e.getNewValue().toString();
        
    }  

    public String getTp() {
        return tp;
    }

    public void setTp(String tp) {
        this.tp = tp;
    }

    public ArrayList<String> getTpArray() {
        return tpArray;
    }

    public void setTpArray(ArrayList<String> tpArray) {
        this.tpArray = tpArray;
    }
    
}
