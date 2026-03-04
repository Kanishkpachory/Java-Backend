public class Hello {
    public static void main(String arg[]){
        byte num  = 127 ;
        float nuum = 5.6f;
        int num1 = 12;
        short sh = 558;
        long lng = 222;

        System.out.println("Hello world");
        System.out.println(3+7);
        System.out.println(num);
        System.out.println(nuum);
        System.out.println(num1);
        System.out.println(sh);
        System.out.println(lng);

        char c = 'a';
        c++    ;
        System.out.println(c);

        byte b = 12 ;
        int a = 27 ;
        b =(byte) a ; // Casting int into bytes (expelectily it is called casting)
        System.out.println(b);
        a = b ; // conversion (inpicility it is called conversion)
        System.out.println(a);

        float f = 5.6f;
        int x = (int)f;
        System.out.println(x);

        

    }
    
}
