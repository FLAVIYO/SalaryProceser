package vut.data;

import java.text.NumberFormat;

/**
 *
 * @author
 */
public class SalariedEmployeeClass extends EmployeeClass {

    private double annualSalary;

    public SalariedEmployeeClass(String idNumber, String name, EmployeeType employeeType, double annualSalary) {
        super(idNumber, name, employeeType);
        setAnnualSalary(annualSalary);
    }   

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    public double weeklyPay(int hoursWorked) {
        final int WEEKS_PER_YEAR = 52;
        double pay = annualSalary / WEEKS_PER_YEAR;
        return pay;
    }

    NumberFormat currFormat = NumberFormat.getCurrencyInstance();

    @Override
    public String toString() {
        return super.toString() + "\nAnnual salary:  " + currFormat.format(annualSalary) + "\n------------------------------------\n";
    }

   

}
