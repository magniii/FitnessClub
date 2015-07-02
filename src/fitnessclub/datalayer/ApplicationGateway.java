package fitnessclub.datalayer;

import java.sql.Date;
import java.sql.ResultSet;

/**
 *
 * @author magni
 */
public class ApplicationGateway {
    public void addApplication(int client_id, int state_id, Date crdate, String text){
        DataGateway.update("insert into application (client_id, state_id, creation_date, text) values (" + 
                client_id + ", " + state_id + ", \'" + crdate.toString() + "\', \'" + text + "\')");
    }
    
    public ResultSet getAppById(int id){
        return DataGateway.request("select * from application join client on client.id = application.client_id and application.id = " + id); //join?
    }
    
    public ResultSet getAppByClient(int client_id){
        return DataGateway.request("select * from application join client on client.id = application.client_id and application.client_id = " + client_id);
    }
    
    public void setAppStateByClient(int client_id, int state_id){
        DataGateway.update("update application set state_id = " + state_id + " where client_id = " + client_id);
    }
}
