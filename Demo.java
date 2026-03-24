package Encapsulation;

class Human{
    // private int age = 11;
    // private String name = " kanishk";

    private int age;
    private String name;
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    // public void setAge(int age , Human obj) {
    //     Human obj2 = obj;
    //     obj2.age = age;
    // }
    public void setAge(int age) {
       this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }

}

public class Demo {
    public static void main(String arg[]){
        Human obj = new Human();
        // human.ageobj
        // human.name = "Navin";

        // obj.setAge(14 , obj);
        obj.setAge(14 );
        obj.setName("pachory");

        System.out.println(obj.getName() + " : " + obj.getAge());


    }
}
