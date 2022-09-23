//키보드에서 입력한 3개의 정수 중 최솟값을 구하는 프로그램을 작성하자.

import java.util.Scanner;

public class Assign13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수a:");
        int a = scanner.nextInt();
        System.out.println("정수b:");
        int b = scanner.nextInt();
        System.out.println("정수c:");
        int c = scanner.nextInt();

        int max=a;
        if(b>max) max = b;
        if(c>max) max = c;

        System.out.println(" 최댓값은 " + max + "입니다.");
    }
}
