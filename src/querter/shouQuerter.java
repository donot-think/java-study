package querter;

public class shouQuerter {
    public static void main(String[] args) {
          querter q1 = new querter();
        q1.getQuerter(10,8);
    }
}


 class  querter {
    public  void getQuerter(int height,int weight){
      for(int i=0;i<height;i++){
            for(int j=0;j<weight;j++){
                System.out.print("*");
            }
          System.out.println();
        }
      float area = height*weight;
        System.out.println(area);
    }
}