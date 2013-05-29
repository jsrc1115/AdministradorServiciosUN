/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package backing_beans;

import javax.inject.Named;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Sebastian
 */
@Named(value = "filtroBean")
@SessionScoped
public class FiltroBean {
    private String message;
    /**
     * Creates a new instance of FiltroBean
     */
    public FiltroBean() {
    }
    
    public String goHomeUsuario()
    {
        message = "HomeUsuario";
        
        return message+"?faces-redirect=true";
    }
}
