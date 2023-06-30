package demo6;

public class Boy {
    private String name;
    private  int age;

    public  Boy(){

    }
    public  Boy(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(){
        this.age = age;
    }
    public int getAge(int age){
        return age;
    }
    public void marry(Girl girl){
        System.out.println("我想娶"+girl.getName());
    }
    public void shout(){
        if(this.age>=22){
            System.out.println("你可以去合法登记结婚了！");
        }else{
            System.out.println("先多谈谈恋爱");
        }
    }

}
