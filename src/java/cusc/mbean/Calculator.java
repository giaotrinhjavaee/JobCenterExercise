package cusc.mbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Calculator {

    private int number;    
    private int result;

    public String calculateSum() {
        result = number * number;
        return null;
    }


    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }   
}
