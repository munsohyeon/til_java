package ch03.sec07;

public class LogicalOperatorExample {
    public static void main (String[] args) {
        int num1 = 5;
        int num2 = 0;

        System.out.printf(" %d > %d : %b\n", num1, num2, num1 > num2);
        System.out.printf(" 5 > 0 && 5 > 2 : %b\n", 5 > 0 && 5 > 2);
        System.out.printf(" 5 > 0 && 5 < 2 : %b\n", 5 > 0 && 5 < 2);
        System.out.printf(" 5 > 0 && 5 < 2 && 10 > 2 : %b\n", 5 > 0 && 5 < 2 && 10 > 2);

        System.out.println();
        System.out.printf("5 > 0 || 5 > 2 : %b\n", 5 > 0 || 5 < 2 );
        System.out.printf("5 < 0 || 5 > 2 : %b\n", 5 < 0 || 5 < 2 );
        // 1) 5 > 0 >> true
        // 2) 5 < 2 >> false
        // 3) true && false >> false

        System.out.println();
        System.out.printf("5 > 0 || 5 < 2 : %b\n", 5 > 0 || 5 < 2 );
        // 1) 5 > 0 >> true
        System.out.printf("5 < 0 || 5 < 2 : %b\n", 5 < 0 || 5 < 2 );

        System.out.println();
        System.out.printf("!(5 < 0 || 5 < 2) : %b\n", !(5 < 0 || 5 < 2));
        System.out.printf("!false : b%", "!false");
    }
}
