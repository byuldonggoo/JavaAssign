import java.util.Scanner;

//입력한 값의 개수만큼 '*'을 표시하는 프로그램작성.
//마지막에는 줄바꿈 문자를 출력. 단, 읽은 값이 1미만이면 줄바꿈문자표시x
public class Assign27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 개의 *를 표시할까요?:");
        int num= scanner.nextInt();

        for (int i = 0; i <num ; i++) {
            System.out.print("*");
        }

        if(num>0) System.out.println();

    }
}
