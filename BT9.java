public class BT9 {
    public static void main(String[] args) {
        int largestDivisibleBy7 = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                largestDivisibleBy7 = i;
            }
        }

        System.out.println("The largest number between 1 and 100 divisible by 7 is: " + largestDivisibleBy7);
    }
}


