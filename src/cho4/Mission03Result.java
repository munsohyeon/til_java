package cho4;

public class Mission03Result {
    public static void main (String[] args) {
        int value = (int)(Math.random() * 100.0) + 1;

        String oddEven = "홀";
                if(value % 2 == 0 ) {
                    oddEven = "짝";
                }
                System.out.printf("%d는(은) %s수입니다.\n", value, oddEven);
    }
}
