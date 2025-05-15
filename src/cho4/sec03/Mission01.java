package cho4.sec03;

public class Mission01 {
    public static void main(String[] args) {
        //  0 ~ 15 랜덤값
        int month = (int) (Math.random() * 16.0 );
        System.out.println("mont: " + month);

        //switch이용하여
        // 12, 1, 2라면 "겨울"
        // 3, 4, 5라면 "봄"
        // 6, 7, 8라면 "여름"
        // 9, 10, 11라면 "가을"
        // 나머지는 "해당 계절이 없습니다."


        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("겨울");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("봄");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("여름");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("가을");
                break;
            default:
                System.out.println("해당 계절이 없습니다.");
                break;
        }
        System.out.println("--- 끝 ---");
    }
}
