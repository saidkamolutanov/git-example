package OOP;

public class Employee {

    String firstname;
    String lastsurname;

    public void show(){
        System.out.println("Employee");
    }

    public String getDetails(){
        return "Hi ";
    }

    @Override
    public String toString() {
        return "Hi !";
    }
}
