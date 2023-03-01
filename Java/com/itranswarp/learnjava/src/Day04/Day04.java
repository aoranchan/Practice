package Day04;

//import Day02.Person;
//import Day02.PrimaryStudent;
//import Day02.Student;

import java.io.IOException;
import java.math.BigDecimal;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

public class Day04 {
    private static void testArray() {
        int[] ns = {1, 4, 9, 16, 25, 36};
        for (int s : ns) {
            System.out.println(s);
        }
    }

    private static void testString() {
        int[] ns = {1, 1, 2, 3, 5, 8};
        System.out.println(Arrays.toString(ns));
    }

    private static void revArray() {
        int[] ns = {1, 4, 9, 16, 25};
        // 倒序打印数组元素:
        for (int n = ns.length - 1; n >= 0; n--) {
            System.out.println(ns[n]);
        }
    }

    private static void bubbleSort() {
        int[] ns = {1, 4, 7, 2, 4, 2, 4, 7, 9, 6, 55, 5, 3, 3, 2, 89, 28, 837, 738};
        // 排序前:
        System.out.print("排序前的数组：");
        System.out.println(Arrays.toString(ns));
        Arrays.sort(ns);
        System.out.print("使用sort方法排序后的数组：");
        System.out.println(Arrays.toString(ns));
        for (int i = 0; i < ns.length - 1; i++) {
            for (int j = 0; j < ns.length - 1 - i; j++) {
                int temp;
                if (ns[j] < ns[j + 1]) {
                    temp = ns[j];
                    ns[j] = ns[j + 1];
                    ns[j + 1] = temp;
                }
            }
        }
        // 排序后:
        System.out.print("排序后的数组：");
        System.out.println(Arrays.toString(ns));
//        for (int s : ns) {
//            System.out.println(s);
//        }
    }

    private static void calAverage() {
        // 用二维数组表示的学生成绩:
        int[][] scores = {
                {82, 90, 91},
                {68, 72, 64},
                {95, 91, 89},
                {67, 52, 60},
                {79, 81, 85},
        };
        // TODO:
        double average = 0;
        int scores_total = 0;
        int scores_amount = 0;
        for (int[] s : scores) {
            for (int t : s) {
                scores_total += t;
            }
            scores_amount = scores.length * s.length;
        }
        average = (double) scores_total / scores_amount;
        System.out.println(average);
    }

    //    private static void testClass(){
//        City bj = new City();
//        bj.name = "Beijing";
//        bj.latitude = 39.903;
//        bj.longitude = 116.401;
//        System.out.println(bj.name);
//        System.out.println("location: " + bj.latitude + ", " + bj.longitude);
//    }
//    private static void testPrivate(){
//        Day04.Person xm = new Day04.Person();
//        xm.setName("小明");
//        xm.setAge(30);
//        System.out.println("这个人叫"+xm.getName()+",今年有"+xm.getAge()+"岁");
//    }
//    private static void testStudent(){
//        Day04.Student Jim = new Day04.Student("Jim",24,99);
//        System.out.print(Jim.name);
//    }
//    private static void testSuper(){
//        Day04.Person p1 = new Day04.Student("李四",30,80); // upcasting, ok
//        Day04.Person p2 = new Day04.Person();
//        Day04.Person p3 = new Day04.Student();
//        Day04.Student s1 = (Day04.Student) p1; // ok
//        System.out.println(s1.score);
////        Day04.Student s2 = (Day04.Person) p3; // runtime error! ClassCastException!
//        Day04.Student s = new Day04.Student();
//        System.out.println(s instanceof Day04.Person); // true
//        System.out.println(s instanceof Day04.Student); // true
//        Day04.Person p = new Day04.Student();
//        System.out.println(p instanceof Day04.Person); // true
//        System.out.println(p instanceof Day04.Student); // true
//    }
//    private static void testinStand(){
//        Object obj = "hello";
//        String s = (String) obj;
//        System.out.println(s.toUpperCase());
//        if (obj instanceof String s) {
//            // 可以直接使用变量s:
//            System.out.println(s.toUpperCase());
//        }
//    }
//    private static void testOther() {
//        Person p = new Person("小明", 12);
//        Student s = new Student("小红", 20, 99);
//        // TODO: 定义PrimaryStudent，从Student继承，新增grade字段:
//        Student ps = new PrimaryStudent("小军", 9, 100, 5);
//        p.run();
//        ps.run();
//        System.out.println(ps.getScore());
//    }

    private static void testInt() {
        int i = 100;
        // 通过new操作符创建Integer实例(不推荐使用,会有编译警告):
        Integer n1 = new Integer(i);
        // 通过静态方法valueOf(int)创建Integer实例:
        Integer n2 = Integer.valueOf(i);
        // 通过静态方法valueOf(String)创建Integer实例:
        Integer n3 = Integer.valueOf("100");
        System.out.println(n3.intValue());
    }

