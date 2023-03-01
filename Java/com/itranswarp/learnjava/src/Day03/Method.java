package Day03;

public class Method {
    private static void swap(int n1, int n2) {
        System.out.println("\t进入 swap 方法");
        System.out.println("\t\t交换前 n1 的值为：" + n1 + "，n2 的值：" + n2);
        // 交换 n1 与 n2的值
        int temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("\t\t交换后 n1 的值为 " + n1 + "，n2 的值：" + n2);
    }

    private static void testSwap() {
        int num1 = 1;
        int num2 = 2;

        System.out.println("交换前 num1 的值为：" + num1 + " ，num2 的值为：" + num2);

        // 调用swap方法
        swap(num1, num2);
        System.out.println("交换后 num1 的值为：" + num1 + " ，num2 的值为：" + num2);
    }

    private static void testClass(){
        MyClass t1 = new MyClass();
        MyClass t2 = new MyClass();
        System.out.println(t1.x + " " + t2.x);
    }

    private static void finalizationDemo(){
        Cake c1 = new Cake(1);
        Cake c2 = new Cake(2);
        Cake c3 = new Cake(3);

        c2 = c3 = null;
        System.gc(); //调用Java垃圾收集器
    }

    public static void test(){
//        testSwap();
//        testClass();
        finalizationDemo();
    }
}

class MyClass {
    int x;

    // 以下是构造函数
    MyClass() {
        x = 10;
    }
}

class Cake extends Object {
    private int id;
    public Cake(int id) {
        this.id = id;
        System.out.println("Cake Object " + id + "is created");
    }

    protected void finalize() throws java.lang.Throwable {
        super.finalize();
        System.out.println("Cake Object " + id + "is disposed");
    }
}
