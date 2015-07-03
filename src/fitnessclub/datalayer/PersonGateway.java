package fitnessclub.datalayer;

/**
 *
 * @author magni
 */
public class PersonGateway {
    public String getPersonById(int id){
        if(id < 1){
            System.out.println("getting person error: wrong id");
            return "";
        }
        
        return DataGateway.request("select * from person where id = " + id);
    }
    
    public String getPersonIdByLogin(String login){
        if(login.isEmpty()){
            System.out.println("getting person error: wrong login");
            return "";
        }
        
        return DataGateway.request("select id from person where login = \'" + login + "\'");
    }
    
    public void addPerson(String forname, String surname, String login, String password){
        if(forname.isEmpty() || surname.isEmpty() || login.isEmpty() || password.isEmpty()){
            System.out.println("adding person error: wrong parameters");
            return;
        }
        
        DataGateway.update("insert into person (forname, surname, login, password) values (\'" + 
                forname + "\', \'" + surname + "\', \'" + login + "\', \'" + password + "\')");
    }
}
