package fitnessclub.logiclayer;

import fitnessclub.datalayer.ApplicationGateway;
import java.sql.Date;

/**
 *
 * @author magni
 */
public class ClientLogic {
    ApplicationGateway ag = new ApplicationGateway();
    
    public void sendInitialRequest(int client_id){
        if(client_id < 1){
            System.out.println("sending initial request error: wrong client_id");
            return;
        }
        
        ag.addApplication(client_id, 1, new Date(new java.util.Date().getTime()), "");
    }
    
    public void acceptContract(int client_id){
        if(client_id < 1){
            System.out.println("sending initial request error: wrong client_id");
            return;
        }
        
        ag.setAppStateByClient(client_id, 6);
    }
    
    public void requestCoach(int client_id){
        if(client_id < 1){
            System.out.println("requesting coach error: wrong client_id");
            return;
        }
        
        ag.setAppStateByClient(client_id, 8);
    }
    
    public void fillForm(int client_id, String text){
        if(client_id < 1){
            System.out.println("filling form error: wrong client_id");
            return;
        }
        
        ag.changeAppText(client_id, text);
    }
}
