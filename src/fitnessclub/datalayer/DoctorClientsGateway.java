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
}
