/*2개의 정숫값을 읽어서 두 정수 사이에 있는 모든 정수값 작은 것부터
큰 순으로 표시하는 프로그램을 작성.*/
import java.util.Scanner;

public class Assign24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수a:");
        int a = scanner.nextInt();
        System.out.print("정수b:");
        int b = scanner.nextInt();

        if (a > b) {
            int tmp=a;
            a=b;
            b=tmp;
        }

        do {
            System.out.print(a + " ");
            a+=1;
        } while (a<=b);

    }
}
