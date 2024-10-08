public class BT8 {
    public static void main(String[] args){
        int sum = 0;
        int count = 100;
        for (int i = 1; i <= 100; i++){
            sum += i;
        }
        double avg = (double) sum / count;
        System.out.println("Average of " + count + " elements is " + avg);
    }
}
