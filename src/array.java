public class array {
    public static void main(String[] args) {
       //动态初始化，数组的初始化和数组元素的复制操作分开进行
        String[] names = new String[5];
        names[0]="金后谱";
        names[1]="金后月";
        names[2]="金后梦";
        names[3]="金后言";
        names[4]="金后奔";
        System.out.println(names.length);
        int i=0;
        for(i=0;i<names.length;i++){
            System.out.println(names[i]);
        }
        //数组的默认初始化值是零
    }
}
