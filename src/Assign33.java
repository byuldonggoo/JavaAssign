//양의 정숫값을 0까지 카운트다운하는 프로그램(while문으로 작성)

import java.util.Scanner;

public class Assign33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("카운트다운합니다.");
        do {
            System.out.print("양의 정숫값:");
            num = scanner.nextInt();
        }while(num<=0);

        while (num >= 0) {
            System.out.println(num);
            num--;
        }
    }
}
