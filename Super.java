package OOPSDay5;

class A extends Object{ // all method are extended to object class and they work accordingly with that 
    public A(){
        super(); // this super is extend to the object class which is present there but we cant see it here for this time we have mention it 
        System.out.println("in A");
    }
    public A(int n){
        super();
        System.out.println("in A INT");
    }
}

class B extends A{
    public B(){
        // super();
        super(4);          // it is alawys present there but we cant see it it means it call the super class constructor always 
        System.out.println("in B");
    }

    public B(int n){
        super(n);
        System.out.println("in B INT");
    }
}

public class Super {
    public static void main(String arg[]){
        B obj = new B();
        // B obj = new B(4);
        
        
    }
}
