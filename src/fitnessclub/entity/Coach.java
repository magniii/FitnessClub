package fitnessclub.entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author magni
 */
public class Coach extends Person{
    private int coach_id;
    
    public Coach(String forname, String surname, String login, String password) {
        super(forname, surname, login, password);
    }
    
    public Coach(){
        super("", "", "", "");
    }

    public int getCoach_id() {
        return coach_id;
    }

    public void setCoach_id(int coach_id) {
        this.coach_id = coach_id;
    }
}
