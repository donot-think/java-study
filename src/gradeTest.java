public class gradeTest {
    public static void main(String[] args) {
        int grade=80;
        switch (grade/60){
            case 0:
                System.out.println("不及格");
                break;
            case 1:
                System.out.println("及格了");
                break;
        }
    }
}
