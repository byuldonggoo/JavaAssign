//'*'를 num개만큼 출력(while문 사용)

import java.util.Scanner;

public class Assign32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇개의 *를 표시할까요? : ");
        int num = scanner.nextInt();

        while(num>0){
            System.out.print("*");
            num--;
        }
    }
}
