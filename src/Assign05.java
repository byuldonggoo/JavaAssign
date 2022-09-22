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
