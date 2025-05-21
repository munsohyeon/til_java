package ch05.sec06;

public class Mission08 {
    public static void main(String[] args) {
        int[] arr = { 77, 34, 109, 21, 101, 48};

        // arr 배열에서 가장 큰 작은값 찾아서 출력
        int min = arr[0];

        for (int i=0; i< arr.length; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
