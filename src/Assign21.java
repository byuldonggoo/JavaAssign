import java.util.Scanner;

//정숫값의 부호를 판정해서 표시
public class Assign21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean sw = true;

        while (sw) {
            System.out.print("정숫값:");
            int num = scanner.nextInt();
            if (num > 0) {
                System.out.println("이 값은 양수입니다.");
            } else if (num < 0) {
                System.out.println("이 값은 음수입니다.");
            } else {
                System.out.println("이 값은 0입니다.");
            }

            System.out.print("다시 한번? 1-Yes/ 0-No:");
            int answer = scanner.nextInt();
            if (answer == 0) sw=false;

        }
        System.out.println("프로그램을 종료합니다.");
    }
}
