package fitnessclub.logiclayer;

import fitnessclub.datalayer.CoachClientsGateway;

/**
 *
 * @author magni
 */
public class CoachClientsLogic {
    
    CoachClientsGateway ccg = new CoachClientsGateway();
    
    public void assignClientToCoach(int client_id, int coach_id){
        if((client_id < 1) || (coach_id < 1)){
            return;
        }
                
        ccg.addClientToCoach(client_id, coach_id);
    }
    
    public String getCoachClients(int coach_id){
        if(coach_id < 1){
            return "";
        }
        
        return ccg.getCoachClients(coach_id);
    }
    
    public String getClientsCoach(int client_id){
        if(client_id < 1){
            return "";
        }
        
        return ccg.getClientsCoach(client_id);
    }
    
    public void deleteClientFromCoach(int client_id){
        if(client_id < 1){
            return;
        }
        
        ccg.deleteClientFromCoach(client_id);
    }
}
