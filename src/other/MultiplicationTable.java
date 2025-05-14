package other;

public class MultiplicationTable {
    public static void main(String[] args) {
        // 1. 세로 전체 구구단
        for(int a = 1; a <=9 ; a++) {
            for (int b = 1; b<=9 ; b++) {
                System.out.println(a+"X"+b+"="+(a*b));
            }
        }



        // 2. 가로 전체 구구단
        for(int a = 1; a <=9 ; a++) {
            for (int b = 1; b <= 9; b++) {
                System.out.print(b + "X" + a + "=" + (a * b) + "\t");
            }
            System.out.println();
        }
    }
}
