package cho4.sec07;

import java.util.Scanner;

public class Mission01 {
    public static void main(String[] args) {
        /*

             (프린트 반복 실행)
    ---------------------------------
    1.예금 | 2.출금 | 3.잔고 | 4.종료
    ---------------------------------
    선택 >


           (실행 예시)
          선택 > 1 (엔터)
          예금액 > 10000 (엔터)

          [[ 프린트 ]]

          선택 > 2 (엔터)
          출금액 > 2000 (엔터)

          [[ 프린트 ]]

          선택 > 3 (엔터)
          잔고 > 8,000원

          [[ 프린트 ]]

          선택 > 4 (엔터)

          프로그램 종료

        */
        Scanner scanner = new Scanner(System.in);

        int num=1;// 선택번호
        int money = 0;// 입력창에 금액을 저장하는 변수
        int save = 0;// 통장 잔액을 저장하는 변수
        while(true) { // while 문의 조건식이 true면 무한 반복

            System.out.println("-------------------------------------");
            System.out.println("   1. 예금 | 2. 출금 | 3. 조회 | 4. 종료"   );
            System.out.println("-------------------------------------");
            System.out.print(" 번호 선택 >>");

            num = scanner.nextInt();//

            // 선택1
            if(num == 1) {
                System.out.print("예금액>");
                money = scanner.nextInt();
                save += money; // save(통장잔액) = save(통장잔액) + money(금액);

                // 선택2
            }else if(num == 2) {
                System.out.print("출금액>");
                money = scanner.nextInt();
                save -= money; // save(통장잔액) = save(통장잔액) - money(금액);

                // 마통은 안돼!
                if (save < money) {
                    System.out.println("통장잔액이 부족합니다.");
                    System.out.println("---- 프로그램을 종료합니다. ----");
                    break;
                }

                // 선택3
            }else if(num == 3) {
                System.out.println("조회액> "+ save);// save(통장잔액)을 보여주면 됨.

                // 선택4
            }else if(num == 4) {
                System.out.println("프로그램 종료");
                break;

            }else {
                System.out.println("1~4 중 하나만 선택하세요.");
            }
        }


    }
}
