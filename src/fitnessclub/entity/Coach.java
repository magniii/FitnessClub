package fitnessclub.entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author magni
 */
public class Coach extends Person{
    
    private int salary;
    private List<Integer> grades;
    
    public Coach(String forname, String surname, String login, String password, int salary) {
        super(forname, surname, login, password);
        
        this.salary = salary;
        this.grades = new ArrayList<>();
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }
    
    public void addGrade(int grade){
        this.grades.add(grade);
    }
}
