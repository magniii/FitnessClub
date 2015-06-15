package fitnessclub.entity;

import java.util.Date;

/**
 *
 * @author magni
 */
public class Client extends Person{
    private Date birthDate;
    private int orderNum;
    private Coach currentCoach;

    public Client(String forname, String surname, String login, String password) {
        super(forname, surname, login, password);
        
        this.birthDate = new Date();
        this.currentCoach = null;
        this.orderNum = 0;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public Coach getCurrentCoach() {
        return currentCoach;
    }

    public void setCurrentCoach(Coach currentCoach) {
        this.currentCoach = currentCoach;
    }
    
    
}
