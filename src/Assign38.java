//읽은 개수만큼 *를 표시(5개 단위로 줄바꿈)(방법1)

import java.util.Scanner;

public class Assign38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 개의 *를 표시할까요?:");
        int num = scanner.nextInt();

        for (int i = 1; i <=num ; i++) {
            if(i%5==0) {
                System.out.print("*");
                System.out.println();
            }else System.out.print("*");
        }


    }
}
