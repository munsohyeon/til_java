package cho4.sec03;

public class Mission02 {
    public static void main(String[] args) {
        // 0 ~ 100 랜덤값
        int score = (int)(Math.random() * 101.0 ) + 5;
        System.out.println("score: " + score);

        // 만약 score값이 100 ~ 90점 사이면 A학점
        // 만약 score값이 80 ~ 89점 사이면 B학점
        // 만약 score값이 70 ~ 79점 사이면 C학점
        // 만약 score값이 70점 미만이면 D학점
        // 만약 score값이 100점을 넘기거나 0점 아래면 "측정 불가"


        switch (score / 10) {
            case 10, 9:
                System.out.println("A학점");
                break;
            case 8:
                System.out.println("B학점");
                break;
            case 7:
                System.out.println("C학점");
                break;
            case 6:
                System.out.println("D학점");
                break;
            default:
                System.out.println("측정불가");
        }
        System.out.println("--- 끝 ---");
    }
}
