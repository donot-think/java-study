package myproject02.bean;

public class Customer {
    private String name;//客户姓名
    private char gender;//性别
    private int age;//年龄
    private String phone;//电话号码
    private String emil;//电子邮箱

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmil(String emil) {
        this.emil = emil;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return emil;
    }

    public Customer() {
    }

    public Customer(String name, char gender, int age, String phone, String emil) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.emil = emil;
    }
}
