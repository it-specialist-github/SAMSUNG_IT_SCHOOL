import java.util.Scanner;

public class Ex_187 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, ns1 = 0, ns2 = 0, k1 = 0, k2 = 0;
        int[] arr, s1, s2;

        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {arr[i] = sc.nextInt();}
        for (int w : arr) {
            if (w < 0) {ns1 += 1;} else {ns2 += 1;}
        }
        s1 = new int[ns1];
        s2 = new int[ns2];

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                s1[k1] = arr[i];
                k1 += 1;
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                s2[k2] = arr[i];
                k2 += 1;
            }
        }
        for (int w: s1) {System.out.print(w + " ");}
        for (int w: s2) {System.out.print(w + " ");}
    }
}
