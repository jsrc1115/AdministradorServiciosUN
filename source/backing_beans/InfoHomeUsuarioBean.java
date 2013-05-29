/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package backing_beans;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Named;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Sebastian
 */
@Named(value = "infoHomeUsuario")
@SessionScoped
public class InfoHomeUsuarioBean {
    private static Map<String,Object> hospitales;
    static{
        hospitales= new LinkedHashMap<String,Object>();
        hospitales.put("ID1 - Samaritana", "ID1"); //label, value
        hospitales.put("ID2 - San Rafael", "ID2"); //label, value
        hospitales.put("ID3 - Country", "ID3"); //label, value
    }
    /**
     * Creates a new instance of InfoHomeUsuarioBean
     */
    public InfoHomeUsuarioBean() {
    }
    
    public Map<String,Object> getHospitales() {        
        return hospitales;
    }
    
    public String goUsuarioHistoriaClinica()
    {
        return "UsuarioHistoriaClinica?faces-redirect=true";
    }
    public String goInfoUsuario()
    {
        return "InfoUsuario?faces-redirect=true";
    }
}
