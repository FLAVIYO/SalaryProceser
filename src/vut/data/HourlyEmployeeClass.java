package vut.data;

import java.text.NumberFormat;

/**
 *
 * @author
 */
public class HourlyEmployeeClass extends EmployeeClass {

    private double hourlyWage;

    public HourlyEmployeeClass(String idNumber, String name, EmployeeType employeeType, double hourlyWage) {
        super(idNumber, name, employeeType);
        setHourlyWage(hourlyWage);
    }
    
    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

   @Override
    public double weeklyPay(int hoursWorked) {
        double pay = hoursWorked * hourlyWage;
        if (hoursWorked > 40) {
            // Add overtime
            pay = pay + ((hoursWorked - 40) * 0.5) * hourlyWage;
        }
        return pay;
    }

    NumberFormat currFormat = NumberFormat.getCurrencyInstance();

    @Override
    public String toString() {
        return super.toString() + "\nHourly wage:  " + currFormat.format(hourlyWage) + "\n---------------------------------------------\n";
    }    

}
