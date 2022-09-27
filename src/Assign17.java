import java.util.Scanner;

//3개의 정숫값을 오름차순(작은 순)으로 정렬.
public class Assign17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수a:"); int a = scanner.nextInt();
        System.out.print("정수b:"); int b = scanner.nextInt();
        System.out.print("정수c:"); int c = scanner.nextInt();

        int tmp = 0;
        if (a > b) {
            tmp = a;
            a = b;
            b = tmp;
        }

        if (b > c) {
            tmp = b;
            b = c;
            c = tmp;
        }

        if (a > b) {
            tmp = a;
            a = b;
            b = tmp;
        }

        System.out.println(a+" " + b + " " + c);

    }
}
