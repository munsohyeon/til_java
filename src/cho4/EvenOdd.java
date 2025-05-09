package cho4;

public class EvenOdd {
    public static void main(String[] args) {
        // 홀,짝
        int num = 16;
        // mod % 연산자 사용, 나머지 값 구한다.
        System.out.printf("%d / %d = %d\n", num, 5, num / 5);
        System.out.printf("%d %% %d = %d\n", num, 5, num % 5);

        // mod를 활용해 짝, 홀인지 구분

        if (num % 2 == 0) {
            System.out.printf("%d는 짝수 입니다.\n", num);
        } else {
            System.out.printf("%d 홀수입니다.\n", num);
        }
        System.out.println("--끝--");
    }
}
