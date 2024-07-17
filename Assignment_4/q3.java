class Student {
    private static int studentNumber = 0;
    private String name;
    private int roll;
    private Address address;
    public Student(String name, int roll, String city, int pin) {
        this.name = name;
        this.roll = roll;
        this.address = new Address(city, pin);
        studentNumber++;
        System.out.println("Creating student number " + studentNumber);
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("City: " + address.getCity());
        System.out.println("Pin: " + address.getPin());
    }
    class Address {
        private String city;
        private int pin;
        public Address(String city, int pin) {
            this.city = city;
            this.pin = pin;
        }
        public String getCity() {
            return city;
        }
        public int getPin() {
            return pin;
        }
    }
}

public class q3 {
    public static void main(String[] args) {
    
        Student student1 = new Student("John", 101, "City1", 12345);
        Student student2 = new Student("Alice", 102, "City2", 56789);
        
        System.out.println("\nStudent 1 Information:");
        student1.displayInfo();
        System.out.println("\nStudent 2 Information:");
        student2.displayInfo();
    }
}
