import java.util.Scanner;

public class Assign02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("정숫값 : ");
            int num = scanner.nextInt();
            if (num >= 0) System.out.println("절대값은" + num + "입니다.");
            else {
                num = num * -1;
                System.out.println("절대값은" + num + "입니다.");
            }
        }
    }
}