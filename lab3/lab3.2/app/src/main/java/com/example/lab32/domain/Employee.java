package com.example.lab32.domain;

public class Employee {
    public int getEmpId() {return empId;}
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSsn() {
        return ssn;
    }
    public double getSalary() {
        return salary;
    }
    public void raiseSalary(double increase){
        if (increase>0){
            salary += increase;
        }
    }
    private int empId;
    private String name;
    private String ssn;
    private double salary;
    public Employee() {
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }
}
