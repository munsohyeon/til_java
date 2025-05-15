package cho4;

public class Mission14 {
    public static void main(String[] args) {
        // 4~9 랜덤값
        int star = (int) (Math.random() * 6.0 ) + 4;
        System.out.println("star: " + star);

        for (int i = 1; i <= star; i++) {
            for (int k = 1; k <= star - i; k++) {
                System.out.print("_");
            }
            for (int s = 1; s <= i; s++) {
                System.out.print("*");
            }
            System.out.println();
        }
            System.out.println("💖💖💖💖💖💖💖💖💖💖");

        for (int i = 0; i <= star; i++) {
            for (int k = 1; k <= star-i; k++) {
                System.out.print("_");
            }
            System.out.print("*\n");
        }
        System.out.println("🐾🐾🐾🐾🐾🐾🐾🐾🐾🐾🐾");
        for (int i = 1; i <= star; i++) {
            System.out.print("_".repeat(star - i));
            System.out.println("*".repeat(i));
        }
    }
}
