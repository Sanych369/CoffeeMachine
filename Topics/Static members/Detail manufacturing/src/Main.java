import java.util.Scanner;

class ManufacturingController {
    private static final String REQUESTED = "Requested";
    private static int count = 0;

    public static String requestProduct(String product) {
        count++;
        return count + ". " + REQUESTED + " " + product;
    }

    public static int getNumberOfProducts() {
        return count;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String product = scanner.nextLine();
            System.out.println(ManufacturingController.requestProduct(product));
            System.out.println(ManufacturingController.getNumberOfProducts());
        }
    }
}