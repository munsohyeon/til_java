package cho4.sec07;
                /*
                1-100사이 숫자를 입력해주세요 > 50
                Down!
                1-100사이 숫자를 입력해주세요 > 25
                Up!
                 */


import java.util.Scanner;

public class UpAndDownGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                //int targetNumber = 50; // 목표 숫자 설정

        int answer = (int)(Math.random() * 100.0) + 1;
                System.out.println("answer: " + answer);

           System.out.println("1 -100사이 숫자 입력주세요. ");
           while (true) {
               System.out.print(">> ");
                    int userGuess = scanner.nextInt();

                    if (userGuess < answer) {
                        System.out.println("Up!");
                    } else if (userGuess > answer) {
                        System.out.println("Down!");
                    } else {
                        System.out.println("정답입니다!");
                        break;
                    }
                }
                System.out.println("--- 끝 ---");
            }
        }