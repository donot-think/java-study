package inheritance;

public class Mankind {
    int sex;
    int salary;
    public void manOrWoman(int sex){
        if(sex==1){
            System.out.println("man");
        }else if(sex==0){
            System.out.println("woman");
        }else{
            System.out.println("输入错误");
        }
    }
    public void employeed(int salary){
        if(salary==0){
            System.out.println("没有工作");
        }else if(salary!=0){
            System.out.println("有工作");
        }else{
            System.out.println("输入错误");
        }
    }
}
