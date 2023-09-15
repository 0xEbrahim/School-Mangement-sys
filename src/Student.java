public class Student extends Human{
    private int grade;
    public Student(){}

    public Student(String firstName, String lastName, String address, String gender, int yearOfBirth, int grade) {
        super(firstName, lastName, address, gender, yearOfBirth);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString(){
        return "Student info : \n name : "+getFirstName() + ' ' + getLastName() + "\nAddress : "+getAddress()+"\ngender : " + getGender()+"\n" +
                "birth year : " + getYearOfBirth() + "\ngrade : " + grade;
    }
}
