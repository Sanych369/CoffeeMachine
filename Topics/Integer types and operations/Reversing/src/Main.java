import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final int ten = 10;
        final int thousand = 100;
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input % ten != 0) {
            System.out.println(input / thousand + ((input % thousand) / ten) * ten + input % ten * thousand);
        } else {
            System.out.println(input / thousand + input % thousand);
        }
    }
}