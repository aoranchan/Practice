package Day18;

public class A {
    {
        System.out.println("A 初始化块");
    }

    static{
        System.out.println("A 静态块");
    }

    private static Integer integer=getInteger();

    public A(){
        System.out.println("A 构造函数");
    }

    public static Integer getInteger() {
        System.out.println("A 初始化静态变量");
        return 10000;
    }

    public void getA() {
        System.out.println("A 的普通函数");
    }
}
