package Day28;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.TreeSet;

public class Day28 {
    static int ex01() {
        int x = 1;
        try {
            System.out.println("return 块执行:" + x);
            return x++;
        } finally {
            System.out.println("finally 块执行:" + ++x);
            return x;
        }
    }

    private static void ex06() {
        float f = 42.0f;
        float f1[] = new float[2];
        float f2[] = new float[2];
        float[] f3 = f1;
        long x = 42;
        f1[0] = 42.0f;
        System.out.println(f1 == f3);
        System.out.println(x == f1[0]);
    }

    private static void ex07() {
        int a[] = {4, 2, -7, 5, 1, 6, 3};
        System.out.println(a[a[4]]);
    }

    private static void ex08() {
        System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1);
        System.out.println(1 - 0.9);
    }

    private static void ex09(int number){
        if(number % 2 == 0)
            System.out.println(number + " is even");
        if(number % 5 == 0)
            System.out.println(number + " is multiple of 5");
    }

    private static void ex10(){
        TreeSet<A> set = new TreeSet<A>();
        set.add(new A(3));
        set.add(new B(1));
        set.add(new A(2));
        for (A a : set) {
            System.out.println(a);
        }
        System.out.println(ex01());
        Something something = new Something();
        something.doSomething();
    }

    private static void ex11(){
        int number1 = (int)(Math.random()*10);
        int number2 = (int)(Math.random()*10);
        if(number1 < number2){
            int tmp = number1;
            number1 = number2;
            number2 = tmp;
        }
        Scanner input = new Scanner(System.in);
        System.out.printf("%d - %d = ",number1,number2);
        int ans = input.nextInt();
        if(ans == number1 - number2 ){
            System.out.println("Right!");
        }
    }

    private static void ex12(){
        ArrayList<Date> dates = new ArrayList<>();
        dates.add(new Date());
        dates.add(new Date());
        Date d1 = dates.get(0);
        System.out.println(d1);
    }

    public static void test() {
//        TreeSet<A> set = new TreeSet<A>();
//        set.add(new A(3));
//        set.add(new B(1));
//        set.add(new A(2));
//        for (A a : set) {
//            System.out.println(a);
//        }
//        System.out.println(ex01());
//        Something something = new Something();
//        something.doSomething();
//        int i = -5;
//        i =  ++(i++);
//        System.out.println(i);
//        MyThead s = new MyThead();
//        s.ex05();
//        ex07();
//        ex08();
//        ex09(14);
//        ex09(15);
//        ex09(30);
//        ex11();
        ex12();
    }
}

class A implements Comparable {
    int age;

    public A(int age) {
        this.age = age;
    }

    public int compareTo(Object obj) {
        System.out.println("AAAAAAAAAA");
        A target = (A) obj;
        return Integer.compare(age, target.age);
    }

    public String toString() {
        return getClass() + ",age:" + age;
    }
}

class B extends A implements Comparable {
    public B(int age) {
        super(age);
    }

    public int compareTo(Object obj) {
        System.out.println("BBBBBBBBB");
        A target = (A) obj;
        return Integer.compare(age, target.age);
    }
}

class Something {
    int i;

    public void doSomething() {
        System.out.println("i = " + i);
    }
}

class MyThead extends Thread {
    public void ex05() {
        MyThead t = new MyThead();
        MyThead s = new MyThead();
        t.start();
        System.out.println("one.");
        s.start();
        System.out.println("two.");
    }

    public void run() {
        System.out.println("Thread");
    }
}