package OOP;

public class Student {
    private String name;
    private String surname;
    private int age;
    private double gpa;
    private String university;

    public Student(String name, String surname, int age, double gpa, String university){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gpa = gpa;
        this.university = university;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        if (gpa < 0 || gpa > 5){
            System.out.println("Invalid GPA value");
        }
        return gpa;
    }

    public String getUniversity() {
        return university;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gpa=" + gpa +
                ", university='" + university + '\'' +
                '}';
    }

    public class Phone {

        private String brand;
        private String model;
        private double storage;
        private int batteryCapacity;
        private double price;
        private String color;

        public Phone(String brand, String model, double storage, int  batteryCapacity, double price, String color){
            this.brand = brand;
            this.model = model;
            this.storage = storage;
            this.batteryCapacity = batteryCapacity;
            this.price = price;
            this.color = color;
        }

        public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }

        public double getStorage() {
            return storage;
        }

        public int getBatteryCapacity() {
            return batteryCapacity;
        }

        public void setPrice(double price) {
            if (price <= 0){
                System.out.println("Invalid phone price");
            }
        }

        public String getColor() {
            return color;
        }

        @Override
        public String toString() {
            return "Phone{" +
                    "brand='" + brand + '\'' +
                    ", model='" + model + '\'' +
                    ", storage=" + storage +
                    ", batteryCapacity=" + batteryCapacity +
                    ", price=" + price +
                    ", color='" + color + '\'' +
                    '}';
        }
        public class Laptop {
            private String brand;
            private String model;
            private double price;
            private String color;

            public Laptop(String brand, String model, double price, String color) {
                this.brand = brand;
                this.model = model;
                this.price = price;
                this.color = color;

            }

            public String getBrand() {
                return brand;
            }

            public String getModel() {
                return model;
            }

            public void setPrice(double price) {
                if (price <= 0) {
                    System.out.println("Invalid laptop price ");
                }
            }

            public String getColor() {
                return color;
            }

            @Override
            public String toString() {
                return "Laptop{" +
                        "brand='" + brand + '\'' +
                        ", model='" + model + '\'' +
                        ", price=" + price +
                        ", color='" + color + '\'' +
                        '}';
            }
        }
        public class BankAccount{
            private String name;
            private String username;
            private String password;
            private String currency;

            public BankAccount(String name, String username, String password, String currency){
                this.name = name;
                this.username = username;
                this.password = password;
                this.currency = currency;

            }

            public String getName() {
                return name;
            }

            public String getUsername() {
                return username;
            }

            public String getPassword() {
                return password;
            }

            public String getCurrency() {
                return currency;
            }

            @Override
            public String toString() {
                return "BankAccount{" +
                        "name='" + name + '\'' +
                        ", username='" + username + '\'' +
                        ", password='" + password + '\'' +
                        ", currency='" + currency + '\'' +
                        '}';
            }
        }
    }
}
