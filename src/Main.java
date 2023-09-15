import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        School school = new School("Eagles","Mansoura",5);
        while(true){
            int choice;
            System.out.println("Hello to our school management system, how can we serve you : \n1 - apply as a teacher\n2 - apply as a worker\n" +
                    "3 - add you child as a student.\n4 - Show members of school : ");
            System.out.print("Choise : ");
            choice = sc.nextInt();
                if(choice == 1){
                    System.out.println("Welcome at teachers form, please fill tour information : ");
                    String fName,lName,address,gender,subject;
                    int yearOfBirth;
                    double salary;
                    System.out.print("First Name : ");
                    fName = sc.next();
                    System.out.println();
                    System.out.print("Last Name : ");
                    lName = sc.next();
                    System.out.println();
                    System.out.print("Gender : ");
                    gender = sc.next();
                    System.out.println();
                    System.out.print("Subject : ");
                    subject = sc.next();
                    System.out.println();
                    System.out.print("Address : ");
                    address = sc.next();
                    System.out.print("yearOfBirth");
                    yearOfBirth = sc.nextInt();
                    System.out.println();
                    System.out.print("What is your expected salary : ");
                    salary = sc.nextDouble();
                    System.out.println();
                    if(school.CheckIfWorksAtThisSchool(new Teacher(fName , lName , address , gender,yearOfBirth,salary,subject))){
                        System.out.println("You are already working here ..!");
                    }else{
                        school.addToSchool(new Teacher(fName , lName , address , gender,yearOfBirth,salary,subject));
                        System.out.println("Welcome to our school ..!");
                    }
                }else if(choice == 3){
                    System.out.println("Welcome at Student form, please fill tour information : ");
                    String fName,lName,address,gender;
                    int yearOfBirth,grade;

                    System.out.print("First Name : ");
                    fName = sc.next();
                    System.out.println();
                    System.out.print("Last Name : ");
                    lName = sc.next();
                    System.out.println();
                    System.out.print("Gender : ");
                    gender = sc.next();
                    System.out.println();
                    System.out.print("Grade : ");
                    grade = sc.nextInt();
                    System.out.println();
                    System.out.print("Address : ");
                    address = sc.next();
                    System.out.print("yearOfBirth : ");
                    yearOfBirth = sc.nextInt();
                    System.out.println();
                    if(school.CheckIfWorksAtThisSchool(new Student(fName , lName , address , gender,yearOfBirth,grade))){
                        System.out.println("You are already studying here ..!");
                    }else{
                        school.addToSchool(new Student(fName , lName , address , gender,yearOfBirth,grade));
                        System.out.println("Welcome to our school ..!");
                    }
                }else if(choice == 2){
                    System.out.println("Welcome at Workes form, please fill tour information : ");
                    String fName,lName,address,gender,role;
                    int yearOfBirth;
                    double salary,bonus;

                    System.out.print("First Name : ");
                    fName = sc.next();
                    System.out.println();
                    System.out.print("Last Name : ");
                    lName = sc.next();
                    System.out.println();
                    System.out.print("Gender : ");
                    gender = sc.next();
                    System.out.println();
                    System.out.print("Address : ");
                    address = sc.next();
                    System.out.print("yearOfBirth");
                    yearOfBirth = sc.nextInt();
                    System.out.println();
                    System.out.print("What is your expected salary : ");
                    salary = sc.nextDouble();
                    System.out.println();
                    System.out.print("Expected bonus per year : ");
                    bonus = sc.nextDouble();
                    System.out.println();
                    System.out.print("Role : ");
                    role = sc.next();
                    System.out.println();
                    if(!school.getWorkers().isEmpty() && school.CheckIfWorksAtThisSchool(new Workers(fName , lName , address , gender,yearOfBirth,salary,bonus,role))){
                        System.out.println("You are already studying here ..!");
                    }else{
                        school.addToSchool(new Workers(fName , lName , address , gender,yearOfBirth,salary,bonus,role));
                        System.out.println("Welcome to our school ..!");
                    }
                }else if(choice == 4){
                    school.printMembers();
                }else{
                    System.out.println("we cannot processed your choice please try again");
                    continue;
                }

            System.out.println("You need anything else? : \n1 - Yes\n2 - No");
            System.out.println("Choice :" );
            choice = sc.nextInt();
            System.out.println();
                if(choice == 1)continue;
                if(choice == 2)break;
                else System.out.println("Not valid");
        }
    }
}