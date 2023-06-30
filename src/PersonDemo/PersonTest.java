package PersonDemo;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "金后谱";
        p1.age = 18;
        p1.study();
        p1.showAge();

       int newAge= p1.addAge(2);
        System.out.println(newAge);
    }
}
