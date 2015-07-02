package fitnessclub.datalayer;

import java.sql.ResultSet;

/**
 *
 * @author magni
 */
public class PersonGateway {
    public ResultSet getPersonById(int id){
        return DataGateway.request("select * from person where id = " + id);
    }
    
    public void addPerson(String forname, String surname, String login, String password){
        DataGateway.update("insert into person (forname, surname, login, password) values (\'" + 
                forname + "\', \'" + surname + "\', \'" + login + "\', \'" + password + "\')");
    }
}
