package Object;

class Calculator{
    int y = 5;
    // System.out.println(y); 
    public double add(double num1 , double num2){
        int x;
        // System.out.println(y); 
        // System.out.println(x); 

        return num1+num2;
    }
}

public class MethodOverloading {
    public static void main(String[] arg){
        Calculator obj = new Calculator();
        Calculator obj1 = new Calculator();

        double sum = obj.add(4.5, 2.3);
        double sum1 = obj1.add(2, 3);

        obj.y = 3;

        // System.out.println(sum);
        // System.out.println(sum1);

        
        System.out.println(obj.y);
        System.out.println(obj1.y);



    }
}
