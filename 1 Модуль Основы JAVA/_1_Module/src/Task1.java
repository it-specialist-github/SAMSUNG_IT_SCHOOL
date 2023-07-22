import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        a = sc.nextInt();//Считываем первое число

        b = sc.nextInt();//Считываем второе число

        c = a + b;
        System.out.println(c);
    }
}
