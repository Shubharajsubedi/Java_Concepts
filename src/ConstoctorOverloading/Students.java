package ConstoctorOverloading;

public class Students {
    String name ;
    int rollnumber;
    double grade;

    Students(String name,int rollnumber){
        this.name = name;
        this.rollnumber = rollnumber;

    }

    Students(String name,int rollnumber,double grade){
        this.name = name;
        this.rollnumber = rollnumber;
        this.grade = grade;
    }

    void Displays (){
        System.out.println("The name of the student is :"+name);
        System.out.println("The rollnumber of the student is "+rollnumber);
        System.out.println("The grade is :"+grade);


    }
}
