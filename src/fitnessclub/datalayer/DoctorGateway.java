package fitnessclub.datalayer;

import java.sql.ResultSet;

/**
 *
 * @author magni
 */
public class DoctorGateway {
    public ResultSet getDoctorById(int id){
        return DataGateway.request("select * from doctor join person on person.id = doctor.person_id and doctor.id = " + id);
    }
    
    public ResultSet getAllDoctors(){
        return DataGateway.request("select * from doctor join person on person.id = client.person_id");
    }
    
    public void addDoctor(int person_id){
        DataGateway.update("insert into doctor (person_id) values (" + person_id + ")");
    }
}
