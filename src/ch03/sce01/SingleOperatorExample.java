package ch03.sce01;
//p.80
public class SingleOperatorExample {
    public static void main(String[] args) {
        int x = -100;
        System.out.printf("x: %d\n",x);

        x = -x; // 전체는 쓰기 -x는 읽기
        // x = -100 * -1; >> x = 100;
        System.out.printf("x: %d\n", x);

        int y = 100 * -1;
        System.out.printf("y: %d\n", y);

        y = y * -1;
        System.out.printf("y; %d\n", y);
    }
}
