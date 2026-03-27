package OOPSDay5;

class A extends Object{
    public A(){
        System.out.println("in A");
    }
    public A(int n){
        System.out.println("in A INT");
    }
}

class B extends A{
    public B(){
        super();            // super will exectue constructor of super class 
        System.out.println("in B");
    }

    public B(int n){
        this();         // it execute the constructor of the this class default constructor
        System.out.println("in B INT");
    }
}

public class This {
      public static void main(String arg[]){
        // B obj = new B();
        B obj = new B(4);
        
    }
}
