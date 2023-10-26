import java.util.Scanner;

class Student {
    String first_name;
    String middle_name;
    String last_name;
    String suffix;

    public Student() {
    

    }
    

    public String getfirstName() {
        return first_name;
    }

    public String getmiddleName() {
        return middle_name;
    }

    public String getLastName() {
        return last_name;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setfirstName(String firstName) {
        this.first_name = firstName;
    }

    public void setmiddleName(String middleName) {
        this.middle_name = middleName;
    }

    public void setLastName(String LastName) {
        this.last_name = LastName;
    }

    public void setsuffix(String Suffix) {
        this.suffix = Suffix;
    }
    public String getFullName() {
           return first_name + " " + middle_name + " " + last_name + " " + suffix;
         
    } 


}

class Interface {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student s = new Student();

        System.out.print("First Name: ");
        s.setfirstName(scan.nextLine());
        System.out.print("Middle Name: ");
        s.setmiddleName(scan.nextLine());
        System.out.print("Last Name: ");
        s.setLastName(scan.nextLine());
        System.out.print("Suffix: ");
        s.setsuffix(scan.nextLine());



        System.out.println("First Name: " + s.getfirstName());
        System.out.println("Middle Name:  " + s.getmiddleName());
        System.out.println("Last Name: " + s.getLastName());
        System.out.println("suffix:" + s.getSuffix());
        System.out.print("Full Name: " + s.getFullName());

      
                
    }
}
