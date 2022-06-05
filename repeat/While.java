package repeat;

public class While {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("카운트다운을 시작하겠습니다.");
        while (i > 0) {
            System.out.println(i + "초 ~");
            i--;
        }
    }
}