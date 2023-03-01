package Day11;

import java.util.List;

public class Day11 {
    private static void ex01() {
        String s1 = "uml";
        String s2 = "uml";
        String s3 = new String("uml");
        String s4 = new String("uml");
        System.out.println(s1 == s2);
        System.out.println(s3 == s4);
        System.out.println(s1.equals(s3));

    }

    private static void ex03() {
        int x = -5;
        int y = -12;
        System.out.println(y % x);

    }

    private static void ex04() {
        int a = 10;
        double b = 3.14;
        System.out.println('A' + a + b);
    }

    private static void ex07() {
        Integer i = 42;
        Long l = 42l;
        double d = 42.0;
//        System.out.println(i == l);
        System.out.println(i == d);
        System.out.println(l == d);
        System.out.println(i.equals(d));
        System.out.println(Math.floor(-8.5));
    }

    private static void ex09() {
        String a = new String("myString");
        String b = "myString";
        String c = "my" + "String";
        String d = c;
        System.out.print(a == b);
        System.out.print(a == c);
        System.out.print(b == c);
        System.out.print(b == d);
    }

    private static void ex10(){
        int i = 0;
        Integer j = new Integer(0);
        System.out.println(i == j);
        System.out.println(j.equals(i));
    }

    public static void day11() {
        ex10();
    }
}