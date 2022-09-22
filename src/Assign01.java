//키보드로 입력한 정숫값이 음이면 "이 값은 음의 값입니다"라고 표시하는 프로그램 작성
import java.util.Scanner;

public class Assign01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수값 : ");
        int n = scanner.nextInt();
        System.out.println(n);
        if(n<0) System.out.println("이 값은 음의 값입니다.");



    }
}
