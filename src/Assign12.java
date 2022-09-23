import java.util.Scanner;

//2개의 정숫값을 읽어서 두 값의 차를 표시하는 프로그램을 작성.
public class Assign12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수a:");
        int a = scanner.nextInt();
        System.out.print("정수b:");
        int b = scanner.nextInt();

        int sub = a >= b ? a - b : b - a;
        System.out.println("두 값의 차는 "+sub+"입니다.");

        
    }
}
