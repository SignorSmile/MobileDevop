package com.example.lab32;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.lab32.domain.Employee;
import com.example.lab32.domain.Admin;
import com.example.lab32.domain.Director;
import com.example.lab32.domain.Manager;
import com.example.lab32.domain.Engineer;

public class EmployeeTest extends AppCompatActivity {
    private static void printEmployee(Employee emp){
        System.out.println("Employee ID: " + emp.getEmpId());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Soc Seс emp.get Ssn()); System.out.println(Employee salary:" + emp.getSalary());
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Employee emp = new Employee();
        System.out.println("Employee ID: " + emp.getEmpId());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Soc Sec " + emp.getSsn ()) ;
        System.out.println("Employee salary: " + emp.getSalary());
        Engineer eng = new Engineer(101, "Jane Smith", " 012-34 -5678", 120345.27);
        Manager mgr = new Manager(207, "Barbara Johnson", "054-12- 2367", 109501.36, "US Marketing");
        Admin adm = new Admin(304, "Bill Munroe", "108-23-2367", 75002.34);
        Director dir = new Director(12, "Susan Wheeler", "099-45-2340", 120567.36, "Global Marketing", 1000000.00);
        printEmployee(eng);
        printEmployee(mgr);
        printEmployee(adm);
        printEmployee(dir);
    }
}