package demo4;

public class Person {
    int age;
    public void setAge(int age) {
        if(age>0&&age<130){
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }
}
