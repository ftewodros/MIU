package lab5Three;

import lab5Two.Employee;

public class Manager extends Employee{

        public Manager(int employeeId, String name, String department, double salary, String position) {
            super(employeeId, name, department, salary, position);
        }

        @Override
        public double addBonus() {
            return super.getSalary() + 300;
        }

        @Override
        public void printEmployeeDetails() {
            super.printEmployeeDetails();
            System.out.println("were a manager");
        }


    }


