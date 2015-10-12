package fitnessclub.logiclayer;

import fitnessclub.datalayer.ApplicationGateway;
import fitnessclub.datalayer.CoachGateway;
import fitnessclub.entity.Coach;

/**
 *
 * @author magni
 */
public class CoachLogic {
    ApplicationGateway ag = new ApplicationGateway();
    CoachGateway cg = new CoachGateway();
    
    public boolean authCoachByPersonId(int personid){
        if(personid < 1){
            return false;
        }
        
        //check session here

        return !cg.getCoachByPersonId(personid).isEmpty();
    }
    
    public String acceptClientRequest(int client_id){
        String result = "";
        
        ag.setAppStateByClient(client_id, 9);
        
        
        return result;
    }
    
    public String getAllCoaches(){
        return cg.getAllCoaches();
    }
    
    public void formClientProgram(){
        
    }
}
