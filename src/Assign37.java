//신장별 표준 체중 대응표 표시 프로그램 작성
//표준체중=(신장-100)*0.9

import java.util.Scanner;

public class Assign37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 cm부터:");
        int start = scanner.nextInt();
        System.out.print("몇 cm까지:");
        int end = scanner.nextInt();
        System.out.print("몇 cm단위:");
        int step = scanner.nextInt();
        System.out.println("신장 표준 체중");
        System.out.println("--------");
        for (int i = start; i <=end ; i+=5) {
            System.out.println(i+ " " + (i-100)*0.9);
        }


        
        
    }
}
