import java.util.List;

import java.util.*;
public class Subjects {
    private String name;
    private int numberOfHours;
    private double fullMark;
    List<Student> students = new ArrayList<Student>();

    public Subjects(String name, int numberOfHours, double fullMark, List<Student> students) {
        this.name = name;
        this.numberOfHours = numberOfHours;
        this.fullMark = fullMark;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public double getFullMark() {
        return fullMark;
    }

    public void setFullMark(double fullMark) {
        this.fullMark = fullMark;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }


}
