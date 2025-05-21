package ch05.sec06;

import java.util.Arrays;
import java.util.Scanner;

public class NumberBaseBallGame {
    public static void main(String[] args) {
        int[] answerArr = new int[3];

        // 랜덤 숫자 생성
        for(int i=0; i<answerArr.length; i++) {
            int rVal = (int)(Math.random() * 9.0) + 1; //1~9
            answerArr[i] = rVal;

            for(int z=0; z<i; z++) {
                if(answerArr[z] == rVal) {
                    i--;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(answerArr));

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.printf("숫자 %d개를 입력> ", answerArr.length);
            String input = scanner.nextLine(); // string 객체를 담을수 있는 거
            //System.out.println("input: " + input);

            // inputStrArr 문자열배열주소값
            String[] inputStrArr = input.split(" "); // string 배열를 나타내는 것
            if(inputStrArr.length != answerArr.length) {
                continue;
            }
            // new int = 0
            int[] inputArr = new int[answerArr.length];
            for(int i=0; i<inputArr.length; i++) {
                inputArr[i] = Integer.parseInt(inputStrArr[i]);
            }
            //System.out.println(Arrays.toString(inputArr));
            int s = 0, b = 0;
            for(int i=0; i<answerArr.length; i++) {
                for(int k=0; k<answerArr.length; k++) {
                    if(answerArr[i] == inputArr[k]) {
                        if(i == k) {
                            s++;
                        } else {
                            b++;
                        }
                    }
                }
            }
            if(s == answerArr.length) {
                break;
            }
            System.out.printf("S: %d, B: %d, O: %d\n"
                    , s, b, answerArr.length - s - b);
        }
        System.out.println("-- 끝 --");
    }
}