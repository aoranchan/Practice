package Day24;

class Day24 implements Runnable{
    public void run(){
        go();
    }
    public void go(){
        try{
            Thread.sleep(2000);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        doMore();
    }
    public void doMore(){
        System.out.println("top o' the stack");
    }
}

public class ThreadTestDrive{
    public static void test(){
        Runnable threadJob = new Day24();
        Thread myThread = new Thread(threadJob);
        myThread.start();
        System.out.println("back in main");
    }
}