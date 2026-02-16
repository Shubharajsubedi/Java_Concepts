package LabSix;

public class TestingPerson {

    public static void main(String[] args) {

        Student s = new Student("Ram", "Kathmandu", "9800980870", "ram@gmail.com", Status.SENIOR);


        Faculty f = new Faculty("Shyam", "Lalitpur", "9814197121", "shyam@gmail.com", "Block B",
                80000, new MyDate(2025, 5, 10), "6:30AM - 2:30PM", "Lecturer");


        FullTimeStaff ft = new FullTimeStaff("Sita", "New Baneshwor", "9824252328", "sita@gmail.com", "Block A", 40000,
                new MyDate(2024, 3, 15), "Administrator");

        PartTimeStaff pt = new PartTimeStaff("Gita", "Bhaktapur", "9833660031", "gita@gmail.com", "Block c",
                new MyDate(2022, 7, 1), "Assistant", 120, 500);

        System.out.println(s);
        System.out.println(f);
        System.out.println(ft);
        System.out.println(pt);
    }
}
