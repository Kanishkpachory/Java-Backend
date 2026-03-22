package Object;


//Object - properties 

class Calculator{

    int a ;

    public int add(int num1 , int num2){
        System.out.println("in add");
        int sum = num1 + num2;
        return sum;
    }
}


public class Demo {
    public static void main(String arg[]){
        int num1=4;
        int num2=5;

        Calculator calc = new Calculator();
        int result = calc.add(num1,num2);
       // int result = num1+num2;

        System.out.println(result);
    }
}
