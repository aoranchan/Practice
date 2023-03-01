package Day02;

import java.util.Scanner;

public class Day02 {
    private static void test01() {
        int age = 25;
        String s1 = "Age is " + age;
        System.out.println(s1);
    }

    private static void testArray() {
        int[] array1 = new int[]{10, 20, 30, 40, 50, 80, 90, 100, 1000, 10000, 10000000};
        String[] names = {"张三", "李四", "王五"};
        for (int j : array1) {
            System.out.println(j);
        }
        System.out.println("输出原数组：");
        for (String j : names) {
            System.out.println(j);
        }
        String s = names[1];
        names[1] = "cat";
        System.out.println(s); // s是"XYZ"还是"cat"?
        System.out.println("再次输出数组：");
        for (String j : names) {
            System.out.println(j);
        }
    }

    private static void testPrint() {
        int n = 12345000;
        System.out.printf(" n = %d,hex=%08x", n, n);
    }

    private static void testScanf() {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入您的名字:");
        String name = input.nextLine();
        System.out.print("请输入您的年龄:");
        int age = input.nextInt();
        System.out.printf("您的名字是%s，您的年龄是%d岁。", name, age);
    }

    private static void testImprove() {
        Scanner xiaoMing = new Scanner(System.in);
        System.out.print("请输入您的上次考试成绩:");
        float lastScore = xiaoMing.nextFloat();
        System.out.print("请输入您的这次考试成绩:");
        float score = xiaoMing.nextFloat();
        if (lastScore < 0 || score < 0) {
            System.out.println("您输入的成绩有错误，请您核对后再输入！");
            return;
        }
        if (score > lastScore) {
            float rise = (score - lastScore) / lastScore;
            System.out.printf("恭喜您,您的成绩提高了%.2f%%", rise * 100);
        } else {
            System.out.println("您的成绩还是没有进步，需要加油！！！！");
        }
    }

    private static void oppCity() {
        City bj = new City();
        bj.name = "Beijing";
        bj.latitude = 39.903;
        bj.longitude = 116.401;
        System.out.println(bj.name);
        System.out.println("location: " + bj.latitude + ", " + bj.longitude);
        bj.location();
    }

    private static void testPrivate() {
//        Person ming = new Person();
//        ming.setAge(12);
//        ming.setName("Xiao Ming");
//        System.out.println(ming.getName() + ", " + ming.getAge());
//        Person p = new Person();
//        int n = 15;
//        p.setAge(n);
//        System.out.println(p.getAge());
//        n = 20;
//        System.out.println(p.getAge());
//        Person p = new Person();
//        String[] fullname = new String[]{"Homer", "Simpson"};
//        p.setName(fullname); // 传入fullname数组
//        System.out.println(p.getName()); // "Homer Simpson"
//        fullname[0] = "Bart"; // fullname数组的第一个元素修改为"Bart"
//        System.out.println(p.getName()); // "Homer Simpson"还是"Bart Simpson"?
//        Person p = new Person("xiaoming", 12);
//        System.out.println(p.getAge());
//        System.out.println(p.getName());

    }

//    private static void exPerson() {
//        Person ming = new Person();
//        Person hong = new Person();
//        ming.setName("Xiao Ming");
//        // TODO: 给Person增加重载方法setName(String, String):
//        hong.setName("Xiao", "Hong");
//        System.out.println(ming.getName());
//        System.out.println(hong.getName());
//    }

    private static void testIndexOf() {
        String s = "Test string";
        int n1 = s.indexOf('t');
        int n2 = s.indexOf("st");
        int n3 = s.indexOf("st", 4);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    }

    private static void testStudent() {
        Person p = new Person("小明", 12);
        Student s = new Student("小红", 20, 99);
        // TODO: 定义PrimaryStudent，从Student继承，新增grade字段:
        Student ps = new PrimaryStudent("小军", 9, 100, 5);
        System.out.println(ps.getScore());
    }

