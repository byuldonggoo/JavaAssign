import java.util.Scanner;

//28번 다른 방법.
public class Assign29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 개를 표시할까요?:");
        int n = scanner.nextInt();

        if(n>0){
            int i = 0;
            while (i < n / 2) {
                System.out.print("*+");
                i++;
            }
            if(n%2==1) System.out.print("*");
            System.out.println();
        }
    }
}
