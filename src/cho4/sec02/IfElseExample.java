package cho4.sec02;

public class IfElseExample {
    public static void main(String[] args) {
        boolean result = true;
        result = false;

        int score = 93;

        if( score >= 90 ) { // if(소괄호) 사이에 boolean밖에 못들어온다!
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다.");
        } else {
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B입니다.");
        }
    }
}
