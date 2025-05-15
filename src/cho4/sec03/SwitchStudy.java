package cho4.sec03;

public class SwitchStudy {
    public static void main(String[] args) {
        /*
           switch에서는 관계연산자(<,>,>=,<=,!=) 사용할 수 없다.
           오로지 == equal만 가능
           switch는 case에 맞는

           switch (변수) {
                 case 값1 :
                     처리1; 값1에 해당하는 작업 수행
                    break; 위 코드를 실행 후 break; 만나면 stop
                 case 값2 :
                     처리2; 값2에 해당하는 작업 수행
                    break; 위 코드를 실행 후 break; 만나면 stop

           [....]

           default: 위의 어떤 case에도 해당하지 않을 때의 기본 작업 수행
                  나머지 처리;
                  break;
         */
        int num = 2;
        switch (num) {
            case 1:
                System.out.println("1입니다.");
            case 2:
            case 3:
                System.out.println("2 or 3입니다.");
                break;
            default:
                System.out.println("값이 없네요.");
            case 4:
                System.out.println("4입니다.");
                break;
        }
        System.out.println("--- 끝 ---");
    }
}
