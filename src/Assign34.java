//0부터 양의 정수까지 카운트업하는 프로그램 작성.
import java.util.Scanner;

public class Assign34{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.println("카운트업합니다.");
        do {
            System.out.print("양의 정숫값:");
            num = scanner.nextInt();
        }while(num<=0);

        for (int i = 0; i <= num ; i++) {
            System.out.println(i);
        }
    }
}
