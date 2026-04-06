package PackagesDay7.Main;

import PackagesDay7.Pera;
import PackagesDay7.Create.*; //thorigh this we can call all the java files and packages inside the folder but we cant call folder thorugh this it only call all the java files present is the package

// import PackagesDay7.Create.A;
// import PackagesDay7.Create.B;

public class Demo {
    public static void main(String arg[]) throws ClassNotFoundException {
        A obj = new A();
        B obj2 = new B();
        // Pera pera = new Pera();

        Class.forName("PackagesDay7.Pera");
    }
}
