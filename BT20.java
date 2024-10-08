public class BT20 {
    public static long factorial(long number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }
    public static void main(String args[]) {
        long number = 6;
        long result;
        result = factorial(number);
        System.out.println("The factorial of " + number + " is: " + result);
    }
}

