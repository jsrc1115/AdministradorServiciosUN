package backing_beans;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sebastian
 */
@ManagedBean(name="LoginBean")
@SessionScoped
public class LoginBean implements Serializable {
    private String message="";
    
    public String doLogin()
    {
        message = "Filtro";
        
        return message+"?faces-redirect=true";
    }
}
