package other;

import java.util.Scanner;

public class UpDown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 목표 숫자 설정 랜덤값 1 ~ 100
        int num= (int)(Math.random() * 100.0 ) + 1;
        int max = 10;  // 최대 시도 횟수
        int chance = 0;

        System.out.println("1부터 100 사이의 숫자를 입력해주세요.");
        System.out.println("기회는 총 " + max + "번입니다❗");

        while (chance < max) {
            System.out.print("숫자 입력 > ");
            int user = scanner.nextInt();
            chance++;

            if (user < num) {
                System.out.println("Up!");
            } else if (user > num) {
                System.out.println("Down!");
            } else {
                System.out.println("정답입니다🎆 " + chance + "번 만에 맞추셨습니다🙌");
                break;
            }

            if (chance == num) {
                System.out.println("기회를 모두 소진하셨습니다😢 정답은 " + num + "였습니다.");
            }
        }
    }
}