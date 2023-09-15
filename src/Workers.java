public class Workers extends Human {
    private double salary,bonus;
    private String role;

    public Workers(double salary, double bonus, String role) {
        this.salary = salary;
        this.bonus = bonus;
        this.role = role;
    }

    public Workers(String firstName, String lastName, String address, String gender, int yearOfBirth, double salary, double bonus, String role) {
        super(firstName, lastName, address, gender, yearOfBirth);
        this.salary = salary;
        this.bonus = bonus;
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    @Override
    public String toString(){

        return "Worker info : \n name : "+getFirstName() + ' ' + getLastName() + "\nAddress : "+getAddress()+"\ngender : " + getGender()+"\n" +
                "birth year : " + getYearOfBirth() + "\nRole : " + role + "\nsalary ; " + salary +"\nBonus : "+bonus;
    }
}
