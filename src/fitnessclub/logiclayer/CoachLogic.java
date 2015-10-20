package fitnessclub.logiclayer;

import fitnessclub.datalayer.ApplicationGateway;
import fitnessclub.datalayer.CoachGateway;
import fitnessclub.entity.Coach;

/**
 *
 * @author magni
 */
public class CoachLogic {
    ClientLogic cl = new ClientLogic();
    ApplicationGateway ag = new ApplicationGateway();
    CoachGateway cg = new CoachGateway();
    
    public Coach authCoachByPersonId(int personid){
        if(personid < 1){
            return null;
        }

        Coach c = new Coach();
        String tmp = cg.getCoachByPersonId(personid);
        
        if(tmp.isEmpty()){
            return null;
        }
        
        String[] tmpfields = tmp.split("\n");
        c.setCoach_id(Integer.parseInt(tmpfields[0]));
        c.setId(Integer.parseInt(tmpfields[2]));
        c.setForname(tmpfields[3]);
        c.setSurname(tmpfields[4]);
        
        return c;
    }
    
    public void acceptClientRequest(int person_id){
        if(person_id < 1){
            return;
        }
        
        int client_id = cl.getClientId(person_id);
        
        ag.setAppStateByClient(client_id, 9);
    }
    
    public String getAllCoaches(){
        return cg.getAllCoaches();
    }
    
    public void createClientProgram(String programText){
        
    }
}
