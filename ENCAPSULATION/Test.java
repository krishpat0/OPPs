// import MyPackage1.MyClass;

public class Test {

    public static void main(String[] args) {
        System.out.println("Test Class");

        // accessing employee details from Employee.java file

        // Creating Object with parameterize constructor
        Employee emp = new Employee("krishna", 777);

        // Setter update default value
        // emp.setName("Raj");
        // emp.setPhoneNo(666);

        // Getter return value
        System.out.println(emp.getName());
        System.out.println(emp.getPhoneNo());

        // Creating Object with Default constructor
        Employee emp1 = new Employee();
        emp1.setPhoneNo(555);
        System.out.println(emp1.getName());
        System.out.println(emp1.getPhoneNo());

        // creating object of myclass.java from MyPackage1
        // MyClass mc = new MyClass();
        // mc.print();

        // copy constructor object
        Employee copyemp = new Employee(emp1);
        System.out.println(copyemp.getName());

    }
}
