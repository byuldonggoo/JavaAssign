//Assign03을 논리부정연산자(!)를 사용해서 수정
import java.util.Scanner;

public class Assign04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("변수A:");
            int num1 = scanner.nextInt();
            System.out.print("변수B:");
            int num2 = scanner.nextInt();

            if (!(num1 % num2 == 0)) System.out.println("B는 A의 약수가 아닙니다.");
            else System.out.println("B는 A의 약수입니다.");
        }
    }
}