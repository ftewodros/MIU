package lab5Two;

public class Employee {
        int  employeeId;
        String  name;
        String  department;
        double  salary;
        String  position;



        public Employee(int employeeId, String name, String department, double salary, String position) {
            super();
            this.employeeId = employeeId;
            this.name = name;
            this.department = department;
            this.salary = salary;
            this.position = position;
        }

        public int getEmployeeId() {
            return employeeId;
        }
        public String getName() {
            return name;
        }
        public String getDepartment() {
            return department;
        }
        public double getSalary() {
            return salary;
        }
        public String getPosition() {
            return position;
        }
        public void setEmployeeId(int employeeId) {
            this.employeeId = employeeId;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setDepartment(String department) {
            this.department = department;
        }
        public void setSalary(double salary) {
            this.salary = salary;
        }
        public void setPosition(String position) {
            this.position = position;
        }

        public double addBonus () {
            return salary +200;
        }

        @Override
        public boolean equals(Object obj) {
            if(obj== null) return false;
            if(!(obj instanceof Employee)) return false;
            Employee e = (Employee) obj;
            return position.equals(e.position);
        }

        public void printEmployeeDetails() {
            System.out.println(employeeId + ", " + name + ", " + department +", " + addBonus() + ", " + position);
        }
    }


