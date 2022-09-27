import java.util.Scanner;

//입력받은 정숫값부터 0까지 카운트다운하는 프로그램 작성.
public class Assign25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("카운트다운합니다.");
        do {
            System.out.print("양의 정숫값:");
            num = scanner.nextInt();
        } while (num <= 0);

        for (int i = num; i >=0 ; i--) {
            System.out.println(i);
            num=i;
        }
        System.out.println("x의 값이 " + num +"이 됐습니다." );
    }
}
