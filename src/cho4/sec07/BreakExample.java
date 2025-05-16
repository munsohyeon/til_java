package cho4.sec07;

public class BreakExample {
    public static void main(String[] args) {
        while(true) {
            // 1 ~ 6사이 랜덤값
            int num = (int)(Math.random() * 6.0 ) + 1;
            System.out.println(num);
            if(num == 6 ) {
                 break;
            }
        }
        System.out.println(" --- 끝 --- ");
    }
}