    private static double totalTax(Income... incomes) {
        double total = 0;
        for (Income income : incomes) {
            total = total + income.getTax();
        }
        return total;
    }

    private static void exIncome() {
        Income[] incomes = new Income[]{
//                new Income(3000),
                new Salary(7500),
                new StateCouncilSpecialAllowance(15000)
        };
        System.out.println(totalTax(incomes));
    }

    private static void exStatic(){
        Person p = new Person("小明", 12);
        Person t = new Person("xiaohong",18);
        Person s = new Person("张三",28);
        System.out.println(p.getAge());
//        System.out.println(p.count);
        System.out.println(p.getCount());

    }

    private static void testString(){
        String s1 = "runoob";
        String s2 = "runoob";
        System.out.println("s1 == s2 is:" + s1 == s2);
    }

    private static void testIf(){
        int x=3;
        int y=1;
        if(x==y)
            System.out.println("不相等");
        else
            System.out.println("相等");
    }

    private static void testChar(){
        char c = 65;
        System.out.println("c = "+c);
    }

    public static void day02(String[] args) {
//        test01();
//        testArray();
//        testScanf();
//        testImprove();
//        oppCity();
//        testPrivate();
//        testIndexOf();
//        exPerson();
//        testStudent();
//        exIncome();//报税程序
//        exStatic();
//        Flow.test();
//        MathNumber.test();
//        testString();
//        testIf();
//        testChar();
        System.out.println("Day02类成功加载！！！");
        TestDate.test(args);
    }
}

class City {
    String name;
    double latitude;
    double longitude;

    public void location() {
        System.out.println("location: " + this.latitude + ", " + this.longitude);
    }
}

class Person {
    //    private String[] name;
    private int age;
    private String name;
    public static int count;

//    public void setName(String[] name) {
////        if (name == null || name.isBlank()) {
////            throw new IllegalArgumentException("invalid name");
////        }
////        this.name = name.strip(); // 去掉首尾空格
//        this.name = name;
//    }

//    public String getName() {
//        String fullname="";
//        for (int i = 0; i < name.length; i++) {
//            fullname = fullname + " "+ name[i];
//        }
////        System.out.println(fullname);
//        return fullname;
//    }

//    public Person(String name,int age){
//        this.name = name;
//        this.age = age;
//    }

//    public void setAge(int age) {
//        if (age < 0 || age > 120) {
//            System.out.println("Check it,the age is invalid");
//        } else {
//            this.age = age;
//        }
//    }

    //    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public Person(String name) {
//        this.name = name; // 调用另一个构造方法Person(String, int)
//    }
//
//    public Person() {
//        this("Unnamed"); // 调用另一个构造方法Person(String)
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    //    public void setName(String name){
////        this.name = name;
////    }
//    public void setName(String name,String name1){
//        this.name = name +" "+ name1;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//    public String getName() {
//        return name;
//    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    public static int getCount(){
        System.out.println("一共创建了"+count+"个实例!");
        return count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Student extends Person {
    protected int score;

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}

class PrimaryStudent extends Student {
    private int grade;

    public PrimaryStudent(String name, int age, int score, int grade) {
        super(name, age, score);
        this.score = score;
    }

    public int getGrade() {
        return grade;
    }
}

abstract class Income {
    protected double income;

    public Income(double income) {
        this.income = income;
    }

    abstract double getTax();
}

class Salary extends Income {
    public Salary(double income) {
        super(income);
    }

//    public void hello(double income){
//        System.out.println("hello Income!");
//    }

    @Override
    public double getTax() {
        if (income < 5000) {
            return 0;
        }
        return (income - 5000) * 0.2;//大于5000的部分20%
    }
}

class StateCouncilSpecialAllowance extends Income {
    public StateCouncilSpecialAllowance(double income) {
        super(income);
    }

    @Override
    public double getTax() {
        return 0;
    }
}