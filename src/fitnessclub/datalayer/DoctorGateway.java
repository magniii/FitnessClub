package fitnessclub.datalayer;

/**
 *
 * @author magni
 */
public class DoctorGateway {
    public String getDoctorById(int id){
        if(id < 1){
            System.out.println("getting doctor by id error: wrong id");
            return "";
        }
        
        return DataGateway.request("select * from doctor join person on person.id = doctor.person_id and doctor.id = " + id);
    }
    
    public String getAllDoctors(){
        return DataGateway.request("select * from doctor join person on person.id = client.person_id");
    }
    
    public void addDoctor(int person_id){
        if(person_id < 1){
            System.out.println("adding doctor error: wrong person_id");
            return;
        }
        
        DataGateway.update("insert into doctor (person_id) values (" + person_id + ")");
    }
}
