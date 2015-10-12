package fitnessclub.logiclayer;

import fitnessclub.datalayer.ApplicationGateway;
import fitnessclub.datalayer.ClientGateway;
import fitnessclub.datalayer.CoachGateway;
import fitnessclub.datalayer.DoctorGateway;
import fitnessclub.datalayer.ManagerGateway;
import fitnessclub.datalayer.PersonGateway;
import fitnessclub.entity.Manager;

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
    ManagerGateway mg = new ManagerGateway();
    
    public Manager authManagerByPersonId(int personid){
        if(personid < 1){
            return null;
        }

        Manager m = new Manager();
        String tmp = mg.getManagerByPersonId(personid);
        
        if(tmp.isEmpty()){
            return null;
        }
        
        String[] tmpfields = tmp.split("\n");
        m.setManager_id(Integer.parseInt(tmpfields[0]));
        m.setId(Integer.parseInt(tmpfields[2]));
        m.setForname(tmpfields[3]);
        m.setSurname(tmpfields[4]);
        
        return m;
    }
    
    public String getAllManagers(){
        return mg.getAllManagers();
    }
    
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
        person_id = pg.getPersonIdByLogin(login);
        cog.addCoach(person_id);
    }
    
    public void registerDoctor(String forname, String surname, String login, String password){
        int person_id = 0;
        
        pg.addPerson(forname, surname, login, password);
        person_id = pg.getPersonIdByLogin(login);
        dg.addDoctor(person_id);
    }
}
