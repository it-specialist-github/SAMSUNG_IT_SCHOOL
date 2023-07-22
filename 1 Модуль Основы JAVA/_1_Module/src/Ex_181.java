import java.util.Scanner;

public class Ex_181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, x;
        int[] arr;
        boolean flag = true;

        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {arr[i] = sc.nextInt();}
        x = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                System.out.println(i + 1);
                flag = false;
                break;
            }
        }
        System.out.println(flag ? "NO": "");
    }
}
