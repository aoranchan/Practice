package Day17;

public class Boo {
    public Boo(int i) {
    }

    public Boo(String s) {
    }

    public Boo(String s, int i) {
        System.out.println("String s, int i");
    }
}
class SonOfBoo extends Boo {
//    public SonOfBoo(){
//        super("boo");
//    }
//    public SonOfBoo(int i){
//        super("fred");
//    }
    public SonOfBoo(String s){
        super(42);
    }
}