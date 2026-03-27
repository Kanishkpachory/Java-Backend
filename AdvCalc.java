package OOPSDay5;

public class AdvCalc extends Calc{

    public int div(int a, int b){
        if(b==0){
           System.out.println("B cant be 0");
        }
        return a/b;
    }
    public int mul( int a , int b){
        return a*b;
    }

}
