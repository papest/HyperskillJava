package repetition.timefactory;

import java.util.Scanner;

class Time {

    int hour;
    int minute;
    int second;


    final static Time NOON = of(12, 0, 0);
    final static Time MIDNIGHT = ofSeconds(0);
    public static Time noon() {
        return NOON;
    }

    public static Time midnight() {
        return MIDNIGHT;
    }

    public static Time ofSeconds(long seconds) {
        int second = (int) (seconds % 60);
        int minute = (int) (seconds / 60 % 60);
        int hour = (int) (seconds / 3600 % 24);
        return of(hour, minute, second);
    }

    public static Time of(int hour, int minute, int second) {
        Time time = new Time();
        if (hour < 24 && hour > -1 && minute > -1 && minute < 60 && second > -1 && second < 60) {
            time.second = second;
            time.minute = minute;
            time.hour = hour;
        } else {
            return null;
        }
        return time;
    }
}

class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final String type = scanner.next();
        Time time;

        switch (type) {
            case "noon":
                time = Time.noon();
                break;
            case "midnight":
                time = Time.midnight();
                break;
            case "hms":
                int h = scanner.nextInt();
                int m = scanner.nextInt();
                int s = scanner.nextInt();
                time = Time.of(h, m, s);
                break;
            case "seconds":
                time = Time.ofSeconds(scanner.nextInt());
                break;
            default:
                time = null;
                break;
        }

        if (time == null) {
            System.out.println(time);
        } else {
            System.out.printf("%s %s %s", time.hour, time.minute, time.second);
        }
    }
}