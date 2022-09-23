import java.util.Scanner;

//읽은 2개의 실숫값 중에서 큰 쪽을 표시
public class Assign11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("실수a:");
        double a = scanner.nextDouble();
        System.out.print("실수b:");
        double b = scanner.nextDouble();

        double max = a > b ? a : b;

        System.out.println("둘 중 큰 값은 "+max+"입니다.");
    }
}
