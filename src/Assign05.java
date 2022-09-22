//정숫값을 읽어 부호(양수/음수/0)를 판정하는 프로그램을 작성하자.ㄴ

import java.util.Scanner;

public class Assign05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("정숫값: ");
            int num = scanner.nextInt();
            if (num > 0) System.out.println("값이 양수입니다.");
            else if (num == 0) System.out.println("값이 0입니다.");
            else System.out.println("값이 음수입니다.");
        }
    }
}
