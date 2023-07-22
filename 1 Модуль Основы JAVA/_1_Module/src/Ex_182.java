import java.util.Scanner;

public class Ex_182 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, el, sum = 0;
        boolean flag = false;

        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            el = sc.nextInt();
            if (el % 2 == 0) {
                sum += el;
                flag = true;
            }
        }
        System.out.println(flag ? sum : "NO");
    }
}
