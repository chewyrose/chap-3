public class BT18 {
    public static void main(String[] args) {
        int[] series = new int[10];
        series[0] = 1;
        for (int i = 1; i < series.length; i++) {
            if (i % 2 == 1) {
                series[i] = series[i - 1] * 2 + 5;
            } else {
                series[i] = series[i - 1] * 2 + 2;
            }
        }
        for (int num : series) {
            System.out.print(num + ", ");
        }
        System.out.println();
    }
}


