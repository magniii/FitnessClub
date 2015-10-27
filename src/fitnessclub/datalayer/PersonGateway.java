package fitnessclub.datalayer;

/**
 *
 * @author magni
 */
public class PersonGateway {

    public String getPersonById(int id) {
        if (id < 1) {
            return "";
        }

        return DataGateway.request("select * from person where id = " + id);
    }

    public int getPersonIdByLogin(String login) {
        if (login.isEmpty()) {
            return -1; // wrong login
        }

        String tmp = DataGateway.request("select id from person where login = \'" + login + "\'");
        
        if(tmp.isEmpty()){
            return -1; // no such user
        }
        
        tmp = tmp.substring(0, tmp.length() - 1);
        
        return Integer.parseInt(tmp);
    }
    
    public int checkOnline(int personid){
        if(personid < 1){
            return -1; // wrong personid
        }
        
        String tmp = DataGateway.request("select online from person where id = " + personid);
        
        if(tmp.isEmpty()){
            return -2;
        }
        
        tmp = tmp.substring(0, tmp.length() - 1);  
        int tmpint = Integer.parseInt(tmp);
        
        return tmpint;
    }
    
    public void setOnline(int personid, boolean value){
        int tmpvalue;
        
        if(value){
            tmpvalue = 1;
        }else{
            tmpvalue = 0;
        }
        
        DataGateway.update("update person set online = " + tmpvalue + " where id = " + personid);
    }

    public int authPerson(String login, String password) {
        if (login.isEmpty() || password.isEmpty()) {
            return -1; // wrong login or password
        }

        String tmp = DataGateway.request("select id from person where login = \'" + login + "\' and password = \'" + password + "\'");

        if (!tmp.isEmpty()) {
            tmp = tmp.substring(0, tmp.length() - 1);
            int personid = Integer.parseInt(tmp);

            if (personid > 0) {
                if(checkOnline(personid) == 0){
                    return personid;
                }else{
                    return -3; // user already logged in
                }
            } else {
                return -2; // no user in db
            }
        }else{
            return -2; // no user in db
        }
    }

    public int addPerson(String forname, String surname, String login, String password) {
        if (forname.isEmpty() || surname.isEmpty() || login.isEmpty() || password.isEmpty()) {
            return -1; // wrong parameters
        }

        DataGateway.update("insert into person (forname, surname, login, password, online) values (\'"
                + forname + "\', \'" + surname + "\', \'" + login + "\', \'" + password + "\', " + 0 + ")");
        
        return 0;
    }
}
