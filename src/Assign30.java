import java.util.Scanner;

public class Assign30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("양의 정숫값의 자릿수를 표시합니다.");
        int num;
        do {
            System.out.print("양의 정숫값:");
            num = scanner.nextInt();
        }while(num<=0);

        int times=0;
        while (num> 0) {
            num=num/10;
            times++;
        }
        System.out.println(times);
    }
}

/*오류 : num의 타입을 double로 했더니 14행에서 num>1으로 하지 않으면
원하는 값이 안나옴. num의 타입을 int로 바꾸었더니 num>0으로 해도 원하는
값이 잘 나왔다.*/
