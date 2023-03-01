package Day20;

public class Ex02 {
    public static void go(){
        Laundry laundry = new Laundry();
        try{
           laundry.doLaundry();
        }catch (PantsException pex){
            System.out.println("pex");
        }catch (LingerieException lex){
            System.out.println("lex");
        }
    }
}
class Laundry{
    public void doLaundry() throws PantsException, LingerieException{

    }
}
class PantsException extends Exception{

}
class LingerieException extends Exception{

}