package cho4;

public class Mission10 {
    public static void main(String[] args) {
        // 3 ~ 6 랜덤값
        int star = (int)(Math.random() * 4.0) + 3;
        System.out.printf("star: %d\n", star);

        for (int i = 0; i<star; i++ ) {
            for (int k = 0; k<star; k++) {
                System.out.print("*");
            }
        System.out.println();
        }







        System.out.println("-------------");

        int totalCount = star * star;
        for (int i = 0; i < star; i++) {
            System.out.print("*");
            }
            System.out.println();
        }
    }

