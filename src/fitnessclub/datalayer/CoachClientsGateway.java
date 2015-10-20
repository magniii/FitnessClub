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
    
    public String getCoachClients(int coach_id){
        if(coach_id < 1){
            return "";
        }
        
        return DataGateway.request("select id,forname,surname from person where person.id in" +
                " (select person_id from client where client.id in" +
                " (select client_id from coachclients where coachclients.coach_id = " + coach_id + "))");
    }
}
