package lab5Three;

import lab5Two.Employee;

public class Clerk extends Employee {

        public Clerk(int employeeId, String name, String department, double salary, String position) {
            super(employeeId, name, department, salary, position);
        }

        @Override
        public double addBonus() {
            return super.getSalary() + 100;
        }

    @Override
    public void printEmployeeDetails() {
        super.printEmployeeDetails();
        System.out.println("is a clerk");
    }
}


