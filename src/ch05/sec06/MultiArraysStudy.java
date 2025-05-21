package ch05.sec06;

public class MultiArraysStudy {
        /*
           int[] arr1 = { 10, 20, 30 }; // int 배열의 주소값을 저장할수 있다(주소값 arr1)
           int[] arr2 = { 40, 50, 60 };

           int[][] parent = { arr1, arr2 };

         */
        public static void main(String[] args) {
            int[] arr1 = { 10, 20, 30 };
            int[] arr2 = { 40, 50, 60 };

            int[][] parent = { arr1, arr2 };
            System.out.println(parent[0][1]);
            System.out.println(parent[1][1]);
    }
}
