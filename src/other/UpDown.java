package other;

import java.util.Random;
import java.util.Scanner;

public class UpDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int random = rd.nextInt(100)+1;
        int answear = 1;

        System.out.print("1~100 숫자 입력 : ");
        int a = sc.nextInt();
        while(random != a) {
            if(a < random) {
                System.out.println(a + "보다 더 큽니다.");
            } else {
                System.out.println(a + "보다 더 작습니다.");
            }
            System.out.print("다시 입력해주세요 : ");
            answear += 1;
            a = sc.nextInt();
        }
        System.out.println("정답입니다! " + answear + "회 만에 맞췄어요.");
    }
}

