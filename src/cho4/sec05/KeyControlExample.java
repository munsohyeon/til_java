package cho4.sec05;

import java.util.Scanner;

public class KeyControlExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int speed = 100;

        while( run ) {
            System.out.println("-------------------------");
            System.out.println("1. 증속 | 2. 감속 | 3. 중지");
            System.out.println("-------------------------");
            System.out.print("선택: ");

            String strMum = scanner.nextLine();
            switch (strMum){
                case "1":
                    speed++;
                    System.out.println("현재 속도 = " + speed);
                    break;
                case "2":
                    speed--;
                    System.out.println("현재 속도 = " + speed);
                    break;
                case "3":
                    run = false;
            }
        }
        System.out.println("-- 끝 --");

                System.out.println("합계를 구할 숫자를 입력하세요. (종료: 0)");

                while (true) {
                    System.out.print(">> ");
                    speed = scanner.nextInt();

                    if (speed == 0) {
                        System.out.println("종료");
                        break;
                    }
                }
                System.out.println("합계: " + speed);
            }
        }


