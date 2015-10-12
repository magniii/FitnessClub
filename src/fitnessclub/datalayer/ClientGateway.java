package fitnessclub.datalayer;

import java.sql.Date;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author magni
 */
public class ClientGateway {
    public String getClientByPersonId(int personid){
        if(personid < 1){
            System.out.println("getting client by id error: wrong id");
            return "";
        }
        
        return DataGateway.request("select * from client join person on person.id = client.person_id and person.id = " + personid);
    }
    
    public String getAllClients(){
        return DataGateway.request("select * from client join person on person.id = client.person_id");
    }
    
    public int getClientIdByPersonId(int personid){
        if(personid < 1){
            System.out.println("getting client id by person id error: wrong person id");
            return -1;
        }
        
        String tmp = DataGateway.request("select id from client where person_id = " + personid);
        
        if(tmp.isEmpty()){
            return -2;
        }
        
        tmp = tmp.substring(0, tmp.length() - 1);
        
        int result = Integer.parseInt(tmp);
        
        return result;
    }
    
    public void addClient(int person_id, Date birthdate){
        if(person_id < 1){
            System.out.println("adding client error: wrong id");
            return;
        }
        
        DataGateway.update("insert into client (person_id, birthdate) values (" + person_id + ",\'" + birthdate.toString() + "\')");
    }
}
