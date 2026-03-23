package Array;

public class MultiArray {
    public static void main(String arg[]){
        int num[][] = new int[3][4];

        // num[0][0] = 1;
        // num[0][1] = 2;
        // num[0][2] = 3;
        // num[0][3] = 4;

        // num[1][0] = 5;
        // num[1][1] = 6;
        // num[1][2] = 7;
        // num[1][3] = 8;

        // num[2][0] = 9;
        // num[2][1] = 10;
        // num[2][2] = 11;
        // num[2][3] = 12;

        for(int i = 0;i<3;i++){
            for(int j=0;j<4;j++){
                num[i][j] = (int)(Math.random()*10);
            }
        }

        for(int i=0;i<3;i++){
            for(int j = 0 ; j<4 ; j++){
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for(int n[] : num){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
