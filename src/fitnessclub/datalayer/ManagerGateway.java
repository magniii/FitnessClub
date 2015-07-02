package fitnessclub.datalayer;

import java.sql.Date;

/**
 *
 * @author magni
 */
public class ManagerGateway {
    public void addManager(int person_id){
        DataGateway.update("insert into manager (person_id) values (" + person_id + ")");
    }
}
