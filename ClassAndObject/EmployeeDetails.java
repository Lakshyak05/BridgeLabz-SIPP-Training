class Employee{
    String name;
    int id;
    double salary;

    //Constructor created
    Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // method to display details
    void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("id: " + id);
        System.out.println("salary: " + salary);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
//        object created below
        Employee emp1 = new Employee("Lakshya", 3, 15000);

        // calling method to display the details
        emp1.displayDetails();
    }
}