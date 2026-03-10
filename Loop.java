public class Loop {
    //While loop
    public static void main(String arg[]){
        // int i = 0;
        // while(i<5){
                
        //         System.out.println("Run i times " + i);
        //         int x =0;
        //         while(x<=2){
        //             System.out.println("X count " + x);
        //             x++;
        //         }
                
        //         i++;
        // }




        // int i = 2 ;

        // do {
        //     System.out.println("Hii " + i);
        //     i++;
        // }while(i<=5);




        // for(int i=0 ; i<5 ; i++){
        //     System.out.println("Hii " + i);
        // }

        for(int i = 1; i<=7 ; i++){
            switch(i){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Chose a number btw 1-7");
                break;
            
        }
        for(int n = 0 ; n<=24 ; n++){
            System.out.println("Hours in " + i +" day " + n + " Hours ");
        }
        }
    }
}
