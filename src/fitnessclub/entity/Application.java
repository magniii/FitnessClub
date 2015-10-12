package fitnessclub.entity;

import java.sql.Date;

/**
 *
 * @author magni
 */
public class Application {
    private int id;
    private int clientId;
    private int state;
    private String text;
    private Date crdate;

    public Application(int _clientId) {
        this.clientId = _clientId;
        //this.state = 1;
        //this.crdate = new java.sql.Date(new java.util.Date().getTime());
    }
    
    public Application(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return the clientId
     */
    public int getClientId() {
        return clientId;
    }

    /**
     * @return the crdate
     */
    public Date getCrdate() {
        return crdate;
    }

    /**
     * @param clientId the clientId to set
     */
    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    /**
     * @param crdate the crdate to set
     */
    public void setCrdate(Date crdate) {
        this.crdate = crdate;
    }
}
