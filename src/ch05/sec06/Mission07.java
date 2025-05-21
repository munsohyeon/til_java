package ch05.sec06;

public class Mission07 {
    public static void main(String[] args){
        int[] arr = { 77, 34, 109, 21, 101, 48};

        // arr 배열에서 가장 큰 값 찾아서 출력
        int max = arr[0];

        for (int i=0; i< arr.length; i++){
            if (max < arr[i]) {
                max = arr[i];
            }
            // 나는 바보
        }
        System.out.println(max);
    }
}
