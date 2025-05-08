package ch02.sec01;

public class Mission01 {
    // 메인 메소드 작성
    public static void main(String[] args) {
        int num1 = 11;
        int num2 = 22;

        System.out.println("num: " + num1 +num2); //num1: 33 (X)
                                                   //num1: 1122 (O)
        // (1) "num: " + num1
        // (2) "num: " + 11
        // (3) "num: " + "11"
        // (4) "num: 11"
        // (5) "num: 11" + num2
        // (6) "num: 11" + 22
        // (7) "num: 11" + "22"
        // (8) "num: 1122" >>  연산의 결과
        System.out.println("num: " + (num1 +num2)); //num1: 33 (소괄호를 주면 가장 높은 우선순위가 된다.)
    }

}
