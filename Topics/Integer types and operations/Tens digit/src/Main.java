import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] arr = scanner.next().toCharArray();
        if (arr.length > 1) {
            System.out.println(arr[arr.length - 2]);
        } else {
            System.out.println(0);
        }
    }
}