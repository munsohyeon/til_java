package cho4.sec05;

public class WhileStudy {
    /*
        반복문 2개
        for loop : 몇 번 반복해야하는지 정확히 알 때 사용
        while loop: 언제 반복을 멈춰야하는지 알 때 사용

        // 조건식이 true인 동안 실행문을 반복합니다.
        while ( 조건식) {
            실행문
        }



     */
    public static void main(String[] args) {
        //  for loop로 0~9까지 출력하시오.
        for (int i = 0; i <=9; i++){
            System.out.println(i);
        }
        System.out.println(" ----------------------- ");

        int i=0;
        while (i<10) {
            System.out.println(i);
            i++;
        }


    }
}
