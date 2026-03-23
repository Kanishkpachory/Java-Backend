package Array;

public class pratice {
    public static void main(String arg[]){
        int nums[] = {2,3,4,5};

        System.out.println(nums[1]);

        int num[] = new int[4];
        // num = {1,2,3,4,5}; not possible 
        num[1]= 9;
        num[3]= 6;

        System.out.println(num[3]);
        System.out.println(num[1]);
        System.out.println("   /////   ");
        for(int i =0 ; i<=num.length ; i++){
            System.out.println(num[i]);
        }
    }
}
