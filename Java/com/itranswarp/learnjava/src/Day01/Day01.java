package Day01;

import java.util.Arrays;
import java.util.Scanner;


public class Day01 {

    private static void helloWorld() {
        System.out.println("Hello World!");
    }

    private static void variable() {
        int x = 100;
        System.out.println(x);
        x = 300;
        System.out.println(x);
    }

    private static void testVariable() {
        int x = 100; //声明整型变量x 并赋值100
        System.out.println("x = " + x);
        x = 200;
        System.out.println("x = " + x);
        int n = x;
        System.out.println("n = " + n);
        x = x + 100;
        System.out.println("x = " + x);
        System.out.println("n = " + n);
    }

    private static void calculateFloat() {
        double x1 = 1.0 / 10;
        double x2 = 1 - 9.0 / 10;
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }

    private static void test01() {
        int n = 5;
        double m = 1.2 + 24.0 / n;
        System.out.println(m);
    }

    private static void test03() {
        int i = (100 + 200) * (99 - 88); // 3300
        int n = 7 * (5 + (i - 9)); // 23072
        System.out.println(i);
        System.out.println(n);
    }

    private static void test04() {
        int n = 3300;
        n++; // 3301, 相当于 n = n + 1;
        n--; // 3300, 相当于 n = n - 1;
        int y = 100 + (++n); // 不要这么写
        System.out.println(y);
    }

    private static void test05() {
        int n = 3300;
        n++; // 3301, 相当于 n = n + 1;
        n--; // 3300, 相当于 n = n - 1;
        int y = 100 + (n++); // 不要这么写
        System.out.println(y);
    }

    private static void test02() {
        int n1 = (int) 1.2;
        System.out.println(n1);
    }

    private static void test06(int i) {
        String s = Integer.toBinaryString(i);
        System.out.println(s);
    }

    private static int decToBin(int x) {
        int t = 0;
        int a;
        for (int i = 1; x > 0; i = i * 10) {
            a = x % 2;
            x = x / 2;
            t = t + a * i;
        }
        return t;
    }

    private static void mathRoot(double a, double b, double c) {
        double r1, r2;
        r1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        r2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        System.out.println("方程有两个根,分别是" + r1 + "和" + r2);
        System.out.println(r1 == 1 && r2 == -4 ? "测试通过" : "测试失败");
    }

    private static void absoluteValue(double n) {
        double x = n > 0 ? n : -n;
        System.out.println(n + "的绝对值是：" + x);
    }

    private static void testString() { //字符串指向变更
        String s = "hello";
        String h = s;
        s = "World!";
        System.out.println(h);
    }

    private static void conString() {
        int a = 72;
        int b = 105;
        int c = 65281;
//        FIXME:
//        String n = String.valueOf(a)+String.valueOf(b)+String.valueOf(c);
        String s = "" + (char) a + (char) b + (char) c;
        System.out.println(s);
//        System.out.println(n);
    }

    private static void testArray() {
        String[] names = {"ABC", "XYZ", "zoo"};
        String[] s = names;
        names[1] = "cat";
        System.out.println(s[1]); // s是"XYZ"还是"cat"?
    }

    private static void testFloat() {
        double x = 1 - 9.0 / 10;
//        if (x == 0.1) {
//            System.out.println("x is 0.1");
//        } else {
//            System.out.println("x is NOT 0.1");
//        }
        if (Math.abs(x - 0.1) < 0.00001) {
            System.out.println("x is 0.1");
        } else {
            System.out.println("x is NOT 0.1");
        }
    }

    private static void testEqual() {
//        String s1 = "hello";
//        String s2 = "HELLO".toLowerCase();
//        System.out.println(s1);
//        System.out.println(s2);
//        if (s1 == s2) {
//            System.out.println("s1 == s2");
//        } else {
//            System.out.println("s1 != s2");
//        }
        String s1 = "hello";
        String s2 = "HELLO".toLowerCase();
        System.out.println(s1);
        System.out.println(s2);
        if (s1.equals(s2)) {
            System.out.println("s1 equals s2");
        } else {
            System.out.println("s1 not equals s2");
        }
    }

    private static void ex01(){
        double height,weight;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的体重(kg):");
        weight = scanner.nextDouble();
        System.out.println("请输入您的身高(m):");
        height = scanner.nextDouble();
        double BMI = weight/(height * height);
        System.out.printf("您的身高是%3.2f米, 体重是 %4.1f千克\n", height, weight);
        if(BMI < 18.5){
            System.out.println("过轻,请注意营养!");
        }else if(BMI <25){
            System.out.println("正常,继续保持!");
        }else if(BMI < 28){
            System.out.println("过重,请注意饮食!");
        }else if(BMI < 32){
            System.out.println("肥胖,请注意饮食，加强锻炼，少吃点!");
        }else {
            System.out.println("非常肥胖,请注意饮食，关注您的健康!");
        }

    }

//    private static void testYield(){
//        String fruit = "orange";
//        int opt = switch (fruit) {
//            case "apple" -> 1;
//            case "pear", "mango" -> 2;
//            default -> {
//                int code = fruit.hashCode();
//                yield code; // switch语句返回值
//            }
//        };
//        System.out.println("opt = " + opt);
//    }

    private static void testwhile(){
        int sum = 0;
        int m = 20;
        int n = 100;
        // 使用while计算M+...+N:
        while (m <= n) {
            sum = sum + m;
            m++;
        }
//        while (true) {
//
//            sum+=m++;
//
//            if(m>n) break;
//
//        }
        System.out.println(sum);
    }

