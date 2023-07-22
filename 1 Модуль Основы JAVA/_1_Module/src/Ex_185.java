import java.util.Scanner;

public class Ex_185 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, x;
        int[] arr;

        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {arr[i] = sc.nextInt();}
        for (int i = 0; i < n / 2; i++) {
            x = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = x;
        }
        for (int el: arr) {System.out.print(el + " ");}
    }
}
