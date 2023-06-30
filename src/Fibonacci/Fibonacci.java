package Fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci f1 = new Fibonacci();
        int result =f1.f(10);
        System.out.println(result);
//        for (int j=0;j<;j++)
    }

//    public void showfibonacci(int n){
//        for (int i=1;i<=n;i++){
//            System.out.println(n);
//        }
//    }

    public int f(int n){
        if(n==1){
            return 1;
        }else if(n==2){
            return 1;
        }else if(n>2){
           return f(n-1)+f(n-2);
        }
        return f(n);
    }
}
