package StaticBlockDay4;

class A{
    public A(){
        System.out.println("object created ,,,,in construrctor ");
    }

    public void show(){
        System.out.println("in A show");
    }
}

public class Demo1 {
    public static void main(String arg[]){
        new A(); // this line is the actual line where object is been created (anonymous object)
        // A obj = new A();  // this line obj take the referce of the new obj A cretead
        new A().show(); //only we can use this object once not mutiple time and if we do so we have to create a new one like done below
        new A().show();
        // A().show();
    }
}
