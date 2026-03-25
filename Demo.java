package Constructor;

class Human{
    private int age;
    private String name;

    public Human(){                             //Default constructor ( no values passed in paramter)
        System.out.println("in constructor");
        age = 12;
        name = "John";
    }
    public Human(int a , String n){             //paramterized constructor (we assign parameter to use in main class directly)
        System.out.println("in constructor  - 2222");
        this.age = a;
        this.name = n;
    }
   
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    
}

public class Demo {
    public static void main(String arg[]){
        Human obj = new Human();
        Human obj2 = new Human(14 , "Kanishk");
        // Human obj1 = new Human();

        // obj.setAge(14);
        // obj.setName("kanishk");
        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj2.getName() + " : " + obj2.getAge());
    }
}
