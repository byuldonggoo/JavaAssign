//읽은 개수만큼 *를 표시(5개 단위로 줄바꿈)(방법1)

import java.util.Scanner;

public class Assign39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 개의 *를 표시할까요?:");
        int num = scanner.nextInt();
        if(num>0){
            for(int i=0; i<num/5; i++) System.out.println("*****");
            int rest=num%5;
            if(rest>0){
                for(int i=0; i<rest; i++) System.out.print("*");
                System.out.println();
            }
        }

    }
}
