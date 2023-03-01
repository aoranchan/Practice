package Day12;

import java.util.TreeSet;

public class Day12 {
    private static void ex03() {
        TreeSet<Integer> set = new TreeSet<Integer>();
        TreeSet<Integer> subSet = new TreeSet<Integer>();
        for (int i = 606; i < 613; i++) {
            if (i % 2 == 0) {
                set.add(i);
            }
        }
        subSet = (TreeSet) set.subSet(608, true, 611, true);
        set.add(609);
        System.out.println(set + " " + subSet);
    }

//    private static void ex06(){
//        Test test = new Test();
//        test.aMethod();
//        int j = test.aMethod();
//        System.out.println(j);
//    }

    private static void ex08() {
        int x = 1;
        float y = 2;
        System.out.println(x / y);
    }

    private static void ex09() {
        int i = 1;
        int a;

    }

    public static void day12() {
//        ex03();
//        ex06();
        ex08();
    }
}

//public class Test{
//    public int aMethod(){
//        static int i = 0;
//        i++;
//        return i;
//    }
//}