package ch05.sec06;

import java.util.Arrays;

public class Mission03 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(arr));
        System.out.println("------------------");
        // 똑같이 나오게

        System.out.print("[");
        for (int i=0; i < arr.length; i++) {
            int len = arr.length - 1;
        System.out.print( arr[i] );
            if ( i < len ) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("------------------");

        System.out.print("[");
        for (int i=0; i< arr.length; i++) {
            int len = arr.length - 1;
            System.out.print(arr[i] + (i < len ? ", " : "" ));
        }
        System.out.print("]");
    }
}
