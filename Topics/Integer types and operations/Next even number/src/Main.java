import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int two = 2;
        final int zero = 0;
        int input = scanner.nextInt();
        if (input % two == zero) {
            System.out.println(input + two);
        } else {
            System.out.println(++input);
        }
    }
}