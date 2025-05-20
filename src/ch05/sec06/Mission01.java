package ch05.sec06;

import java.util.Arrays;

public class Mission01 {
    public static void main(String[] args) {

        // [] 대괄호는 배열 [공간갯수를 작성] 첫번째 주소값이 arr에 저장
        int [] arr = new int[5]; // 인덱스(방 번호) 0~9

        // 래퍼런스 arr.length 주소값인 것들은 .을 활용할수 있음(magic keyword)
        // length 배열의 크기(방 갯수)를 의미 여기에서는 5
        for (int i=0; i<arr.length; i++ ) {
            arr[i] = (i + 1) * 100;
        }

        System.out.println(Arrays.toString(arr));

        }
    }

