package OOPSDay5;


public class Inheritance {
    public static void main(String arg[]){
        // Calc obj = new Calc();
        // int show =obj.add(2,1);
        // System.out.println(show);

        // AdvCalc obj = new AdvCalc();
        // int x = obj.mul(2, 4);
        // int y = obj.add(2,3 );

        // System.out.println("mul : " + x +" , Add : " + y); 

        VeryAdvCalc obj = new VeryAdvCalc();
        int x = obj.mul(2, 4);
        int y = obj.add(2,3 );
        int z = obj.power(2, 2);

        System.out.println("mul : " + x +" , Add : " + y + " , Power : " + z); 
    }
}
