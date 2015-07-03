package fitnessclub.datalayer;

/**
 *
 * @author magni
 */
public class CoachGateway {
    public String getCoachById(int id){
        if(id < 1){
            System.out.println("getting coach by id error: wrong id");
            return "";
        }
        
        return DataGateway.request("select * from coach join person on person.id = coach.person_id and coach.id = " + id);
    }
    
    public String getAllCoaches(){
        return DataGateway.request("select * from coach join person on person.id = coach.person_id");
    }
    
    public void addCoach(int person_id){
        if(person_id < 1){
            System.out.println("adding client error: wrong id");
            return;
        }
        
        DataGateway.update("insert into coach (person_id) values (" + person_id + ")");
    }
}