    private static void testEquals() {
        Integer x = 127;
        Integer y = 127;
        Integer m = 99999;
        Integer n = 99999;
        System.out.println("x == y: " + (x == y)); // true
        System.out.println("m == n: " + (m == n)); // false
        System.out.println("x.equals(y): " + x.equals(y)); // true
        System.out.println("m.equals(n): " + m.equals(n)); // true
    }

//    enum Weekday {
//        SUN, MON, TUE, WED, THU, FRI, SAT;
//    }


    private static void testEnum() {
        Weekday day = Weekday.SUN;
//        if (day == Weekday.SAT || day == Weekday.SUN) {
//            System.out.println("Work at home!");
//        } else {
//            System.out.println("Work at office!");
//        }
        if (day.dayValue == 6 || day.dayValue == 0) {
            System.out.println("Today is "+day+"。 Work at home!");
        } else {
            System.out.println("Today is "+day+"。 Work at Office!");
        }
    }

    private static void testBigDecimal(){
        BigDecimal n = new BigDecimal("12.345");
        BigDecimal m = new BigDecimal("0.12");
        BigDecimal[] dr = n.divideAndRemainder(m);
        System.out.println(dr.length);//数组的长度
        System.out.println(dr[0]); // 102
        System.out.println(dr[1]); // 0.105
    }

    public static void testDecimal(){
        BigDecimal d1 = new BigDecimal("123.45");

        System.out.println(d1.scale()); //得出46
        System.out.println(d1); //得出123.4500000000000028421709430404007434844970703125
    }

    public static void testRandom(){
        Random r = new Random(12345);
        for (int i = 0; i < 100; i++) {
            System.out.println(r.nextInt(100));
        }
        // 51, 80, 41, 28, 55...
    }

    public static void testSecureRandom(){
        SecureRandom sr = new SecureRandom();
        for (int i = 0; i < 10; i++) {
            System.out.println(sr.nextInt(10));
        }

    }

    private static void testSecureRandom2(){
        SecureRandom sr = null;
        try {
            sr = SecureRandom.getInstanceStrong(); // 获取高强度安全随机数生成器
        } catch (NoSuchAlgorithmException e) {
            sr = new SecureRandom(); // 获取普通的安全随机数生成器
        }
        byte[] buffer = new byte[16];
        sr.nextBytes(buffer); // 用安全随机数填充buffer
        System.out.println(Arrays.toString(buffer));
    }

    public static void day04(String[] args) throws IOException {
//        testArray();
//        testString();
//        revArray();
//        bubbleSort();
//        calAverage();
//        testClass();
//        testStudent();
//        testSuper();
//        testinStand();
//        testOther();
//        testInt();
//        testEquals();
//        testEnum();
//        testBigDecimal();
//        testDecimal();
//        testRandom();
//        testSecureRandom();
//        testSecureRandom2();
        System.out.println("Day04类成功加载！！！");
//        Input.test(args);
//        ScannerDemo.test(args);
//        ExcepTest.test();
//        TestSuperSub.test();
    }
}

//class City {
//    public String name;
//    public double latitude;
//    public double longitude;
//}
//class Day04.Person {
//    protected String name;
//    protected int age;
//
//    public Day04.Person(){
//
//    }
//    public Day04.Person(String name,int age){
//        this.name = name;
//        this.age = age;
//    }
//}
//class Day04.Student extends Day04.Person{
//    protected int score;
//
//    public Day04.Student(){
//
//    }
//    public Day04.Student(String name,int age,int score){
//        super(name,age);
//        this.score = score;
//    }
//}

//class man {  //JavaBean 快速生成代码Alt+Insert
//    private int age;
//    private String name;
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//}
//
//class Person {
//    protected String name;
//    protected int age;
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void run() {
//        System.out.println("XX");
//    }
//}
//
//class Student extends Person {
//    protected int score;
//
//    public Student(String name, int age, int score) {
//        super(name, age);
//        this.score = score;
//    }
//
//    public int getScore() {
//        return score;
//    }
//
//    @Override
//    public void run() {
//        System.out.print("ZZ");
//    }
//}
//
//class PrimaryStudent extends Student {
//    protected int grade;
//
//    public PrimaryStudent(String name, int age, int score, int grade) {
//        super(name, age, score);
//        this.grade = grade;
//    }
//}

enum Weekday {
//    MON(1), TUE(2), WED(3), THU(4), FRI(5), SAT(6), SUN(0);
//
//    public final int dayValue;
//
//    private Weekday(int dayValue) {
//        this.dayValue = dayValue;
//    }
MON(1,"星期一"), TUE(2,"星期二"), WED(3,"星期三"), THU(4,"星期四"), FRI(5,"星期五"), SAT(6,"星期六"), SUN(0,"星期日");
    public final int dayValue;
    private final String Chinese;
    private Weekday(int dayValue,String Chinese){
        this.dayValue = dayValue;
        this.Chinese = Chinese;
    }

    @Override
    public String toString(){
        return this.Chinese;
    }
}