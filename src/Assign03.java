//2개의 양의 정숫값을 읽어서, 후자가 전자의 약수이면 "B는 A의 약수이다"라고 표시.

import java.util.Scanner;

public class Assign03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("변수A:");
            int num1 = scanner.nextInt();
            System.out.print("변수B:");
            int num2 = scanner.nextInt();

            if (num1 % num2 == 0) System.out.println("B는 A의 약수이다");
            else System.out.println("B는 A의 약수가 아니다");
        }
    }
}
