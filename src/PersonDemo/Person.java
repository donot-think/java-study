package PersonDemo;

public class Person {
    String name;
    int age;
    int sex;
    public void study(){
        System.out.println("study");
    }
    public void showAge(){
        System.out.println(age);
    }

    public int addAge(int i){
        age+=i;
        return age;
    }
}
