package fitnessclub.logiclayer;

import fitnessclub.datalayer.CoachClientsGateway;

/**
 *
 * @author magni
 */
public class CoachClientsLogic {
    
    CoachClientsGateway ccg = new CoachClientsGateway();
    
    public void assignClientToCoach(int clientid, int coachid){
        if((clientid < 1) || (coachid < 1)){
            return;
        }
                
        ccg.addClientToCoach(clientid, coachid);
    }
}
