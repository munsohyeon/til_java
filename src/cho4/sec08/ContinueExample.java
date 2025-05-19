package cho4.sec08;

public class ContinueExample {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++) { // 이 라인은 수정 불가
            if(i%2 != 0){ // (i%2== 1) 같은말
                continue;
            }
            System.out.print(i + "");
        }
        System.out.println(" --- The End ---");
    }
}
