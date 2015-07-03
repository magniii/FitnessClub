package fitnessclub.datalayer;

import java.sql.Date;

/**
 *
 * @author magni
 */
public class ClientGateway {
    public String getClientById(int id){
        if(id < 1){
            System.out.println("getting client by id error: wrong id");
            return "";
        }
        
        return DataGateway.request("select * from client join person on person.id = client.person_id and client.id = " + id);
    }
    
    public String getAllClients(){
        return DataGateway.request("select * from client join person on person.id = client.person_id");
    }
    
    public void addClient(int person_id, Date birthdate){
        if(person_id < 1){
            System.out.println("adding client error: wrong id");
            return;
        }
        
        DataGateway.update("insert into client (person_id, birthdate) values (" + person_id + ",\'" + birthdate.toString() + "\')");
    }
}
