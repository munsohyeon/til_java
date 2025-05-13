package other;

public class ScopeStudy {
        /*
           스코프: 변수가 살아있는 공간 (LifeCycle)
                  변수가 선언이 되면 자기 자신을 감싸고 있는 중괄호 안에서만 살아있다.
                  즉, 중괄호를 벗어나면 죽습니다.
         */
    public static void main(String[] args) {

        int num = 10;

        for(int i=0; i<10; i++) {
            // int i = 10; 같은 스코프 안에서는 같은 이름의 변수 선언은 한 번만 하면 된다.
            System.out.println(i);
        }
        for (int i=0; i<10; i++){
            System.out.println(i);
        }
        // System.out.println(i); i에 접근할 수 없다.
    }

    public static void methodA(String[] args) {
        // System.out.println(num); num에 접근할 수 없다.
    }
}
