package org.example.hmwk1.entity;

public class Developer extends User {

    private String employeeNumber;
    public Developer(int id, String email, String password) {
        super(id, email, password);
    }

    public Developer(int id, String email, String password, String employeeNumber) {
        super(id, email, password);
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
}
