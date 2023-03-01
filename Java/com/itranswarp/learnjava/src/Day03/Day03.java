package Day03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.StringJoiner;
//import java.util.StringJoiner;

public class Day03 {
    private static void testEqual() {
        double x = 1 - 9.0 / 10;
        if (Math.abs(x - 0.1) < 0.0000001) {
            System.out.println("x is 0.1");
        } else {
            System.out.println("x is NOT 0.1");
        }
    }

    private static void testStringEqual() {
        String s1 = "hello";
        String s2 = "HELLO".toLowerCase();
        System.out.println(s1);
        System.out.println(s2);
        //判断字符串是否相等用equals方法,不能使用==
        if (s1.equals(s2)) {
            System.out.println("s1 == s2");
        } else {
            System.out.println("s1 != s2");
        }
    }

    private static void calculateBMI() {
        System.out.println("这是一个计算BMI的函数");
        Scanner person = new Scanner(System.in);
        System.out.print("请输入您的身高(米)：");
        float height = person.nextFloat();
        System.out.print("请输入您的体重(公斤)：");
        float weight = person.nextFloat();
        float bmi = weight / (height * height);
        if (bmi < 18.5) {
            System.out.printf("您的bmi指数为：%.2f,太小了，多吃点！", bmi);
        } else if (bmi <= 25) {
            System.out.printf("您的bmi指数为：%.2f,正常,恭喜您！", bmi);
        } else if (bmi <= 28) {
            System.out.printf("您的bmi指数为：%.2f,过重，少吃点！", bmi);
        } else if (bmi <= 32) {
            System.out.printf("您的bmi指数为：%.2f,肥胖，少吃点,锻炼身体！", bmi);
        } else {
            System.out.printf("您的bmi指数为：%.2f,非常肥胖，强烈建议您加强锻炼和控制饮食！", bmi);
        }

    }

    private static void testSwitch() {
        System.out.println("1.单人模式");
        System.out.println("2.多人模式");
        System.out.println("3.退出游戏");
        System.out.print("请输入您的选择：");
        Scanner pick = new Scanner(System.in);
        int option = pick.nextInt();
        if (option < 1 || option > 3) {
            System.out.println("您的选择不正确，请按照提示输入内容!");
        }
        switch (option) {
            case 1:
                System.out.println("您的选择是单人游戏.");
                break;
            case 2:
                System.out.println("您的选择是多人游戏.");
                break;
            case 3:
                System.out.println("logout!");
                break;
            default:
                System.out.print("Input is ");
                break;
        }

    }

    private static void game() {
        System.out.println("1.石头");
        System.out.println("2.剪刀");
        System.out.println("3.布");
        Scanner style = new Scanner(System.in);
        System.out.print("请选手一输入您的选择：");
        int player1 = style.nextInt();
        System.out.print("请选手二输入您的选择：");
        int player2 = style.nextInt();
        int option = player1 * 10 + player2;
        switch (option) {
            case 11:
                System.out.println("11");
                break;
            case 22:
                System.out.println("22");
                break;
            case 33:
                System.out.println("33");
                break;
            case 12:
                System.out.println("12");
                break;
            case 13:
                System.out.println("13");
                break;
            case 21:
                System.out.println("21");
                break;
            case 23:
                System.out.println("23");
                break;
            case 31:
                System.out.println("31");
                break;
            case 32:
                System.out.println("32");
                break;
            default:
                System.out.println("您们遇到了什么？？？");
                break;
        }
    }

    private static void gamePC() {
        System.out.println("1.石头");
        System.out.println("2.剪刀");
        System.out.println("3.布");
        Scanner style = new Scanner(System.in);
        System.out.print("请输入您的选择：");
        int player1 = style.nextInt();
        Random random = new Random();
        int pc = random.nextInt(3) + 1;
        System.out.println("电脑的选择是：" + pc);
        int option = player1 * 10 + pc;
        switch (option) {
            case 11:
                System.out.println("都是石头,平局");
                break;
            case 22:
                System.out.println("都是剪刀,平局");
                break;
            case 33:
                System.out.println("都是布,平局");
                break;
            case 12:
                System.out.println("12您赢了");
                break;
            case 13:
                System.out.println("13您输了");
                break;
            case 21:
                System.out.println("21您输了");
                break;
            case 23:
                System.out.println("23您赢了");
                break;
            case 31:
                System.out.println("31您赢了");
                break;
            case 32:
                System.out.println("32您输了");
                break;
            default:
                System.out.println("您们遇到了什么？？？");
                break;
        }
    }

