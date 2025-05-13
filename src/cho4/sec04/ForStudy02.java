package cho4.sec04;

public class ForStudy02 {
    public static void main(String[] args) {
        // Hello,World!! 콘솔에 5회 출력
        for (int i = 0; i<5; i++){
            System.out.println("Hello,World");
        }
        System.out.println("-------------(2)");
        // i<15는 수정 불가능. 나머지는 수정 가능.
        // Hello, World!! 콘솔에 5회 출력
        for (int i = 10; i<15; i++) {
            System.out.println("Hello,World");
        }

        System.out.println("-------------(3)");
        // i--는 수정 불가능. 나머지는 수정 가능.
        // Hello, World!! 콘솔에 3회 출력
        for (int i = 13; i>10; i--) { //10,9,8,7 ...
            System.out.println("Hello,World");
        }
    }
}
