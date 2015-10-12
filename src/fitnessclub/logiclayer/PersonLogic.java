package fitnessclub.logiclayer;

import fitnessclub.Util;
import fitnessclub.datalayer.PersonGateway;

/**
 *
 * @author magni
 */
public class PersonLogic {
    PersonGateway pg = new PersonGateway();
    
    public int authPerson(String login, String password){
        return pg.authPerson(login, password);
    }
    
    public void logOn(int personid){
        pg.setOnline(personid, true);
        Util.currPersonOnline = personid;
    }
    
    public void logOff(int personid){
        pg.setOnline(personid, false);
        Util.currPersonOnline = 0;
    }
    
    public int addPerson(String forname, String surname, String login, String password){
        if (forname.isEmpty() || surname.isEmpty() || login.isEmpty() || password.isEmpty()) {
            return -1; // wrong parameters
        }
        
        pg.addPerson(forname, surname, login, password);
        
        return 0;
    }
    
    public int getPersonIdByLogin(String login){
        return pg.getPersonIdByLogin(login);
    }
}
