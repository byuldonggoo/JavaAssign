//입력한 정숫값의 모든 약수와 그 개수를 표시하는 프로그램을 작성하자.

import java.util.Scanner;

public class Assign40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정숫값:");
        int num = scanner.nextInt();

        int count=0;
        for (int i = 1; i <=num ; i++) {
            if(num%i==0){
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\n약수는 " + count + "개 입니다.");
    }
}
