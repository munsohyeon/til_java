package other;

public class Heart {
    public static void main(String[] args) {
        int size = 6; // 높이 조절용

        for (int i = size / 2; i <= size; i += 2) {
            // 좌측 상단 하트
            for (int j = 1; j < size - i; j += 2)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("❤");
            for (int j = 1; j <= size - i; j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("❤");
            System.out.println();
        }

        // 하단 삼각형
        for (int i = size; i >= 1; i--) {
            for (int j = 0; j < size - i; j++)
                System.out.print(" ");
            for (int j = 1; j <= (i * 2) - 1; j++)
                System.out.print(" ");

        }
    }
}
