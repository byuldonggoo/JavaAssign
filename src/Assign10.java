import java.util.Scanner;

public class Assign10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {


            System.out.print("점수:");
            int score = scanner.nextInt();
            String result="";

            if(score>=0 && score<=100){
                if(score>=90) result="수";
                else if(score>=80) result="우";
                else if(score>=70) result="미";
                else if(score>=60) result="양";
                else result="가";

                System.out.println(result);
            }else{
                System.out.println("잘못된 점수를 입력했습니다.");
            }

        }
    }
}
