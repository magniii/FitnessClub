package fitnessclub.logiclayer;

import fitnessclub.datalayer.DoctorGateway;

/**
 *
 * @author magni
 */
public class DoctorLogic {
    DoctorGateway dg = new DoctorGateway();
    
    public boolean authDoctorByPersonId(int personid){
        if(personid < 1){
            return false;
        }
        
        //check session here

        return !dg.getDoctorByPersonId(personid).isEmpty();
    }
    
    public String getAllDoctors(){
        return dg.getAllDoctors();
    }
    
    public void doCheck(){
        
    }
}
