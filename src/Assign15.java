import java.util.Scanner;

//두 정숫값의 차가 10이하인 경우 "두 값의 차는 10이하입니다."라고 표시하고
//그렇지 않으면 "두 값의 차는 11이상입니다" 라고 표시하는 프로그램 작성.
public class Assign15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수a:");
        int a = scanner.nextInt();
        System.out.println("정수b:");
        int b = scanner.nextInt();

        int sub = a > b ? a - b : b - a;

        if(sub<=10) System.out.println("두 값의 차는 10이하입니다.");
        else System.out.println("두 값의 차는 11이상입니다.");
    }
}
