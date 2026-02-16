package labThree;

import java.util.GregorianCalendar;

public class TestGeorgianCalendar {
    public static void main(String[] args) {

        GregorianCalendar calendar = new GregorianCalendar();

        int year = calendar.get(GregorianCalendar.YEAR);
        int month = calendar.get(GregorianCalendar.MONTH);
        int day = calendar.get(GregorianCalendar.DATE);

        System.out.println("Current Year : " + year);
        System.out.println("Current Month : " + (month + 1));
        System.out.println("Current Day : " + day);

    }
}