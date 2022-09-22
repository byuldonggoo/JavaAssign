/*입력한 정숫값을 3으로 나눈다. 그리고 그 결과에 따라 "이 값은 3으로 나누어집니다.",
"이 값을 3으로 나눈 나머지는 1입니다.","이 값을 3으로 나눈 나머지는 2입니다." 중 하나를
표시하는 프로그램을 작성하자.*/

import java.util.Scanner;

public class Assign09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("정숫값:");
            int num = scanner.nextInt();

            if (num > 0) {
                if (num % 3 == 0) System.out.println("이 값은 3으로 나누어집니다.");
                if (num % 3 == 1) System.out.println("이 값을 3으로 나눈 나머지는 1입니다.");
                if (num % 3 == 2) System.out.println("이 값을 3으로 나눈 나머지는 2입니다.");
            } else {
                System.out.println("양수가 아닌 값을 입력했습니다.");
            }
        }
    }
}
