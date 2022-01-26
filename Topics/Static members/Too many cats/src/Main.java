
class Cat {
    private static int count;
    private static final int BORDER = 5;

    public Cat(String name, int age) {
        count++;
    }

    public static int getNumberOfCats() {
        if (count > BORDER) {
            for (int i = BORDER; i < count; i++) {
                System.out.println("You have too many cats");
            }
        }
        return count;
    }
}