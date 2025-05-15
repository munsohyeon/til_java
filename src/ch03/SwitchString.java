package ch03;

import java.util.Scanner;

public class SwitchString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("성별을 입력해 주숑.(w/m) > ");
        String gender = scanner.next();
        System.out.println("gender: " + gender);

        switch (gender) {
            case "w","W","여","여자":
                System.out.println("당신은 여자입니다.");
                break;
            case "m","M","남","남자":
                System.out.println("당신은 남자입니다.");
                break;
            default:
                System.out.println("성별을 입력해주세요.");
                break;
        }
    }
}
