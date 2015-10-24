package fitnessclub.datalayer;

/**
 *
 * @author magni
 */
public class DoctorClientsGateway {
    public String getDoctorClients(int doctor_id){
        if(doctor_id < 1){
            return "";
        }
        
        return DataGateway.request("select id,forname,surname from person where person.id in "
                + "(select person_id from client where id in "
                + "(select client_id from doctorclients where doctor_id = " + doctor_id + "))");
        
    }
    
    public void addClientToDoctor(int doctor_id, int client_id){
        if((doctor_id < 1) || (client_id < 1)){
            return;
        }
        
        DataGateway.update("insert into doctorclients (client_id, doctor_id) values (" + client_id + ", " + doctor_id + ")");
    }
    
    public void deleteClientFromDoctor(int client_id, int doctor_id){
        if((client_id < 1) || (doctor_id < 1)){
            return;
        }
        
        DataGateway.update("delete * from doctorclients where client_id = " + client_id + " and doctor_id = " + doctor_id);
    }
}
