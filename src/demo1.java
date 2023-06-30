public class demo1 {
    public static void main(String[] args) {
        int sum=0;
        int i=1;
        int j=2;
        for(i=1;i<=100;i++){
            for(j=2;j<i;j++){
                if(i%j==0){
                }else{
                   sum+=i;
                }
            }
        }
        System.out.println(sum);
    }
}
