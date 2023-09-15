public class Class extends Building {
    private int numberOfStudent;
    private int floor;

    public Class(String name, String address) {
        super(name, address);
    }

    public Class(String name, String address, int numberOfStudent, int floor) {
        super(name, address);
        this.numberOfStudent = numberOfStudent;
        this.floor = floor;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
}
