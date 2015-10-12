package fitnessclub.entity;

/**
 *
 * @author magni
 */
public class Doctor extends Person{
    private int doctor_id;
    
    public Doctor(String forname, String surname, String login, String password) {
        super(forname, surname, login, password);
    }
    
    public Doctor() {
        super("", "", "", "");
    }

    public int getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
    }
    
}
