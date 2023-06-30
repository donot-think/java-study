import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class StudentTest {
    public static void main(String[] args) {

        Student stu = new Student();
//        stu.name = "金后谱";
//        stu.age = 23;
//        stu.major ="软件工程";
//        stu.interests = "看小说";
        stu.say("金后谱",23,"软件工程","看小说");
    }

}

       class Student{
           String name;
           int age;
           String major;
           String interests;

           public void say( String name,
                   int age,
                   String major,
                   String interests){
               System.out.println("学生的名字是："+name);
               System.out.println("学生的年龄是："+age);
               System.out.println("学生的课业是："+major);
               System.out.println("学生的兴趣是："+interests);
           }
       }

