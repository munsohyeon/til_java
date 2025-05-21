package ch05.sec06;

public class MultiArrayStudy02 {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30},
                {40, 50, 60},
                {70}
        };
        System.out.println("arr.length: " + arr.length);
        System.out.println("arr[0].length: " + arr[0].length);
        System.out.println("arr[2].length: " + arr[2].length);
        int[] child0 = arr[0];

        System.out.println("-----------------");
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr[i].length; k++) {
                System.out.printf("%d\t", arr[i][k]);
            }
            System.out.println();
        }
    }
}

