import java.util.Scanner;

public class Ex_184 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, p = 4;
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(p + " ");
            p += 3;
            }
        }
    }
