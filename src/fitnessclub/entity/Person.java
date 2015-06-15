package fitnessclub.entity;

/**
 *
 * @author magni
 */
public class Person {
    protected String forname;
    protected String surname;
    protected String login;
    protected String password;

    public Person(String forname, String surname, String login, String password) {
        this.forname = forname;
        this.surname = surname;
        this.login = login;
        this.password = password;
    }
    
    public String getForname() {
        return forname;
    }

    public void setForname(String forname) {
        this.forname = forname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
