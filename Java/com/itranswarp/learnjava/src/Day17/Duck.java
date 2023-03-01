package Day17;

public class Duck {
    int size;
    public  Duck(int duckSize){
        System.out.println("Quack");
        size = duckSize;
        System.out.println("The duck size is "+ size);
    }
    public Duck(){
        System.out.println("The overRide");
    }
    public void setSize(int newSize){
        size = newSize;
    }
    public int getSize(){
        System.out.println("The duck size is "+ size);
        return size;
    }
}
