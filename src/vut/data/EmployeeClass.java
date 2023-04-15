package vut.data;

import java.util.ArrayList;

/**
 * @An employee with a name ana employee no ad a mechanism for computing weekly pay
 * 
 * @author Mrs S Moyo
 */
public abstract class EmployeeClass {
    public enum EmployeeType {
        SALARIED, HOURLY, MANAGER
    }
    private String idNumber, name;
    private EmployeeType employeeType;
    

    public EmployeeClass() {
    }

    public EmployeeClass(String idNumber, String name, EmployeeType employeeType) {
        setIdNumber(idNumber);
        setName(name);
        setEmployeeType(employeeType);
    }   

    public EmployeeType getEmployeeType() {
        return employeeType;
    }
    /**
     * Gets the name of this employee.
     * @return the name
     */

    public String getName() {
        return name;
    }     

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }
    
    /**
     * Computes the pay for one week of work.
     * @param hoursWorked the number of hours worked in the week
     * @return the pay for the given number of hours
    */
    
    public abstract double weeklyPay(int hoursWorked);

//    public double weeklyPay(int hoursWorked) {
//        double pay = 0;
//        return pay;
//    }

    @Override
    public String toString() {
       return "Employee ID:\t" + idNumber + "\nEmployee name: " + name + "\nEmployee Type:\t" + employeeType;
    }    

}
