package cho4;

public class Misson03 {
    public static void main (String[] args) {
        //        int value = (int)(Math.random() * 100.0) + 5
        // 1~100 사이의 랜덤값 나오게 해주고

        // 랜덤값이 value = 5; 라면
        // 출력: 5는(은) 홀수입니다.

        // 랜덤값이 value = 97; 라면
        //출력: 97는(은) 홀수입니다.

        // 랜덤값이 value = 54; 라면
        // 출력: 54는(은) 짝수입니다.

        int value = (int)(Math.random() * 100.0) + 1;
        if ( value % 2 == 0 ) {
            System.out.println(value + "는(은) 짝수입니다.");
        } else {
            System.out.println(value + "는(은) 홀수입니다.");
        }


    }
}
