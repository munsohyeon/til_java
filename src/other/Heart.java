package other;

public class Heart {
    public static void main(String[] args) {
        int size = 6; // 하트 크기 조절

        for (int i = size / 2; i <= size; i += 2) {
            // 윗부분
            for (int j = 1; j < size - i; j += 2) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("❤");
            }
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("❤");
            }
            System.out.println();
        }

        // 아래 부분
        for (int i = size; i >= 1; i--) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("❤");
            }
            System.out.println();
        }
    }
}