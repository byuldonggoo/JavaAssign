import java.util.Scanner;

//양의 정숫값을 읽어서 그 자릿수를 출력하는 프로그램 작성
public class Assign30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("양의 정숫값의 자릿수를 표시합니다.");
        double num;
        do {
            System.out.print("양의 정숫값:");
            num = scanner.nextInt();
        }while(num<=0);

        int times=1;
        double ten=10;
        while (num / ten > 1) {
            num=num/ten;
            times++;
        }
        System.out.println(times);
    }
}
