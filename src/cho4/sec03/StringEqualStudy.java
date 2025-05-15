package cho4.sec03;

public class StringEqualStudy {
    // p.158
    // 엄청 중요하닷!!!!!!
    public static void main(String[] args) {
        // 자바에서 젤 별루...⭐
        String str1 = "hello";
        String str2 = "hello";

        System.out.printf("%s == %s : %b\n", str1, str2, str1 == str2);
        System.out.printf("%s == %s : %b\n", str1, str2, str1.equals(str2));
        System.out.printf("%s == %s : %b\n", str1, str2, str2.equals(str1));

        String str3 = new String("hello");
        String str4 = new String("hello");

        System.out.printf("4. %s == %s : %b\n", str3, str4, str3 == str4);
        System.out.printf("4. %s == %s : %b\n", str3, str4, str3.equals(str4) );
        System.out.printf("4. %s == %s : %b\n", str3, str4, str4.equals(str3) );
    }
}
