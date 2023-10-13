package SerilizationsQuestions;

import java.io.Serial;
import java.io.Serializable;

public class Employee implements Serializable {
    @Serial
    private static final long serialVersionUID = -1421786158664784135L;

    private String employeeName;
    private int employeeId;
   //if we are using  transient keyword. it means this filed value can,t be access in byte file
   transient private double salary;
    private String project;

    public Employee(String employeeName, int employeeId, double salary, String project) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.salary = salary;
        this.project = project;
    }

    public Employee() {
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeId=" + employeeId +
                ", salary=" + salary +
                ", project='" + project + '\'' +
                '}';
    }
    void display(){
        System.out.println("EmployeeName :"+employeeName+"  EmployeeId :"+employeeId+"  Salary :"+salary+
                salary+"  Project :"+project);
    }
}
