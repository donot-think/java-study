import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生人数");
        int number = scanner.nextInt();
        int[] scores = new int[number];
        System.out.println("请输入"+number+"个学生的成绩");
        for(int i = 0;i<scores.length;i++){
            scores[i] = scanner.nextInt();
        }
        int maxscore = 0;
        for(int i=0;i<scores.length;i++){
            if(maxscore<scores[i]){
                maxscore = scores[i];
            }
        }
        for(int i = 0;i<scores.length;i++){
            if(maxscore-scores[i]<=10){
                System.out.println("该学生的成绩等级为：A");
            }else if(maxscore-scores[i]<=20){
                System.out.println("该学生的成绩等级为：B");
            }else if(maxscore-scores[i]<=30){
                System.out.println("该学生的成绩等级为：C");
            }else{
                System.out.println("该学生的成绩等级为：D");
            }
        }
        //提示有多少个学生
        //根据提示的学生个数，提示输入多少个分数
        //找出最高分
        //根据最高分，给每个学生的分数划分等级
    }
}