    private static void testWhile() {
        int sum = 0;
        int i = 0;
        while (i <= 100) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }

    private static void testSum() {
        int sum = 0;
        int m = 20;
        int n = 100;
        while (m <= n) {
            sum = sum + m;
            m++;
        }
        System.out.println(sum);
    }

    private static void testDoWhile() {
        int sum = 0;
        int m = 1;
        do {
            sum = sum + m;
            m++;
        } while (m <= 100);
        System.out.println(sum);
    }

    private static void testDoWhileOnce() {
        int m = 20;
        do {
            System.out.println("XX");
        } while (m <= 10);
        System.out.println("YY");
    }

    private static void testFor() {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    private static void testForArray() {
        int[] ns = {1, 4, 9, 16, 25};
        for (int i = ns.length - 1; i >= 0; i--) {
            System.out.println(ns[i]);
        }
    }

    private static void calPI() {
        double pi = 0;
        double m = 1;
        for (int i = 1; i < 100000000; i++) {
            pi = pi + m / (2 * i - 1);
            m = m * (-1);
        }
        double PI = pi * 4;
        System.out.println(PI);
    }

    private static void testbreak() {
        int sum = 0;
        for (int i = 0; ; i++) {
            sum += i;
            if (i == 100) {
                break;
            }
        }
        System.out.println(sum);
    }

    private static void testContinue() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("begin i = " + i);
            if (i % 2 == 0) {
                continue; // continue语句会结束本次循环
            }
            sum = sum + i;
            System.out.println("end i = " + i);
        }
        System.out.println(sum); // 25
    }

    private static void testArray() {
        int[] scores = new int[]{88, 77, 51, 66};
        Score s = new Score(scores);
        s.printScores();
        scores[2] = 99;
        s.printScores();
    }

    static String buildInsertSql(String table, String[] fields) {
        // TODO:
        StringBuilder sb = new StringBuilder(1024);
        sb.append("INSERT INTO ").append(table).append(" (");
        for (int i = 0; i < fields.length; i++) {
            if (i < fields.length - 1) {
                sb.append(fields[i]).append(", ");
            } else if (i == fields.length - 1) {
                sb.append(fields[i]).append(")");
            }
        }
        sb.append(" VALUES (?, ?, ?)");


        return "" + sb;
    }

    private static void testStringBuild() {
        String[] fields = {"name", "position", "salary"};
        String table = "employee";
        String insert = buildInsertSql(table, fields);
        System.out.println(insert);
        String s = "INSERT INTO employee (name, position, salary) VALUES (?, ?, ?)";
        System.out.println(s.equals(insert) ? "测试成功" : "测试失败");
    }

    private static void JoinString(){
        String[] names = {"Bob", "Alice", "Grace"};
        StringBuilder sb = new StringBuilder();
        sb.append("Hello ");
        for (String name : names) {
            sb.append(name).append(", ");
        }
        // 注意去掉最后的", ":
        sb.delete(sb.length() - 2, sb.length());
        sb.append("!");
        System.out.println(sb.toString());
    }

    static String buildSelectSql(String table, String[] fields) {
        // TODO:
        StringJoiner sql = new StringJoiner(", ", "SELECT ", " FROM "+table);
        for (String field : fields) {
            sql.add(field);
        }
        return sql.toString();
    }

    private static void testStringJoin() {
        String[] fields = { "name", "position", "salary" };
        String table = "employee";
        String select = buildSelectSql(table, fields);
        System.out.println(select);
        System.out.println("SELECT name, position, salary FROM employee".equals(select) ? "测试成功" : "测试失败");
    }

    public static void day03() {
//        testEqual();
//        testStringEqual();
//        calculateBMI();
//        testSwitch();
//        gamePC();
//        testWhile();
//        testSum();
//        testDoWhile();
//        testDoWhileOnce();
//        testFor();
//        testForArray();
//        calPI();
//        testBreak();
//        testContinue();
//        testArray();
//        testStringBuild();
//        JoinString();
//        testStringJoin();
        System.out.println("Day03类成功加载！！！");
//        Reg.test();
//        Method.test();

    }
}


class Score {
    private final int[] scores;

    public Score(int[] scores) {
        this.scores = new int[scores.length];
        for (int i = 0; i < scores.length; i++) {
            this.scores[i] = scores[i];
        }
    }

    public void printScores() {
        System.out.println(Arrays.toString(scores));
    }
}

