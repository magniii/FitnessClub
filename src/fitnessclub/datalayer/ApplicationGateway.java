package fitnessclub.datalayer;

import java.sql.Date;

/**
 *
 * @author magni
 */
public class ApplicationGateway {
    public void addApplication(int client_id, int state_id, Date crdate, String text){
        if(client_id < 1){
            return;
        }
        
        if((state_id < 1) && (state_id > 11)){
            return;
        }
        
        DataGateway.update("insert into application (client_id, state_id, creation_date, text) values (" + 
                client_id + ", " + state_id + ", \'" + crdate.toString() + "\', \'" + text + "\')");
    }
    
    public String getAppByClientId(int client_id){
        if(client_id < 1){
            return "";
        }
        
        return DataGateway.request("select * from application join client on client.id = application.client_id and application.client_id = " + client_id);
    }
    
    public String getAppStateByClientId(int client_id){
        if(client_id < 1){
            return "";
        }
        
        return DataGateway.request("select state_id from application join client on client.id = application.client_id and application.client_id = " + client_id);
    }
    
    public void setAppStateByClient(int client_id, int state_id){
        if(client_id < 1){
            return;
        }
        
        if((state_id < 1) || (state_id > 11)){
            return;
        }
        
        DataGateway.update("update application set state_id = " + state_id + " where client_id = " + client_id);
    }
    
    public String getAppTextByClient(int client_id){
        if(client_id < 1){
            return "";
        }
        
        return DataGateway.request("select text from application where client_id = " + client_id);
    }
    
    public void changeAppText(int client_id, String app_text){
        if(client_id < 1){
            return;
        }
        
        DataGateway.update("update application set text = \'" + app_text + "\' where client_id = " + client_id);
    }
}
