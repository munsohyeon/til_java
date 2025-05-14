package other;

public class Star {
    public static void main(String[] args) {

        // 왼쪽으로 피라미드
        for (int i = 1; i <= 5; i++ ) {
            for (int s = 1; s <= i; s++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        // 오른쪽 피라미드
        for (int i = 1; i <= 5; i++ )
        {
            for (int s = 1; s <= 5-i; s++ )
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++ )
        {
            for (int s = 1; s <= 5-i; s++ )
            {
                System.out.print(" ");
            }

            for (int s = 1; s <= 2*i-1; s++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }
        // 왼쪽으로 for if문 둘다 사용
        for (int i = 1; i <= 5; i++) {
            for (int S = 1; S <= 5; S++) {
                if (S <= i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        int minus = 5;
        int plus = 5;
        for(int i=0; i<5; i++){
            for(int s=1; s<=9; s++){
                if(s >= minus && s <= plus){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println("");
            minus--;
            plus++;
        }
    }
}
