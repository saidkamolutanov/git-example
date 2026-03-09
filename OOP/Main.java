package OOP;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Saidkamol", "Shamsudinov", 16, 4.2, "Toshkent davlat iqtisodiyot universiteti");

        System.out.println(student);



        Student.Phone phone = student.new Phone("Samsung", "Galaxy A16", 256, 5000, 200, "Black");

        System.out.println(phone);


        Student.Phone.Laptop laptop = phone.new Laptop("Dell", "Latitude 5401", 200, "  Black");
        System.out.println(laptop);
    }
}
