package fitnessclub.logiclayer;

import fitnessclub.datalayer.DoctorClientsGateway;

/**
 *
 * @author magni
 */
public class DoctorClientsLogic {
    DoctorClientsGateway dcg = new DoctorClientsGateway();
    
    public String getDoctorClients(int doctor_id){
        if(doctor_id < 1){
            return "";
        }
        
        return dcg.getDoctorClients(doctor_id);
    }
    
    public void addClientToDoctor(int doctor_id, int client_id){
        if((doctor_id < 1) || (client_id < 1)){
            return;
        }
        
        dcg.addClientToDoctor(doctor_id, client_id);
    }
}
