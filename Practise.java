package Object;

class Computer{
    public void playMusic(){
        System.out.println("Music Playing..");
    }

    public String getPen(int cost){
        if(cost>=5)
            return "Pen";
        else
            return "No-Pen";
    }

}

public class Practise {
    public static void main(String[] a){
        Computer obj = new Computer();
        obj.playMusic();
        String store = obj.getPen(3 );
        System.out.println(store);
        
    }
   
}
