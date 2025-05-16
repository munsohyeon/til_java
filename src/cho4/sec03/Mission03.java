package cho4.sec03;

import java.util.Scanner;

public class Mission03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력해 주세요 > ");
        int score = scanner.nextInt(); // -10, 0, 120
        System.out.println("score: " + score);
        /*
        100점 초과이거나 0점 미만이면 "잘 못된 점수 입니다." 출력
        100점이면 A+
                98점이상이면 A+
                94이상 97이하 A0
                90이상 93이하 A-

                88점 이상 89이하 B+
                84점 이상 87이하 B0
                80점 이상 83이하 B-

                78점 이상 79이하 C+
                74점 이상 77이하 C0
                70점 이상 73이하 C-

                나머지 D
                */

        String grade;

        if (score >= 90) {
            grade = "A";
            if (score >= 94) {
                grade = "A0";
            } if (score >= 98 ) {
                grade = "A+";
            } else if (score >= 80) {
                grade = "B";
                if (score >= 84) {
                    grade = "B0";
                } if (score >= 88 ) {
                    grade = "B+";
                } else if (score >= 70) {
                    grade = "C";
                    if (score >= 74) {
                        grade = "C0";
                    } if (score >= 78) {
                        grade = "C+";
                    } else {
                        grade = "잘못된 점수입니다.";
                    }
                }
            }
            System.out.println("점수를 입력하세요" + score);
            System.out.println("당신의 학점은?" + grade);
        }
        /*
        System.out.println("-------------------");
        if(score >= 90){
            grade = "A";
            if (score >= 98)
                grade += "+";
            if (score >= 94)
                grade += "0";
            if (score >= 90)
                grade += "-";

            } else if (score >= 80) {
             grade = "B";
            if (score >= 88)
                grade += "+";
            if (score >= 84)
                grade += "0";
            if (score >= 80)
                grade += "-";

        } else if (score >= 70) {
                grade = "C";
            if (score >= 78)
                grade += "+";
            if (score >= 74)
                grade += "0";
            if (score >= 70)
                grade += "-";
    }
        System.out.println("점수를 입력하세요" + score);
         */
    }
}