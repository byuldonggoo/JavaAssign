//1~부터 n까지의 합 구하기(계산식을 표시)

import java.util.Scanner;

public class Assign36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=0;

        do{
            System.out.print("1부터 n까지의 합을 구합니다. n의 값 :");
            n = scanner.nextInt();
        }while(n<=0);

        int sum=0;
        for (int i = 1; i <=n ; i++) {
            if(i==n) {
                System.out.print(i);
                sum+=i;
            }else {
                System.out.print(i + "+");
                sum += i;
            }
        }
        System.out.print("="+sum);


    }
}
