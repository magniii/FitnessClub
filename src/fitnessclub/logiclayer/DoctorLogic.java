package fitnessclub.logiclayer;

import fitnessclub.datalayer.ApplicationGateway;
import fitnessclub.datalayer.DoctorGateway;
import fitnessclub.entity.Doctor;

/**
 *
 * @author magni
 */
public class DoctorLogic {
    DoctorGateway dg = new DoctorGateway();
    ClientLogic cl = new ClientLogic();
    ApplicationGateway ag = new ApplicationGateway();
    
    public Doctor authDoctorByPersonId(int personid){
        if(personid < 1){
            return null;
        }

        Doctor d = new Doctor();
        String tmp = dg.getDoctorByPersonId(personid);
        
        if(tmp.isEmpty()){
            return null;
        }
        
        String[] tmpfields = tmp.split("\n");
        d.setDoctor_id(Integer.parseInt(tmpfields[0]));
        d.setId(Integer.parseInt(tmpfields[2]));
        d.setForname(tmpfields[3]);
        d.setSurname(tmpfields[4]);
        
        return d;
    }
    
    public String getAllDoctors(){
        return dg.getAllDoctors();
    }
    
    public void checkClient(int personid){
        if(personid < 1){
            return;
        }
        
        int tmpclientid = cl.getClientId(personid);
        String tmpstr = ag.getAppStateByClientId(tmpclientid);
        tmpstr = tmpstr.substring(0, tmpstr.length() - 1);
        int tmpappstate = Integer.parseInt(tmpstr);
        
        if(tmpappstate == 3){
            tmpappstate += 1;
        } 
        
        ag.setAppStateByClient(tmpclientid, tmpappstate);
    }
}
