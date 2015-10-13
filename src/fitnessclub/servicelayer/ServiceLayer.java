package fitnessclub.servicelayer;

import fitnessclub.datalayer.ApplicationGateway;
import fitnessclub.entity.Client;
import fitnessclub.entity.Coach;
import fitnessclub.entity.Doctor;
import fitnessclub.entity.Manager;
import fitnessclub.logiclayer.ClientLogic;
import fitnessclub.logiclayer.CoachClientsLogic;
import fitnessclub.logiclayer.CoachLogic;
import fitnessclub.logiclayer.DoctorLogic;
import fitnessclub.logiclayer.ManagerLogic;
import fitnessclub.logiclayer.PersonLogic;
import java.sql.Date;
import java.time.LocalDate;
import java.util.StringTokenizer;
import javax.swing.DefaultListModel;

/**
 *
 * @author magni
 */
public class ServiceLayer {
    public PersonLogic pl; 
    public ClientLogic cl;
    public DoctorLogic dl;
    public ManagerLogic ml;
    public CoachLogic col;
    public ApplicationGateway ag;
    public CoachClientsLogic ccl;

    public ServiceLayer() {
        this.pl = new PersonLogic();
        this.cl = new ClientLogic();
        this.col = new CoachLogic();
        this.ml = new ManagerLogic();
        this.dl = new DoctorLogic();
        this.ag = new ApplicationGateway();
        this.ccl = new CoachClientsLogic();
    }
    
    public Object checkAuth(String login, String password){
        int personid = pl.authPerson(login, password);
        
        if((personid == -1) || (personid == -2) || (personid == -3)){
            return (Integer)personid;
        }
        
        pl.logOn(personid);
        
        if(cl.authClientByPersonId(personid) != null){
            return cl.authClientByPersonId(personid);
//        }else if(col.authCoachByPersonId(personid) != null){
//            col.authCoachByPersonId(personid)
//        }else if(dl.authDoctorByPersonId(personid) != null){
//            dl.authDoctorByPersonId(personid)
        }else if(ml.authManagerByPersonId(personid) != null){
            return ml.authManagerByPersonId(personid);
        }else{
            return (Integer)(-2); // no user in db
        }
    }
    
    public void createNewClient(Client c){
        if(c == null){
            return;
        }
        
        pl.addPerson(c.getForname(), c.getSurname(), c.getLogin(), c.getPassword());
        
        int personid = pl.getPersonIdByLogin(c.getLogin());
        
        if(personid == -1){
            return;
        }
        
        cl.addClient(personid, c.getBirthDate());
        int clientid = cl.getClientId(personid);
        ag.addApplication(clientid, 1, Date.valueOf(LocalDate.now()), "");
        
    }
    
    public void createNewCoach(Coach c){
        if(c == null){
            return;
        }
        
        pl.addPerson(c.getForname(), c.getSurname(), c.getLogin(), c.getPassword());
        
        int personid = pl.getPersonIdByLogin(c.getLogin());
        
        if(personid == -1){
            return;
        }
        
        /////////////////////////////////////////////////////
    }
    
    public void createNewDoctor(Doctor d){
        if(d == null){
            return;
        }
        
        pl.addPerson(d.getForname(), d.getSurname(), d.getLogin(), d.getPassword());
        
        int personid = pl.getPersonIdByLogin(d.getLogin());
        
        if(personid == -1){
            return;
        }
        
        /////////////////////////////////////////////////////////////
    } 
    
    public void createNewManager(Manager m){
        if(m == null){
            return;
        }
        
        pl.addPerson(m.getForname(), m.getSurname(), m.getLogin(), m.getPassword());
        
        int personid = pl.getPersonIdByLogin(m.getLogin());
        
        if(personid == -1){
            return;
        }
        
        /////////////////////////////////////////////////////////////
    }
    
    public DefaultListModel<String> parseAllStaff(){
        DefaultListModel<String> dlm = new DefaultListModel<>();
        String tmp;

        String str = col.getAllCoaches();
        StringTokenizer stkn = new StringTokenizer(str, "\n");

        while (stkn.hasMoreTokens()) {
            tmp = "Coach: " + stkn.nextToken() + " ";
            stkn.nextToken();
            stkn.nextToken();
            tmp = tmp + stkn.nextToken() + " " + stkn.nextToken();
            dlm.addElement(tmp);
            stkn.nextToken();
            stkn.nextToken();
            stkn.nextToken();
        }

        str = dl.getAllDoctors();
        stkn = new StringTokenizer(str, "\n");

        while (stkn.hasMoreTokens()) {
            tmp = "Doctor: " + stkn.nextToken() + " ";
            stkn.nextToken();
            stkn.nextToken();
            tmp = tmp + stkn.nextToken() + " " + stkn.nextToken();
            dlm.addElement(tmp);
            stkn.nextToken();
            stkn.nextToken();
            stkn.nextToken();
        }
        
        str = ml.getAllManagers();
        stkn = new StringTokenizer(str, "\n");

        while (stkn.hasMoreTokens()) {
            tmp = "Manager: " + stkn.nextToken() + " ";
            stkn.nextToken();
            stkn.nextToken();
            tmp = tmp + stkn.nextToken() + " " + stkn.nextToken();
            dlm.addElement(tmp);
            stkn.nextToken();
            stkn.nextToken();
            stkn.nextToken();
        }
        
        return dlm;
    }
    
    public DefaultListModel<String> parseAllCoaches(){
        DefaultListModel<String> dlm = new DefaultListModel<>();
        String tmp;

        String str = col.getAllCoaches();
        StringTokenizer stkn = new StringTokenizer(str, "\n");

        while (stkn.hasMoreTokens()) {
            tmp = stkn.nextToken() + " ";
            stkn.nextToken();
            stkn.nextToken();
            tmp = tmp + stkn.nextToken() + " " + stkn.nextToken();
            dlm.addElement(tmp);
            stkn.nextToken();
            stkn.nextToken();
            stkn.nextToken();
        }
        
        return dlm;
    }
    
    public DefaultListModel<String> parseAllClients() {
        DefaultListModel<String> dlm = new DefaultListModel<>();
        String tmp;

        String str = cl.getAllClients();
        StringTokenizer stkn = new StringTokenizer(str, "\n");

        while (stkn.hasMoreTokens()) {
            tmp = stkn.nextToken() + " ";
            stkn.nextToken();
            stkn.nextToken();
            stkn.nextToken();
            tmp = tmp + stkn.nextToken() + " " + stkn.nextToken();
            dlm.addElement(tmp);
            stkn.nextToken();
            stkn.nextToken();
            stkn.nextToken();
        }

        return dlm;
    }
    
    public void assignClientToCoach(int client_id, int coach_id){
        if((client_id < 1) || (coach_id < 1)){
            return;
        }
        
        ccl.assignClientToCoach(client_id, coach_id);
    }
}
