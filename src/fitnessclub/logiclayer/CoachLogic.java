package fitnessclub.logiclayer;

import fitnessclub.datalayer.ApplicationGateway;

/**
 *
 * @author magni
 */
public class CoachLogic {
    ApplicationGateway ag = new ApplicationGateway();
    
    public String acceptClientRequest(int client_id){
        String result = "";
        
        ag.setAppStateByClient(client_id, 9);
        
        
        return result;
    }
    
    public void formClientProgram(){
        
    }
}
