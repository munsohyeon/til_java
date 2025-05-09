package ch02;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class PrintVsPrintln {
    public static void main(String[] args) {
        // print 옆으로 붙어서 출력
        System.out.print("안녕");
        System.out.print("안녕");
        System.out.print("안녕");

        System.out.println("------------");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");

        System.out.println("------------");

        //print + 개행(이스케이프 문자 \n)
        System.out.print("안녕\n");
        System.out.print("안녕\n");
        System.out.print("안녕\n");

        System.out.print("안녕\\n"); // \를 넣고 싶을때 2번 넣기
        System.out.print(" \"안녕\" \n"); // ""을 넣고 싶을때 \" \"을 넣어준다.

        System.out.print("안녕하세요\n반값습니다.\n");
        System.out.println("안녕하세요\n반값습니다.");
        System.out.print(";;;;;;;\n");

        //printf
        int age = 22; // 10진수 double
        String name = "홍길동"; // string(문자열)
        float height = 172.5f; // float
        // age, name, height 변수를 활용하여 아래처럼 출력시켜주세요.
        // 제 이름은 홍길동이고 나이는 22살이며 키는 172.5cm입니다.
        System.out.println("제 이름은 " + name + "이고 나이는 " + age + "살이며 키는 " + height + "cm입니다." );
        System.out.printf("제 이름은 %s이고 나이는 %d살이며 키는 %.1fcm입니다.\n", name, age, height );
        // %(위치,순서대로 값을 넣는다.)


    }
}
