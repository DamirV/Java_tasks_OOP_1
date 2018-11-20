package Employee_class;

import java.util.Arrays;
import java.util.Objects;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public String getName(){
        return firstName + " " + lastName;
    }

    public int getAnnualSalary(){
        return 12*salary;
    }

    public int raiseSalary(int percent){
        this.salary = this.salary * (100+percent)/100;
        return this.salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + this.getName() + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }

        if(o == null ||!(o instanceof Employee)){
            return false;
        }

        Employee that = (Employee) o;
        return id == that.id && salary == that.salary && Objects.equals(firstName,that.firstName) && Objects.equals(lastName, that.lastName);
    }

    @Override
    public int hashCode(){
        int res = 17;
        res = 31 * res + id;
        res = 31 * res + salary;
        res = 31 * res + firstName.hashCode();
        res = 31 * res + lastName.hashCode();

       return res;
    }
}
