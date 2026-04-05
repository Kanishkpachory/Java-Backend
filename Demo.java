package MethodOverwritingDay6;

//👉 Overloading = “same name, different input”
//👉 Overriding = “same method, new behavior”

class A{
    public void show(){
        System.out.println("in A show");
    }
    public void Config(){
        System.out.println("in A config");
    }

}
class B extends A{
    public void show(){  //show method is same in both class and B extends A so its a confilict sitution that which method to chosse  ,, but here show()method of B class will get selected and executed.
        System.out.println("in B show");
    }
}

public class Demo {
    public static void main(String arg[]){
        B obj = new B();
        obj.show();
        obj.Config();
    }
}
