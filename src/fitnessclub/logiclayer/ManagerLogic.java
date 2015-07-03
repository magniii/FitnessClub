package fitnessclub.logiclayer;

import fitnessclub.datalayer.ApplicationGateway;
import fitnessclub.datalayer.ClientGateway;
import fitnessclub.datalayer.CoachGateway;
import fitnessclub.datalayer.DoctorGateway;
import fitnessclub.datalayer.PersonGateway;

/**
 *
 * @author magni
 */
public class ManagerLogic {
    ApplicationGateway ag = new ApplicationGateway();
    ClientGateway cg = new ClientGateway();
    PersonGateway pg = new PersonGateway();
    CoachGateway cog = new CoachGateway();
    DoctorGateway dg = new DoctorGateway();
    
    public void formDoctorRequest(int client_id){
        ag.setAppStateByClient(client_id, 3);
    }
    
    public void offerClientContract(int client_id){
        ag.setAppStateByClient(client_id, 5);
    }
    
    public void registerClient(int client_id){
        ag.setAppStateByClient(client_id, 7);
    }
    
    public void registerCoach(String forname, String surname, String login, String password){
        int person_id = 0;
        
        pg.addPerson(forname, surname, login, password);
        
        try{
            person_id = Integer.parseInt(pg.getPersonIdByLogin(login));
        }catch(NumberFormatException ex){
            System.out.println("error in registering coach: " + ex);
        }
        
        cog.addCoach(person_id);
    }
    
    public void registerDoctor(String forname, String surname, String login, String password){
        int person_id = 0;
        
        pg.addPerson(forname, surname, login, password);
        
        try{
            person_id = Integer.parseInt(pg.getPersonIdByLogin(login));
        }catch(NumberFormatException ex){
            System.out.println("error in registering doctor: " + ex);
        }
        
        dg.addDoctor(person_id);
    }
}
