package cho4;

public class Mission13 {
    public static void main(String[] args) {
        // 3~8까지 랜덤값
        int star = (int)(Math.random() * 6.0) + 3;
        /*
        별 피라미드 만들기
         */

        for (int i = 1; i <= 5; i++ ) {
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        // if문도 써서 만들어보기
    }
}
