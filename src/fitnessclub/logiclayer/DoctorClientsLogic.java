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
}
