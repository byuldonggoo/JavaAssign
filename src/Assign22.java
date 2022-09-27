import java.util.Scanner;

//3자리의 양의 정숫값(100~999)을 읽는 프로그램을 작성하라
public class Assign22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sw = true;
        while (sw) {
            System.out.print("세 자리의 정숫값:");
            int num = scanner.nextInt();
            if (num >= 100 && num <= 999) {
                sw = false;
                System.out.println("입력한 값은 " + num + "입니다.");
            }
        }
    }
}
