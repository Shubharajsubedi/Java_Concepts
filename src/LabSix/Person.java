package LabSix;

class Person {
    String name;
    String address;
    String phone;
    String email;

    Person(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person Name: " + name;
    }
}

enum Status {
    FRESHMAN, SOPHOMORE, JUNIOR, SENIOR}

class Student extends Person {
    Status status;
    Student(String name, String address, String phone, String email, Status status) {
        super(name, address, phone, email);
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student Name: " + name;
    }
}

class MyDate {
    int year;
    int month;
    int day;

    MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }
}
class Employee extends Person {
    String office;
    double salary;
    MyDate dateHired;

    Employee(String name, String address, String phone, String email,
             String office, double salary, MyDate dateHired) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Employee Name: " + name;
    }
}
class Faculty extends Employee {
    String officeHours;
    String rank;

    Faculty(String name, String address, String phone, String email,
            String office, double salary, MyDate dateHired,
            String officeHours, String rank) {
        super(name, address, phone, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty Name: " + name;
    }
}
class Staff extends Employee {
    String title;

    Staff(String name, String address, String phone, String email,
          String office, double salary, MyDate dateHired, String title) {
        super(name, address, phone, email, office, salary, dateHired);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff Name: " + name;
    }

}
class FullTimeStaff extends Staff {

    FullTimeStaff(String name, String address, String phone, String email,
                  String office, double salary, MyDate dateHired, String title) {
        super(name, address, phone, email, office, salary, dateHired, title);
    }

    double calculateEarning() {
        return salary;
    }

    @Override
    public String toString() {
        return "FullTime Staff Name: " + name + ", Earning = " + calculateEarning();
    }
}
class PartTimeStaff extends Staff {
    int workedHours;
    double hourlyRate;

    PartTimeStaff(String name, String address, String phone, String email,
                  String office, MyDate dateHired, String title,
                  int workedHours, double hourlyRate) {
        super(name, address, phone, email, office, 0, dateHired, title);
        this.workedHours = workedHours;
        this.hourlyRate = hourlyRate;
    }

    double calculateEarning() {
        return workedHours * hourlyRate;
    }

    @Override
    public String toString() {
        return "PartTime Staff Name: " + name + ", Earning = " + calculateEarning();
    }
}
