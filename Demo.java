package StaticBlockDay4;

class Mobile{
    String brand;
    int price;
    static String name;

    static{
        name = "mobile";
        System.out.println("in static");
    }

    public Mobile(){
        brand = "";
        price = 200;
        // name = "Phone";
        System.out.println("in consturutor");
    }

    public void show(){
        System.out.println(brand + " || " + price + " || " + name);
    }
}

public class Demo {
    public static void main(String arg[]) throws ClassNotFoundException{
        // Mobile obj = new Mobile();
        // obj.brand = "Iphone";
        // obj.price = 3000;

        // Mobile obj2 = new Mobile();
        // obj2.brand = "Samsung";
        // obj2.price = 3000;
        

        // obj.show();
        // obj2.show();

        Class.forName("StaticBlockDay4.Mobile");

    }
   
}
