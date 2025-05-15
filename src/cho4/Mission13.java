package cho4;

public class Mission13 {
    public static void main(String[] args) {
        // 3~8까지 랜덤값
        int star = (int)(Math.random() * 6.0) + 3;
        System.out.println("star: " + star);
        /* 별 피라미드 만들기 */
        // 왼쪽으로 피라미드
        for (int i = 1; i <= star; i++ ) {
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------------------");
        // if문도 써서 만들어보기
        for (int i = 1; i <= star; i++) {
            for (int k = 1; k <= i; k++) {
                if (k <= i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println("---------------");

        for (int i = 1; i <= star; i++){
            for (int k = 1; k <= star-i; k++){
                System.out.print("");
            }
            for (int s = 1; s <= i; s++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
