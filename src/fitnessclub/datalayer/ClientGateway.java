package fitnessclub.datalayer;

import java.sql.Date;
import java.sql.ResultSet;

/**
 *
 * @author magni
 */
public class ClientGateway {
    public ResultSet getClientById(int id){
        return DataGateway.request("select * from client join person on person.id = client.person_id and client.id = " + id);
    }
    
    public ResultSet getAllClients(){
        return DataGateway.request("select * from client join person on person.id = client.person_id");
    }
    
    public void addClient(int person_id, Date birthdate){
        DataGateway.update("insert into client (person_id, birthdate) values (" + person_id + ",\'" + birthdate.toString() + "\')");
    }
}
