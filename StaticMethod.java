package Constructor;

class Mobile{
    String brand;
    int price ;
    static String name;

    public void print(){
        System.out.println(brand + " || " + price + " || " + name);
    }

    public static void print1(){
        System.out.println(name);  // we cant access instant variable or no static barible like brand, price inside this method as it will give error and they are not static varible as well
    }

    // but we can access them through static method if we mwntion paramter to the method 
    public static void print2(Mobile obj){
        System.out.println(obj.brand + " || " + obj.price + " || " + name);
    }
}

public class StaticMethod {
    public static void main(String arg[]){
        Mobile obj = new Mobile();
        Mobile obj2 = new Mobile();

        Mobile.name = "Smartphone";
        obj.brand = "Apple";
        obj.price = 20000;

        Mobile.name = "Smartphone";
        obj2.brand = "Samsung";
        obj2.price = 30000;

        Mobile.name = "phone";


        obj.print();
        obj2.print();
        // obj2.print1();

        Mobile.print1();

        Mobile.print2(obj);
        Mobile.print2(obj2);
    }
    
}
