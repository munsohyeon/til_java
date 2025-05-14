package cho4.sec04;

public class ForStudy03 {
    public static void main(String[] args) {

        for (int i =0; i<10; i++) {
            for(int k = 0; k<5; k++) {
                System.out.printf("i: %d, k: %d\n", i, k);
            }
            System.out.println("----------------");
        }
        for (int i = 1; i<10; i++) {
            for (int k = 1; k<10; k++) {
                //System.out.println(i + "x" + k + "=" + (i*k));
                System.out.printf("%dx%d=%d\n", i, k, i * k);
            }
            System.out.println("-------------");
        }
    }
}
