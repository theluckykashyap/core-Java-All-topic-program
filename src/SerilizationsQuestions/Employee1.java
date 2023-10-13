package SerilizationsQuestions;

import java.io.Serializable;

public class Employee1 implements Serializable {

private static final long serial=-1421786158664784135L;

    private String employeeName;
    private int employeeId;
    // transient keyword we are used only for when element value can,t be save in file
  transient   private double employeeSalary;
    private  String getEmployeeProject;

    public Employee1(String employeeName, int employeeId, double employeeSalary, String getEmployeeProject) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.employeeSalary = employeeSalary;
        this.getEmployeeProject = getEmployeeProject;
    }

    public Employee1() {
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

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getGetEmployeeProject() {
        return getEmployeeProject;
    }

    public void setGetEmployeeProject(String getEmployeeProject) {
        this.getEmployeeProject = getEmployeeProject;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeId=" + employeeId +
                ", employeeSalary=" + employeeSalary +
                ", getEmployeeProject='" + getEmployeeProject + '\'' +
                '}';
    }

    void display(){
        System.out.println(this);
    }
}
