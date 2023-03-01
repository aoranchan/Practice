package Day18;

public class B extends A{
    {
        System.out.println("B 初始化块");
    }

    static{
        System.out.println("B 静态块");
    }

    private static Integer integer=getInteger();

    public B(){
        System.out.println("B 构造函数");
    }

    public static Integer getInteger() {
        System.out.println("B 初始化静态变量");
        return 10000;
    }

    public void getB() {
        System.out.println("B 的普通函数");
    }
}
