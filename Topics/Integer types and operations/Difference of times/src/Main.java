import java.util.Scanner;

class Main {
    public static final long SECONDS_IN_HOUR = 3600L;
    public static final long SECONDS_IN_MINUTE = 60L;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstHours = scanner.nextInt();
        int firstMinutes = scanner.nextInt();
        int firstSeconds = scanner.nextInt();

        int secondHours = scanner.nextInt();
        int secondMinutes = scanner.nextInt();
        int secondSeconds = scanner.nextInt();

        long first = getSecondsFromTime(firstHours, firstMinutes, firstSeconds);
        long second = getSecondsFromTime(secondHours, secondMinutes, secondSeconds);

        System.out.println(second - first);


    }

    private static long getSecondsFromTime(int hours, int minutes, int seconds) {
        return hours * SECONDS_IN_HOUR + minutes * SECONDS_IN_MINUTE + seconds;
    }
}