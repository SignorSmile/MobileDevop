package com.example.lab32.domain;

public class Manager extends Employee {
    private String deptName;

    public String getDeptName() {
        return deptName;
    }

    public Manager(int empId, String name, String ssn, double salary, String deptName) {
        super();
        this.deptName = deptName;
    }
}
