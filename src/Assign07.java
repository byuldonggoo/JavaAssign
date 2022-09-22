import java.util.Scanner;

public class Assign07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("정숫값:");
            int num = scanner.nextInt();
            if (num > 0) {
                if (num % 5 == 0) System.out.println("이 값은 5로 나누어집니다.");
                else System.out.println("이 값은 5로 나누어지지 않습니다.");
            }  else {
                System.out.println("음의 정숫값을 입력했습니다.");
            }

        }
    }
}
