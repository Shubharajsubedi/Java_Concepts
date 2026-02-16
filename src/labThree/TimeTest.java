package labThree;

public class TimeTest {
    public static void main(String[] args) {



        Time time = new Time();
        System.out.println("Current Time in GMT:");
        System.out.println("Hour: "+time.getHour());
        System.out.println("Minutes: "+time.getMinute());
        System.out.println("Second: "+time.getSecond());
    }
}