    private static void testDoWhile(){
        int sum = 0;
        int n = 1;
        do {
            sum = sum + n;
            n ++;
        } while (n <= 100);
        System.out.println(sum);
    }

    private static void testfor(){
        // for each
        int[] ns = { 1, 4, 9, 16, 25 };
        for (int n : ns) {
            System.out.println(n);
        }
    }

    private static void calPI(){
        double pi = 0;
        double j = 1.0;
        for (int i =1;i < 1000000000;i = i+2) {
            pi = pi + 4*j/i;
            j = -j;
        }
        System.out.println(pi);
    }

    private static void testBreak(){
        int sum = 0;
        for (int i=1; ; i++) {
            sum = sum + i;
            if (i == 100) {
                break;
            }
        }
        System.out.println(sum);
    }

    private static void printTable(){
        for (int i=1; i<=9; i++) {
//            System.out.println("i = " + i);
            for (int j=1; j<=9; j++) {
                System.out.printf("%d * %d = %d\t",j,i,i*j);
                if (j >= i) {
                    break;
                }
            }
            // break跳到这里
            System.out.println("");
        }
    }

    private static void printTable2(){
        for (int i=1; i<=9; i++) {
//            System.out.println("i = " + i);
            for (int j=1; j<=9; j++) {
                if (j > i) {
                    continue;
                }
                System.out.printf("%d * %d = %d\t",j,i,i*j);
            }
            // break跳到这里
            System.out.println("");
        }
    }

    private static void ergodicArray(){
        int[] ns = { 1, 4, 9, 16, 25 };
        for (int n : ns) {
            System.out.println(n);
        }
        System.out.println(Arrays.toString(ns));
        for (int i = ns.length-1; i >=0; i--) {
            System.out.println(ns[i]);
        }
    }

    private static void bubSort(){
        int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        // 排序前:
        System.out.print("排序前：");
        System.out.println(Arrays.toString(ns));
        for (int i = 0; i < ns.length - 1; i++) {
            for (int j = 0; j < ns.length - i - 1; j++) {
                if (ns[j] > ns[j+1]) { //升序交换
                    // 交换ns[j]和ns[j+1]:
                    int tmp = ns[j];
                    ns[j] = ns[j+1];
                    ns[j+1] = tmp;
                }
            }
        }
        // 排序后:
        System.out.print("排序后：");
        System.out.println(Arrays.toString(ns));
    }

    private static void revBubSort(){
        int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        // 排序前:
        System.out.print("排序前：");
        System.out.println(Arrays.toString(ns));
        Arrays.sort(ns);//升序
        for (int i = 0; i < ns.length/2 ; i++) {
            int tmp = ns[i];
            ns[i] = ns[ns.length-1-i];
            ns[ns.length-1-i] = tmp;
        }
        // 排序后:
        System.out.print("排序后：");
        System.out.println(Arrays.toString(ns));
    }

    private static void twoDimArray(){
//        int[][] ns = {
//                { 1, 2, 3, 4 },
//                { 5, 6, 7, 8 },
//                { 9, 10, 11, 12 }
//        };
        int[][] ns = {
                { 1, 2, 3, 4 },
                { 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println(Arrays.deepToString(ns));
        System.out.println("for循环输出：");
        for (int i = 0; i < ns.length; i++) {
            for (int j = 0; j < ns[i].length; j++) {
                System.out.print(ns[i][j]+"  ");
            }
            System.out.print('\n');
        }
        System.out.println("for each输出");
        for (int[] arr : ns){
            for (int n :arr){
                System.out.print(n+"  ");
            }
            System.out.println("");
        }
    }

    private static void exArray(){
        // 用二维数组表示的学生成绩:
        int[][] scores = {
                { 82, 90, 91 },
                { 68, 72, 64 },
                { 95, 91, 89 },
                { 67, 52, 60 },
                { 79, 81, 85 },
        };
        // TODO:
        double average = 0;
        int num = 0;
        double total = 0.0;
        for (int i = 0; i < scores.length; i++) {
            num = num + scores[i].length;
            for (int j = 0; j < scores[i].length; j++) {
                total = total +scores[i][j];
            }
        }
        average = total/num;
        System.out.println(average);
    }

    private static void conversion(){
        int i = 128;
        byte b = (byte)i;
        System.out.println(b);
        char c1='a';//定义一个char类型
        int i1 = c1;//char自动类型转换为int
        System.out.println("char自动类型转换为int后的值等于"+i1);
        char c2 = 'A';//定义一个char类型
        int i2 = c2+1;//char 类型和 int 类型计算
        System.out.println("char类型和int计算后的值等于"+i2);
        char c3 = (char)i2;
        System.out.println("int类型转化强制成char类型：" +c3);
    }


    public static void test() {
//        variable();
//        helloWorld();
//        testVariable();
//        calculateFloat();
//        test01();
//        test02();
//        mathRoot(1.0, 3.0, -4.0);
//        absoluteValue(-244.389);
//        testString();
//        conString();
//        testArray();
//        testFloat();
//        testEqual();
//        ex01();
//        testYield();
//        testwhile();
//        testDoWhile();
//        testfor();
//        calPI();
//        testBreak();
//        printTable();
//        printTable2();
//        ergodicArray();
//        bubSort();
//        revBubSort();
//        twoDimArray();
//        exArray();
//        test();
//        PrimitiveTypeTest.test();
//        Type.test();//数据类型的默认值
//        conversion();
        System.out.println("Day01类成功加载！！！");
    }
}
