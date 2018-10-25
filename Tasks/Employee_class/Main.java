package Employee_class;

import java.net.SocketOption;

public class Main {
    public static void main(String[] argv){
        Employee e = new Employee(1,"A","B",100000);
        System.out.println("e: id=" + e.getId() + " firstName=" + e.getFirstName() + " lastName=" + e.getLastName() + " salary=" + e.getSalary());
        System.out.println("e: name=" + e.getName() + " annualSalary=" + e.getAnnualSalary());

        System.out.println("e: newSalary=" + e.raiseSalary(10)); //110000
        System.out.println("e: " + e);
    }
}
