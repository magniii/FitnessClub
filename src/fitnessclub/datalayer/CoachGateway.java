package fitnessclub.datalayer;

import java.sql.ResultSet;

/**
 *
 * @author magni
 */
public class CoachGateway {
    public ResultSet getCoachById(int id){
        return DataGateway.request("select * from coach join person on person.id = coach.person_id and coach.id = " + id);
    }
    
    public ResultSet getAllCoaches(){
        return DataGateway.request("select * from coach join person on person.id = coach.person_id");
    }
    
    public void addCoach(int person_id){
        DataGateway.update("insert into coach (person_id) values (" + person_id + ")");
    }
}
