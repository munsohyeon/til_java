package cho4.sec08;

public class BreakContinueStudy {
    public static void main(String[] args) {
        // 10번 반복하는 for문 2개 작성해 주세요.
        for(int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("첫번째");
        }
        System.out.println("--------------");
        for(int k = 0; k < 10; k++) {
            if (k == 5) {
                continue;
            }
            System.out.println("두번째");
        }

    }
}
