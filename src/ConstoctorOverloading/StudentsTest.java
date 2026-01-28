package ConstoctorOverloading;

public class StudentsTest {
    static void main(String[] args) {
        Students s1 = new Students("shubharaj",12);


        Students s2 = new Students("subash",12,30.0);

        s1.Displays();
        s2.Displays();
    };
}

