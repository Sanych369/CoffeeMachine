import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(getResult(scanner.nextInt()));
    }

    private static int getResult(int input) {
        final int one = 1;
        final int two = 2;
        final int three = 3;
        return ((input + one) * input + two) * input + three;
    }
}