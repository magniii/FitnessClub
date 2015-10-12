package fitnessclub.datalayer;

import java.sql.Date;

/**
 *
 * @author magni
 */
public class ApplicationGateway {
    public void addApplication(int client_id, int state_id, Date crdate, String text){
        if(client_id < 1){
            System.out.println("adding application error: wrong client_id");
            return;
        }
        
        if((state_id < 1) && (state_id > 11)){
            System.out.println("adding application error: wrong state_id");
            return;
        }
        
        DataGateway.update("insert into application (client_id, state_id, creation_date, text) values (" + 
                client_id + ", " + state_id + ", \'" + crdate.toString() + "\', \'" + text + "\')");
    }
    
    public String getAppById(int id){
        if(id < 1){
            System.out.println("getting application by id error: wrong id");
            return "";
        }
        
        return DataGateway.request("select * from application join client on client.id = application.client_id and application.id = " + id); //join?
    }
    
    public String getAppByClientId(int client_id){
        if(client_id < 1){
            System.out.println("getting application by clientid error: wrong client_id");
            return "";
        }
        
        return DataGateway.request("select * from application join client on client.id = application.client_id and application.client_id = " + client_id);
    }
    
    public String getAppStateByClientId(int client_id){
        if(client_id < 1){
            System.out.println("getting application by clientid error: wrong client_id");
            return "";
        }
        
        return DataGateway.request("select state_id from application join client on client.id = application.client_id and application.client_id = " + client_id);
    }
    
    public void setAppStateByClient(int client_id, int state_id){
        if(client_id < 1){
            System.out.println("setting application state error: wrong client_id");
            return;
        }
        
        if((state_id < 1) && (state_id > 11)){
            System.out.println("setting application state error: wrong state_id");
            return;
        }
        
        DataGateway.update("update application set state_id = " + state_id + " where client_id = " + client_id);
    }
    
    public String getAppStateByClient(int client_id){
        if(client_id < 1){
            System.out.println("getting application state error: wrong client_id");
            return "";
        }
        
        return DataGateway.request("select app_text from application_state where id in select state_id from application where client_id = " + client_id);
    }
    
    public String getAppTextByClient(int client_id){
        if(client_id < 1){
            System.out.println("getting application text error: wrong client_id");
            return "";
        }
        
        return DataGateway.request("select text from application where client_id = " + client_id);
    }
    
    public void changeAppText(int client_id, String app_text){
        if(client_id < 1){
            System.out.println("changing application text error: wrong client_id");
            return;
        }
        
        DataGateway.update("update application set text = \'" + app_text + "\' where client_id = " + client_id);
    }
}
