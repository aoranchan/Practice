package Day17;

public class Day17 {
    public static void ex01(){
        Duck d = new Duck(55);
        Duck s = new Duck();
        s.setSize(42);
        System.out.println(d.getSize());
        System.out.println(d.getClass());
        System.out.println(s.getSize());
        System.out.println(s.getClass());
    }
    public static void ex02(){
        SonOfBoo s = new SonOfBoo("5");
        System.out.println("This correct!!");
    }
}
