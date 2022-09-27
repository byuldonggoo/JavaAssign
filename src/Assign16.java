//2개의 정숫값을 내림차순으로 정렬.
import java.util.Scanner;

public class Assign16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수a:");
        int a = scanner.nextInt();
        System.out.print("정수b:");
        int b = scanner.nextInt();

        if (a < b) {
            int tmp=a;
            a=b;
            b = tmp;
            System.out.println("a>=b가 되도록 정렬했습니다.");
            System.out.println("변수 a는" + a + "입니다.");
            System.out.println("변수 b는" + b + "입니다.");
        }


    }
}
