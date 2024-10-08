public class BT13 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = n - 2; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i + 2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 2 ; i <= n + 1; i++) {
            for (int j = i; j < n + 3; j++) {
                System.out.print(" ");
            }
            for (int k = 2; k <= 2 * i - 3 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
