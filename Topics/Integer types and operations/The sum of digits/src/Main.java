import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] digit = scanner.next().split("");
        int result = 0;
        for (String s : digit) {
            result += Integer.parseInt(s);
        }
        System.out.println(result);
    }
}