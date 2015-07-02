package fitnessclub;

import fitnessclub.datalayer.ClientGateway;
import fitnessclub.datalayer.DataGateway;
import fitnessclub.datalayer.PersonGateway;
import java.sql.Date;

/**
 *
 * @author magni
 */
public class FitnessClub {

    public static void main(String[] args) {
        DataGateway.initdb();
        DataGateway.connect();
        
        //PersonGateway pg = new PersonGateway();
        //ClientGateway cg = new ClientGateway();
        //cg.addClient(1, new Date(new java.util.Date().getTime()));
        
        DataGateway.close();
    }
    
}
