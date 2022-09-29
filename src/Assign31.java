//1~n까지의 곱을 구하는 프로그램 작성.

import java.util.Scanner;

public class Assign31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int result=1;
        do {
            System.out.print("양의 정숫값 : ");
            num = scanner.nextInt();
        }while(num<=0);

        for (int i = num; i >=1 ; i--) {
            result*=i;
        }
        System.out.println("1부터 " + num + "까지의 곱은 " + result + "입니다.");

    }
}

