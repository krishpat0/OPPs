// Package

//  Class 
public class Employee {

    // Data Members
    private int empID = 2;
    private int basicSalary = 20000;
    private int incentive = 200;
    private String name;
    private int phoneNo = 111;

    // Member Function
    private void countSalary() {
        System.out.println("Total Salary:" + (basicSalary + incentive));
    }

    // Default Constructor (Simple)
    Employee() {
        System.out.println("Default Constructor:");
        phoneNo = 000;
        name = "username";
    }

    // Constructor with Parameter
    Employee(String name, int phoneNo) {
        System.out.println("Constructor with Parameter");
        this.name = name;
        this.phoneNo = phoneNo;

    }

    // Private Constructor

    // Copy constructor
    Employee(Employee e) {
        System.out.println("Copy Constructor:");

        e.name = name;
        e.phoneNo = phoneNo;
    }

    // getter
    int getPhoneNo() {
        return phoneNo;
    }

    String getName() {
        return name;
    }

    // setter
    int setPhoneNo(int phoneNo) {
        return this.phoneNo = phoneNo;
    }

    String setName(String name) {
        return this.name = name;
    }

}