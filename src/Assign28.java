import java.util.Scanner;

//읽은 값의 개수만큼 '*'와 '+'를 번갈아가며 표시하는 프로그램을 작성
//마지막에는 줄 바꿈 문자를 출력.
public class Assign28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 개를 표시할까요?:");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            for (int i = 0; i <num/2 ; i++) {
                System.out.print("*+");
            }
        }else{
            for (int i = 0; i <num/2 ; i++) {
                System.out.print("*+");

            }System.out.print("*");
        }
        System.out.println();
    }
}
