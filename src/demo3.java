public class demo3 {
    public static void main(String[] args) {
        int[] Array = new int[]{34, 5, 22, -98, 6, -76, 0, -3};
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array.length - i-1; j++) {
                if (Array[j] > Array[j + 1]) {
                    int num = 0;
                    num=Array[j];
                    Array[j] = Array[j + 1];
                    Array[j + 1]=num;
                }
            }
        }
        for (int t=0;t<Array.length;t++)
        System.out.println(Array[t]);
    }
    }