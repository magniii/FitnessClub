package fitnessclub.entity;

import java.sql.Date;

/**
 *
 * @author magni
 */
public class Client extends Person{
    private int client_id;
    private Date birthDate;
    private int appstate;

    public Client(String forname, String surname, String login, String password) {
        super(forname, surname, login, password);
    }
    
    public Client(){
        super("","","","");
    }
    
    public int getClientId(){
        return client_id;
    }
    
    public void setClientId(int _id){
        client_id = _id;
    }
    
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }     

    /**
     * @return the appstate
     */
    public int getAppstate() {
        return appstate;
    }

    /**
     * @param appstate the appstate to set
     */
    public void setAppstate(int appstate) {
        this.appstate = appstate;
    }
}
