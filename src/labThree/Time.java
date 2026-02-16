package labThree;

public class Time {

    private long hour;
    private long minute;
    private long second;

    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }
    public Time() {
        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;
        second = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        minute = (totalMinutes % 60);

        long totalHours = totalMinutes / 60;
        hour = (totalHours % 24);
    }
    @Override
    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}
