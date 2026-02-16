package LabSeven;

public class EmployeeTest {
    public static void main(String[] args) {

        FullTimeEmployee fte = new FullTimeEmployee("Ram", 50000);
        PartTimeEmployee pte = new PartTimeEmployee("Sita", 500, 6);
        Assistant assistant = new Assistant("Hari");

        fte.displayInfo();
        System.out.println();

        pte.displayInfo();
        System.out.println();

        assistant.displayInfo();
    }
}
