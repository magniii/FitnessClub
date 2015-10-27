package fitnessclub.datalayer;

/**
 *
 * @author magni
 */
public class CoachGateway {
    public String getCoachByPersonId(int personid){
        if(personid < 1){
            return "";
        }
        
        return DataGateway.request("select * from coach join person on person.id = coach.person_id and person.id = " + personid);
    }
    
    public String getAllCoaches(){
        return DataGateway.request("select * from coach join person on person.id = coach.person_id");
    }
    
    public void addCoach(int person_id){
        if(person_id < 1){
            return;
        }
        
        DataGateway.update("insert into coach (person_id) values (" + person_id + ")");
    }
    
    public int getCoachIdByPersonId(int personid){
        if(personid < 1){
            return -1;
        }
        
        String tmp = DataGateway.request("select id from coach where person_id = " + personid);
        
        if(tmp.isEmpty()){
            return -2;
        }
        
        tmp = tmp.substring(0, tmp.length() - 1);
        
        int result = Integer.parseInt(tmp);
        
        return result;
    }
}
