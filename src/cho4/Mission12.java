package cho4;

public class Mission12 {
    public static void main(String[] args) {
        /*
        2 x 1 =2 \t 3 x 1 = 3 \t 4 x 1 = 4 \t ...... 9 x 1 = 9
        2 x 2 =4 \t 3 x 2 = 6 \t 4 x 2 = 8 \t ...... 9 x 2 = 18
        ....
        2 x 9 = 18 ....
         */
        for(int k = 1; k <=9 ; k++) {
            for (int i = 2; i <= 9; i++) {
                //System.out.print(i + "X" + k + "=" + (k * i) + "\t");
                 System.out.printf ("%dx%d=%d\t",i, k, k*i);
            }
            System.out.println();
        }
        System.out.println("--------- 끝 ---------");
    }
}
