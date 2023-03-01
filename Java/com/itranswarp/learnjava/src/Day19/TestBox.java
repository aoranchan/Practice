package Day19;

public class TestBox {
    Integer i;
    int j;
    public static void test(){
        TestBox t = new TestBox();
        t.go();
    }
    public void go(){
        j = i;
        System.out.println(j);
        System.out.println(i);
    }
}
