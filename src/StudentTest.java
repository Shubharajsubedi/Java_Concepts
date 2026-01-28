public class StudentTest {
    static void main(String[] args) {
        Student std1 = new Student();
        std1.name ="Shubharaj";
        std1.rollNum = 21;
        std1.address="Dolakha";
        std1.email = "shubharajsubedi7@gamil.com";
        std1.age=22;

        System.out.println("First student name is "+std1.name);
        System.out.println("His rollnumber is :"+std1.rollNum);
        System.out.println("He is from::"+std1.address);
        System.out.println("Contact him if any confuse::"+std1.email);
        System.out.println("He is energetic and powerful Because he is "+std1.age+"years old");
        std1.study("You can Win");
        std1.play("Football");
        std1.college();

        System.out.println("------------------------------------------");


        Student std2 = new Student();
        std2.name ="Adam";
        std2.rollNum = 22;
        std2.address="Dolalghat";
        std2.email = "adam7@gamil.com";
        std2.age=29;
        std2.study("Quantum Physics");
        std2.play("Cricket");
        std2.college();


    }
}
