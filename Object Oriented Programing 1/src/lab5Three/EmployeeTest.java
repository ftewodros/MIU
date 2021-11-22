package lab5Three;

import lab5Two.Employee;

public class EmployeeTest {


        public static void main(String[] args) {
            Employee e = new Employee(34, "Jovo", "IT", 50, "Manager");
            Manager m = new Manager(34, "Ivo", "Compro", 6412, "Clerk");
            Clerk c = new Clerk(34, "Movo", "MSD", 9000000, "Clerk");

            System.out.println(c.getSalary());
            System.out.println(m.getSalary());

        }
    }


