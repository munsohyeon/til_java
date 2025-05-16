package cho4.sec05;

import java.util.Scanner;
        /*
            합계를 구할 숫자를 입력하세요. (종료: 0)
            >> 100
            >> 200
            >> 300
            >> 400
            >> 0
            합계:1000
         */
public class Mission01 {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                boolean run = true;

                int sum = 0;


                while (run) {
                    System.out.print(">> ");

                    int value = scanner.nextInt();
                    sum += value; // sum = sum + num; sum += num; 이랑 같은 의미
                    if (value == 0) {
                        System.out.println("종료");
                        break;
                    } else {
                        System.out.printf("현재 합계: %,d\n", sum);
                    }
                }
                    System.out.println("총 합계: " + sum);
                    System.out.println("-------------------------");
            }
        }
