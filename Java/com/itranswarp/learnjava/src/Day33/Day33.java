package Day33;

public class Day33 {
    private static void ex01() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.printf("%d * %d = %d\t", j, i, i * j);
            }
            System.out.println("");
        }
    }

    private static void ex02() {
        int i = 1;
        while (i < 10) {
            int j = 1;
            while (j < i + 1) {
                System.out.printf("%d * %d = %d\t", j, i, i * j);
                j++;
            }
            System.out.println("");
            i++;
        }
    }

    private static void ex03(){
        for (int i = 100; i < 1000; i++) {
            int a = i / 100;
            int b = (i - 100 * a)/10;
            int c = (i - 100 * a -10 * b);
            if(Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3) == i){
                System.out.println(""+i + " 是水仙花数！");
            }
        }
    }

    private static void ex04(){
        for (int i = 100; i < 1000; i++) {
            int c = i % 10;
            int b = (i % 100) / 10;
            int a = i / 100;
            if(Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3) == i){
                System.out.println(""+i + " 是水仙花数！");
            }
        }
    }

    private static void ex05(){
        System.out.println("递归！");
    }

    public static void test() {
        ex04();
    }
}
