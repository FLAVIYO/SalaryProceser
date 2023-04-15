package vut.data;

import java.text.NumberFormat;

/**
 *
 * @author
 */
public class ManagerClass extends SalariedEmployeeClass {

    private double weeklyBonus;

    public ManagerClass(String idNumber, String name, EmployeeType employeeType, double annualSalary, double weeklyBonus) {
        super(idNumber, name, employeeType, annualSalary);
        setWeeklyBonus(weeklyBonus);
    }

    public double getWeeklyBonus() {
        return weeklyBonus;
    }

    public void setWeeklyBonus(double weeklyBonus) {
        this.weeklyBonus = weeklyBonus;
    }

    @Override
    public double weeklyPay(int hoursWorked) {
         double pay;       
         pay = super.weeklyPay(hoursWorked) + weeklyBonus;
        return pay;
    }
    NumberFormat currFormat = NumberFormat.getCurrencyInstance();

    @Override
    public String toString() {
        return super.toString() + "Weekly Bonus: " + currFormat.format(weeklyBonus) + "\n********************************\n";
    }

    
}
