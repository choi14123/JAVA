package conditional.idea;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("점수를 입력하여주세요:");

        int score = scanner.nextInt();
        if (score >= 90) {
            System.out.println("A 학점 입니다.");
        } else {
            System.out.println("A 학점이 아닙니다.");
        }

    }
}
