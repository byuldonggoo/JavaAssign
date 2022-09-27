//2자리의 정숫값(10~99)을 맞추는 '숫자 맞추기 게임' 난수생성,if문 do문사용

import java.util.Random;
import java.util.Scanner;

public class Assign23 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = 10 + random.nextInt(90);
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자맞추기 게임 시작!");
        System.out.println("10부터 99사이의 숫자를 맞추세요.");
        int ans=0;

        do {
            System.out.print("어떤 숫자일까?:");
            ans = scanner.nextInt();
            if(num>ans) System.out.println("더 큰 숫자입니다.");
            else if(num<ans) System.out.println("더 작은 숫자입니다.");


        }while(num!=ans);
        System.out.println("정답입니다.");
    }
}
