package Day31;

import java.math.BigDecimal;
import java.util.Scanner;

public class Day31 {
    private static void ex01() {
        BigDecimal sum = BigDecimal.valueOf(2);
        Scanner scanner = new Scanner(System.in);
        BigDecimal num = sum.multiply(sum);
        System.out.println("We will not use 'Hello World!");
        System.out.print("Please input a number:");
        BigDecimal tree = new BigDecimal("0");
        try {
            tree = scanner.nextBigDecimal();
            System.out.println(tree);
        } catch (Exception e) {
            System.out.println("Your input is bad style");
        }
    }

    private static void ex02() {
        System.out.println(Math.pow(2, 31));
    }

    private static void ex03() {
        int n = 100; // 定义变量n，同时赋值为100
        System.out.println("n = " + n); // 打印n的值

        n = 200; // 变量n赋值为200
        System.out.println("n = " + n); // 打印n的值

        int x = n; // 变量x赋值为n（n的值为200，因此赋值后x的值也是200）
        System.out.println("x = " + x); // 打印x的值

        x = x + 100; // 变量x赋值为x+100（x的值为200，因此赋值后x的值是200+100=300）
        System.out.println("x = " + x); // 打印x的值
        System.out.println("n = " + n); // 再次打印n的值，n应该是200还是300？
    }

    private static void ex04() {
        double x = Double.NaN;
        if (Double.isNaN(x)) {
            System.out.println("x's value is " + x);
        }
    }

    private static void ex05(){
        for (int i = 0; i < 0x00FF; i++) {
            char A = (char) i;
            System.out.print(A+ "  ");
            if(i%16 == 0){
                System.out.println("");
            }
        }
    }

    public static void test() {
        ex05();
    }
}
