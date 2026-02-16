package LabSeven;

public abstract class Employee {
    protected String name;
    protected int workingHoursPerWeek;

    public Employee(String name, int workingHoursPerWeek) {
        this.name = name;
        this.workingHoursPerWeek = workingHoursPerWeek;
    }

    public abstract void displayInfo();
}



interface Payable {
    double calculateSalary();
}


class FullTimeEmployee extends Employee implements Payable {
    private double monthlySalary;

    public FullTimeEmployee(String name, double monthlySalary) {
        super(name, 40);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
    @Override
    public void displayInfo() {
        System.out.println("Full Time Employee: " + name);
        System.out.println("Working Hours/Week: " + workingHoursPerWeek);
        System.out.println("Monthly Salary: " + calculateSalary());
    }

}



class PartTimeEmployee extends Employee implements Payable {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name,6);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void displayInfo() {
        System.out.println("Part Time Employee: " + name);
        System.out.println("Working Hours/Week: " + workingHoursPerWeek);
        System.out.println("Weekly Salary: " + calculateSalary());
    }
}
class Assistant extends Employee {

    public Assistant(String name) {
        super(name, 2);
    }

    @Override
    public void displayInfo() {
        System.out.println("Assistant: " + name);
        System.out.println("Working Hours/Week: " + workingHoursPerWeek);
        System.out.println("Salary: Not Payable");
    }
}
