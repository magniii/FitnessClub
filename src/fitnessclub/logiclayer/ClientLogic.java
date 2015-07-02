package fitnessclub.logiclayer;

import fitnessclub.datalayer.ApplicationGateway;
import fitnessclub.datalayer.ClientGateway;
import java.sql.Date;

/**
 *
 * @author magni
 */
public class ClientLogic {
    ClientGateway cg = new ClientGateway();
    ApplicationGateway ag = new ApplicationGateway();
    
    public void sendInitialRequest(int client_id){
        ag.addApplication(client_id, 1, new Date(new java.util.Date().getTime()), "");
    }
    
    public void acceptContract(int client_id, int app_id){
        
    }
    
    public void requestCoach(){
        
    }
    
    public void fillForm(String text){
        
    }
}
