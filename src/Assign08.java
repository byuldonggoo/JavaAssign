import java.util.Scanner;

public class Assign08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("정숫값:");
            int num = scanner.nextInt();
            if (num > 0) {
                if (num % 10 == 0) System.out.println("이 값은 10의 배수입니다.");
                else System.out.println("이 값은 10의 배수가 아닙니다.");
            }  else {
                System.out.println("음의 정숫값을 입력했습니다.");
            }

        }
    }
}

