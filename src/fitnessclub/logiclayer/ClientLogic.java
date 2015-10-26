package fitnessclub.logiclayer;

import fitnessclub.datalayer.ApplicationGateway;
import fitnessclub.datalayer.ClientGateway;
import fitnessclub.entity.Client;
import java.sql.Date;

/**
 *
 * @author magni
 */
public class ClientLogic {
    ApplicationGateway ag = new ApplicationGateway();
    ClientGateway cg = new ClientGateway();
    
    public Client authClientByPersonId(int personid){
        if(personid < 1){
            return null;
        }

        Client c = new Client();
        String tmp = cg.getClientByPersonId(personid);
        
        if(tmp.isEmpty()){
            return null;
        }
        
        String[] tmpfields = tmp.split("\n");
        c.setClientId(Integer.parseInt(tmpfields[0]));
        c.setId(Integer.parseInt(tmpfields[1]));
        c.setBirthDate(java.sql.Date.valueOf(tmpfields[2]));
        c.setForname(tmpfields[4]);
        c.setSurname(tmpfields[5]);
        c.setLogin(tmpfields[6]);
        c.setPassword(tmpfields[7]);
        
        tmp = ag.getAppStateByClientId(c.getClientId());
        
        if(tmp.isEmpty()){
            return null;
        }
        
        tmp = tmp.substring(0, tmp.length() - 1);
        c.setAppstate(Integer.parseInt(tmp));
        
        return c;
    }
    
    public void sendInitialRequest(int client_id){
        if(client_id < 1){
            System.out.println("sending initial request error: wrong client_id");
            return;
        }
        
        ag.addApplication(client_id, 1, new Date(new java.util.Date().getTime()), "");
    }
    
    public void acceptContract(int client_id){
        if(client_id < 1){
            System.out.println("sending initial request error: wrong client_id");
            return;
        }
        
        ag.setAppStateByClient(client_id, 6);
    }
    
    public void requestCoach(int client_id){
        if(client_id < 1){
            System.out.println("requesting coach error: wrong client_id");
            return;
        }
        
        ag.setAppStateByClient(client_id, 8);
    }
    
    public void fillForm(int client_id, String text){
        if(client_id < 1){
            System.out.println("filling form error: wrong client_id");
            return;
        }
        
        ag.changeAppText(client_id, text);
    }
    
    public String getAllClients(){
        return cg.getAllClients();
    }
    
    public void addClient(int person_id, Date birthdate){
        if(person_id < 1){
            return;
        }
        
        cg.addClient(person_id, birthdate);
    }
    
    public int getClientId(int personid){
        if(personid < 1){
            return -1;
        }
        
        return cg.getClientIdByPersonId(personid);
    }
}
