
public class Main {

    public static void main(String[] args) {
        int count = 0;
        for (Secret str : Secret.values()) {
            if (str.toString().startsWith("STAR")) {
                count++;
            }
        }
        System.out.println(count);
    }
}

/* sample enum for inspiration
   enum Secret {
    STAR,
    CRASH,
    START; // ...
}
*/