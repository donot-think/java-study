package demo5;

public class Person {
    private String name;
    private int age;

    public  Person(){
        String info = "person初始化时，需要考虑如下的1234等等（共40行代码）";
                System.out.println(info);
    }
    public Person(String name){
        this();
        this.name = name;
        System.out.println("我的名字时:"+name);
    }
    public Person(int age){
//        this();
        this.age = age;
        System.out.println("我的年龄时:"+age);
    }
    public Person(String name,int age){
        this(age);
        this.age = age;
        this.name = name;
        System.out.println("哈哈");
    }

}
//  public void setName(String name){
//        this.name = name;
//
//    }
//    public String getName(){
//        return name;
//    }
//
//    public void setAge(int age){
//        this.age = age;
//    }
//    public int getAge(){
//        return age;
//    }
//    public void eat(){
//
//        System.out.println("人要吃东西");
//        slip();
//    }
//    public void slip(){
//        System.out.println("人要睡觉");
//    }