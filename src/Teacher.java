import java.util.*;

public class Teacher extends Human{
    private double salary;

    private String subject;

    public Teacher(String firstName, String lastName, String address, String gender, int yearOfBirth, double salary,String subject) {
        super(firstName, lastName, address, gender, yearOfBirth);
        this.salary = salary;
        this.subject = subject;


    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    @Override
    public String toString(){

        return "Teacher info : \n name : "+getFirstName() + ' ' + getLastName() + "\nAddress : "+getAddress()+"\ngender : " + getGender()+"\n" +
                "birth year : " + getYearOfBirth() + "\nsubject : " + getSubject() + "\nSalary : "+salary;
    }
}
