package cho4.sec07;
                /*
                1-100사이 숫자를 입력해주세요 > 50
                Down!
                1-100사이 숫자를 입력해주세요 > 25
                Up!
                 */

import java.util.Random;
import java.util.Scanner;

public class UpAndDownGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int random = rd.nextInt(100)+1;
        int cnt = 1;
        System.out.println("컴퓨터가 1~100 중 랜덤 숫자 하나를 정합니다.");
        System.out.println("이 숫자를 맞춰주세요.");
        System.out.print("1~100 숫자 입력 : ");
        int a = sc.nextInt();
        while(random != a) {
            if(a < random) {
                System.out.println(a + "보다 더 큽니다.");
            } else {
                System.out.println(a + "보다 더 작습니다.");
            }
            System.out.print("다시 입력해주세요 : ");
            cnt += 1;
            a = sc.nextInt();
        }
        System.out.println("정답입니다! " + cnt + "회 만에 맞췄어요.");
    }
}