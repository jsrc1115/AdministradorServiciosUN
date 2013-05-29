/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package backing_beans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.icefaces.ace.model.table.RowStateMap;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;

/**
 *
 * @author Sebastian
 */
@Named(value = "tableListenerHClinica")
@SessionScoped
public class TableListenerHClinica implements Serializable {
private static final int EVENT_SIZE = 5;
    
    private List<String> eventLog = new ArrayList<String>(EVENT_SIZE);
    private List selectedRows;
    private RowStateMap stateMap = new RowStateMap();
    private List<cita> historiaData;
    
    /////////////---- CONSTRUCTOR BEGIN
    public TableListenerHClinica() {
        historiaData = new ArrayList<cita>();
        historiaData.add(new cita("1","Cita asd"));
        historiaData.add(new cita("2","Cita qwe"));
    }

    /////////////---- EVENT LISTENERS BEGIN
    public void selectListener(SelectEvent event) {
        
    }

    public void deselectListener(UnselectEvent event) {
        
    }
    
    /////////////---- GETTERS & SETTERS BEGIN
    public List<cita> getHistoriaData() { return historiaData; }
    public void setHistoriaData(List<cita> citaData) { this.historiaData = citaData; }
    public int getEventSize() { return EVENT_SIZE; }
    public List<String> getEventLog() { return eventLog; }
    public List getSelectedRows() { return stateMap.getSelected(); }
    public RowStateMap getStateMap() { return stateMap; }
    public void setEventLog(List<String> eventLog) { this.eventLog = eventLog; }
    public void setSelectedRows(List selectedRows) { }
    public void setStateMap(RowStateMap stateMap) { this.stateMap = stateMap; }
    //Esto es solo para llenar la lista despues se quita
    public static class cita {
        
        private String id;
        private String name;
        private Date fecha = Calendar.getInstance().getTime();

        public cita(String id, String name) {
            this.id = id;
            this.name = name;
        }
        
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Date getFecha() {
            return fecha;
        }

        public void setFecha(Date fecha) {
            this.fecha = fecha;
        }
        
    }
    //--------------------------------------------------
}
