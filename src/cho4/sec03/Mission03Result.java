package cho4.sec03;

import java.util.Scanner;

public class Mission03Result {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력해 주세요 > ");
        int score = scanner.nextInt(); // -10, 0, 120
        System.out.println("score: " + score);

        String grad = "D";
        switch ( score / 10 ) {
            case 10,9 :grad = "A"; break;
            case 8: grad = "B"; break;
            case 7: grad = "C"; break;
        }
        String sigh = "0";
        int modResult = score % 10;
        if (score < 70 ){
            sigh = "";
        } else if (score == 100 || modResult >= 8) {
            sigh = "+";
        } else if (modResult <= 3) {
            sigh = "-";
        }
        System.out.printf("%s%s학점\n", grad, sigh);
    }
}
