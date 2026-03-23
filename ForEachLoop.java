package Array;

public class ForEachLoop {
    public static void main(String arg[]){
        int num[] = new int[4];
        for(int i = 0; i < num.length; i++){
            num[i] = (int)(Math.random() * 10);
        }
        for(int n : num){
            System.out.println(n);
        }
    }
}
