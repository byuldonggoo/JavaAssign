import java.util.Scanner;

public class Assign06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("변수a:");
            int a = scanner.nextInt();
            System.out.println("변수b:");
            int b = scanner.nextInt();

            if (a > b) System.out.println("a는 b보다 크다");
            else if (b > a) System.out.println("b는 보다 크다.");
            else System.out.println("a는 b와 같다.");
        }

    }
}
