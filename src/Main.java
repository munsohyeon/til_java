//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
    Multiline Comment

    my name is hong

    Pascal Case: MyNameIsHong
    Camel Case: myNameIsHong

    클래스라는 그릇을 만들어야 한다.
    그릇에는 코다 작성된다. (메소드, 변수 등등)
    클래스 이름은 파일 이름과 같아야 한다.
    메소드는 함수라고 보면 된다.
    메인 메소드는 굉장히 중요한 메소드이다.(프로그램의 시작점)
    메소드를 만드는 것은 "메소드 정의한다"라고 표현.
    메소드를 사용하는 것은 "메소드 호출" 라고 표현.
    (소괄호)가 있어야 메소드.
    메소드를 쓰는건 정의, 메소드를 사용하는건 호출
 */
// class 이름은 Pascal Case 로 작성을 해야한다.
public class Main {
    public static void main(String[] args) { // 메소드 (Method), 메인 메소드(모든 프로그램의 시작점)
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        System.out.printf("집가고 싶다요!"); //콘솔에 내용을 출력하라.

        for (int i = 1; i <= 20; i++) { // 반복문, for문, for-loop
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);

        }
    }
}
