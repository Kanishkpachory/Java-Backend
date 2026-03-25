package Constructor;

//Static variable

class Mobile{
    String brand;
    int price;
    // String name;//
    static String name;

    public void print(){
        System.out.println(brand + " || " + price + " || " + name);
    }
}

public class StaticVariable {
    public static void main(String arg[]){
        Mobile obj = new Mobile();
        Mobile obj2 = new Mobile();

        // obj.name = "Smartphone";
        Mobile.name = "Smartphone";
        obj.brand = "Apple";
        obj.price = 20000;

        // obj2.name = "Smartphone";
        Mobile.name = "Smartphone";
        obj2.brand = "Samsung";
        obj2.price = 30000;

        // obj.name = "phone";  it should be accessed in static way like in next line
        Mobile.name = "phone";


        obj.print();
        obj2.print();
    }
}
