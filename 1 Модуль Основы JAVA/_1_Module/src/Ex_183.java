import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex_183 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, el, sum = 0, k = 0;
        boolean flag = false;

        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            el = sc.nextInt();
            if (el % 2 != 0) {
                sum += el;
                k += 1;
                flag = true;
            }
        }
        String formattedDouble = new DecimalFormat("#0.00").format((float) sum / k);
        System.out.println(flag ? formattedDouble : "NO");
    }
}
