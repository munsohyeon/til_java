package ch05.sec06;

import java.util.Arrays;

public class DeepCopy {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30};

        // arr1을 이용하여 똑같은 배열을 만든다.
        // 1. 똑같은 크기의 공간 할당
        int[] arr2 = new int[arr1.length];

        // 2. arr1배열의 값을 arr2배열에 데이터를 같은 인덱스르에 복사
        for (int i=0; i< arr1.length; i++){
            arr2[i] = arr1[i];
        }

        arr1[1] = 1;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }
}
