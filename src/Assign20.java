//2개의 정숫값중 작은 값과 큰 값을 표시하는 프로그램작성.
import java.util.Scanner;

public class Assign20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("정수a:");
            int a = scanner.nextInt();
            System.out.println("정수b:");
            int b = scanner.nextInt();
            int max = 0;
            int min = 0;
            if (a == b) {
                System.out.println("두 값이 같습니다.");
            } else {
                if (a > b) {
                    max = a;
                    min = b;
                }
                if (b > a) {
                    max = b;
                    min = a;
                }

                System.out.println("작은 값은 " + min + "입니다.");
                System.out.println("큰 값은 " + max + "입니다.");

            }
        }
    }
}
