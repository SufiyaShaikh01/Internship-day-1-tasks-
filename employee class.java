package OOPs.Task_1;

public class Employee {

    //attributes
    private int id;
    private String name;
    private String department;
    private String designation;
    private double salary;

    // Constructor
    Employee(int id, String name, String department, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    // using Getter & Setter
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String getDesignation() { return designation; }
    public void setDesignation(String designation) { this.designation = designation; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }


    public void work() {
        System.out.println(String.format("%s is working as a %s at the %s department", name, designation, department));
    }

    public void updateSalary(double salary) {
        this.salary = salary;
        System.out.println("Salary Updated to " + salary);
    }

    public void displayInfo() {
        System.out.println(this.toString());
    }
    // Overriding
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", department='" + getDepartment() + '\'' +
                ", designation='" + getDesignation() + '\'' +
                ", salary=" + getSalary() +
                '}';
    }
    //using setters
    public void updateEmployee(int id, String name, String department, String designation, double salary) {
        setId(id);
        setName(name);
        setDepartment(department);
        setDesignation(designation);
        setSalary(salary);
        displayInfo();
    }
    public static void main(String[] args){

        Employee employee1 = new Employee(1,"Sufiya Shaikh", "Data Science",
                "Data Scientist", 200000);

        employee1.work();

        employee1.updateSalary(300000);

        employee1.displayInfo();
            employee1.updateEmployee(3, "Hajra Khan", "Data Science","Data Analyst", 100000);
    }
}