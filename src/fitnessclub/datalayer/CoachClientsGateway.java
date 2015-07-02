package fitnessclub.datalayer;

import java.sql.ResultSet;

/**
 *
 * @author magni
 */
public class CoachClientsGateway {
    public void addClientToCoach(int client_id, int coach_id){
        DataGateway.update("insert into coachclients (client_id, coach_id) values (" + client_id + ", " + coach_id + ")");
    }
    
    public void deleteClientFromCoach(int client_id, int coach_id){
        DataGateway.update("delete * from coachclients where client_id = " + client_id + " and coach_id = " + coach_id);
    }
    
    public ResultSet getCoachClients(int id){
        return DataGateway.request("select * from coachclients where id = " + id); //join
    }
}
