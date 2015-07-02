package fitnessclub.logiclayer;

import fitnessclub.entity.Client;
import java.util.List;

/**
 *
 * @author magni
 */
public class ManagerLogic {
    private List<Client> clients;
    
    public List<Client> showAllClients(){
        return this.clients;
    }
    
    public Client showClient(String login){
        for (Client client : clients) {
            if(client.getLogin().equals(login)){
                return client;
            }
        }
        
        return null;
    }
    
    public void registerClient(){
        
    }
    
    public void registerStaff(){
        
    }
    
    public void formDoctorRequest(){
        
    }
    
    public void countSalary(){
        
    }
}
