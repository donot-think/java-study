package demo6;

public class boygirlTest {
    public static void main(String[] args) {
        Boy  boy = new Boy("小金",23);
        boy.shout();

        Girl girl = new Girl("小婷",18);
        girl.marry(boy);
    }
}
