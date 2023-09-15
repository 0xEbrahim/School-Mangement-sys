import java.util.*;
public class School extends Building implements canAddStudent{
    private List<Student> students = new ArrayList<>();
    private List<Teacher> teachers= new ArrayList<>();
    private List<Workers> workers= new ArrayList<>();
    private final int numberOfFloors;

    public School(String name, String address,final int numberOfFloors) {
        super(name, address);
        this.numberOfFloors = numberOfFloors;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Workers> getWorkers() {
        return workers;
    }

    public void setWorkers(List<Workers> workers) {
        this.workers = workers;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    @Override
    public void addToSchool(Human human) {
       if(human instanceof Student)
           students.add((Student) human);
       else if(human instanceof Teacher)
           teachers.add((Teacher) human);
       else if(human instanceof Workers)
           workers.add((Workers) human);
    }


    @Override
    public Boolean CheckIfWorksAtThisSchool(Human human) {
        if(human instanceof Student)
           return students.contains((Student) human);
        else if(human instanceof Teacher)
            return teachers.contains((Teacher) human);
        else if(human instanceof Workers)
            return workers.contains((Workers) human);
        return false;
    }

    @Override
    public void printMembers(){
        System.out.println(students);
        System.out.println(teachers);
        System.out.println(workers);
    }

}
