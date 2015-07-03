package fitnessclub.datalayer;

import java.sql.ResultSet;

/**
 *
 * @author magni
 */
public class CoachClientsGateway {
    public void addClientToCoach(int client_id, int coach_id){
        if(client_id < 1){
            System.out.println("adding client to coach error: wrong client_id");
            return;
        }
        
        if(coach_id < 1){
            System.out.println("adding client to coach error: wrong coach_id");
            return;
        }
        
        DataGateway.update("insert into coachclients (client_id, coach_id) values (" + client_id + ", " + coach_id + ")");
    }
    
    public void deleteClientFromCoach(int client_id, int coach_id){
        if(client_id < 1){
            System.out.println("deleting client from coach error: wrong client_id");
            return;
        }
        
        if(coach_id < 1){
            System.out.println("deleting client from coach error: wrong coach_id");
            return;
        }
        
        DataGateway.update("delete * from coachclients where client_id = " + client_id + " and coach_id = " + coach_id);
    }
    
    public String getCoachClientsByCoachId(int coach_id){
        if(coach_id < 1){
            System.out.println("getting coach clients by coach_id error: wrong coach_id");
            return "";
        }
        
        return DataGateway.request("select * from client where id in select * from coachclients where coach_id = " + coach_id); // join?!!
    }
}
