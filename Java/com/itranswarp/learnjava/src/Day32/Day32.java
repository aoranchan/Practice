package Day32;

public class Day32 {
    static int tickets = 15;

    static class SellTickets implements Runnable {
        @Override
        public void run() {
            while (tickets > 0) {
                // 同步代码块
                synchronized (this) {
                    if (tickets <= 0) {
                        return;
                    }
                    System.out.println(Thread.currentThread().getName() + "--->售出第：  " + tickets + " 票");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    tickets--;
                }
                if (tickets <= 0) {
                    System.out.println(Thread.currentThread().getName() + "--->售票结束！");
                }
            }
        }
    }
    public static void test(){
        SellTickets sell = new SellTickets();
        Thread thread1 = new Thread(sell, "1号窗口");
        Thread thread2 = new Thread(sell, "2号窗口");
        Thread thread3 = new Thread(sell, "3号窗口");
        Thread thread4 = new Thread(sell, "4号窗口");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
