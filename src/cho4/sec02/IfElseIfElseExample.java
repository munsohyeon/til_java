package cho4.sec02;

public class IfElseIfElseExample {
    public static void main(String[] args) {
        boolean result = true;
        result = false;

        int score = 89;

        if( score >= 90 ) { // if(소괄호) 사이에 boolean밖에 못들어온다!
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다.");
        } else if ( score >= 80 ){
            System.out.println("점수가 80~89입니다.");
            System.out.println("등급은 B입니다.");
        } else if ( score >= 70 ){
            System.out.println("점수가 70~79입니다.");
            System.out.println("등급은 C입니다.");
        } else {
            System.out.println("점수가 70점 미만입니다.");
            System.out.println("등급은 D입니다.");
        }
        System.out.println("--끝--");
    }
}
