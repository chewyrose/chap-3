public class BT17 {
    public static void main(String[] args) {
        for (int n = 1; n <= 10; n++) {
            int value = (int) Math.pow(2, n) - 1;
            System.out.print(value + ", ");
        }
        System.out.println();
    }
}

