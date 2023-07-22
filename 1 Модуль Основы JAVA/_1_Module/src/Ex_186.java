import java.util.Scanner;

public class Ex_186 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, el, k, mx, kmx;
        int[] arr;

        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {arr[i] = sc.nextInt();}
        mx = arr[0];
        kmx = 1;
        for (int i = 0; i < n - 1; i++) {
            el = arr[i];
            k = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] == el) {
                    k += 1;
                }
            }
            if (k > kmx) {
                mx = el;
                kmx = k;
            }
        }
        System.out.println(mx);
    }
}
