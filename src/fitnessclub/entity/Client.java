package fitnessclub.entity;

import java.util.Date;

/**
 *
 * @author magni
 */
public class Client extends Person{
    private Date birthDate;

    public Client(String forname, String surname, String login, String password) {
        super(forname, surname, login, password);
        
        this.birthDate = new Date();
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    } 
}
