//1부터 n까지의 합을 구하는 프로그램을 for문을 사용해 작성.

import java.util.Scanner;

public class Assign35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=0;

        do{
            System.out.print("1부터 n까지의 합을 구합니다. n의 값 :");
            n = scanner.nextInt();
        }while(n<=0);

        int sum=0;
        for (int i = 1; i <=n ; i++) {
            sum+=i;
        }
        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");

    }
}
