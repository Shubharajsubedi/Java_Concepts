package labThree;

import java.util.Arrays;

public class TimeArrayTest {
    public static void main(String[] args) throws InterruptedException {

        Time[] times = new Time[5];

        for (int i = 0; i < times.length; i++) {
            times[i] = new Time();
            System.out.println(times[i]);
            Thread.sleep(5000);
        }
        System.out.println(Arrays.toString(times));
    }
}
