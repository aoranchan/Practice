package Day06;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.*;
import java.util.Arrays;
import java.util.logging.Logger;

public class Day06 {
    static byte[] toGBK(String s) {
        try {
            // 用指定编码转换String为byte[]:
            return s.getBytes("GBK");
        } catch (UnsupportedEncodingException e) {
            // 如果系统不支持GBK编码，会捕获到UnsupportedEncodingException:
            System.out.println(e); // 打印异常信息
            return s.getBytes(); // 尝试使用用默认编码
        }
    }

//    static byte[] toGBK(String s) {
//        return s.getBytes("GBK");
//    }

    static byte[] toGBK2(String s) throws UnsupportedEncodingException {
        return s.getBytes("GBK");
    }

    static byte[] toGBK3(String s) {
        try {
            return s.getBytes("GBK");
        } catch (UnsupportedEncodingException e) {
            // 先记下来再说:
            e.printStackTrace();
        }
        return null;
    }

    private static void demoTry() {
        byte[] bs = toGBK("中文");
        System.out.println(Arrays.toString(bs));
    }

    private static void demoTry2() {
        try {
            byte[] bs = toGBK2("中文");
            System.out.println(Arrays.toString(bs));
        } catch (UnsupportedEncodingException e) {
            System.out.println(e);
        }
    }

    //    private static void demoTry3() throws Exception{
//        byte[] bs = toGBK2("中文");
//        System.out.println(Arrays.toString(bs));
//    }
//
    private static void demoTry3() {
        byte[] bs = toGBK3("中文");
        System.out.println(Arrays.toString(bs));
    }

    static double tax(int salary, double rate) {
        // TODO: 如果传入的参数为负，则抛出IllegalArgumentException
        if (salary < 0 || rate < 0) {
            throw new IllegalArgumentException("工资或税率不能为空!");
        } else {
            return salary * rate;
        }
    }

    public static void exThrow() {
        System.out.println(tax(2000, 0.1));
        System.out.println(tax(-200, 0.1));
        System.out.println(tax(2000, -0.1));
    }

    public static void exException() {
        String token = login("admin", "pass");
        System.out.println("Token: " + token);
    }

    static String login(String username, String password) {
        if (username.equals("admin")) {
            if (password.equals("password")) {
                return "xxxxxx";
            } else {
                // 抛出LoginFailedException:
                throw new LoginFailedException("Bad username or password.");
            }
        } else {
            // 抛出UserNotFoundException:
            throw new UserNotFoundException("User not found.");
        }
    }

    private static void demoLog() {
        Logger logger = Logger.getGlobal();
        logger.info("start process...");
        logger.warning("memory is running out...");
        logger.fine("ignored.");
        logger.severe("process will be terminated...");
    }

//    private static void exLog(){
//        Logger logger = Logger.getLogger(Day06.class.getName());
//        logger.info("Start process...");
//        try {
//            "".getBytes("invalidCharsetName");
//        } catch (UnsupportedEncodingException e) {
//            // TODO: 使用logger.severe()打印异常
//            logger.severe(e.toString());
//        }
//        logger.info("Process end.");
//    }

    private static void demoProxy() {
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method);
                if (method.getName().equals("morning")) {
                    System.out.println("Good morning, " + args[0]);
                }
                return null;
            }
        };
        Hello hello = (Hello) Proxy.newProxyInstance(
                Hello.class.getClassLoader(), // 传入ClassLoader
                new Class[]{Hello.class}, // 传入要实现的接口
                handler); // 传入处理调用方法的InvocationHandler
        hello.morning("Bob");
    }


    private static void demoComparable() {
        Person[] ps = new Person[]{
                new Person("Bob", 61),
                new Person("Alice", 88),
                new Person("Lily", 75),
        };
        Arrays.sort(ps);
        System.out.println(Arrays.toString(ps));
    }

    private static void testIntpair() {
        Class<IntPair> clazz = IntPair.class;
        Type t = clazz.getGenericSuperclass();
        if (t instanceof ParameterizedType) {
            ParameterizedType pt = (ParameterizedType) t;
            Type[] types = pt.getActualTypeArguments(); // 可能有多个泛型类型
            Type firstType = types[0]; // 取第一个泛型类型
            Class<?> typeClass = (Class<?>) firstType;
            System.out.println(typeClass); // Integer
        }
    }

//    private static void demoLogFactory(){
//        Log log = LogFactory.getLog(Day06.class);
//        log.info("start...");
//        log.warn("end.");
//    }

//    private static void demoConstructor() throws Exception{
//        // 获取构造方法Integer(int):
//        Constructor cons1 = Integer.class.getConstructor(int.class);
//        // 调用构造方法:
//        Integer n1 = (Integer) cons1.newInstance(123);
//        System.out.println(n1);
//
//        // 获取构造方法Integer(String)
//        Constructor cons2 = Integer.class.getConstructor(String.class);
//        Integer n2 = (Integer) cons2.newInstance("456");
//        System.out.println(n2);
//    }

    public static void day06() {
//        demoTry3();
//        demoTry2();
//        exThrow();
//        exException();
//        demoLog();
//        exLog();
//        demoLogFactory();
//        demoConstructor();
//        demoProxy();
//        demoComparable();
        System.out.println("Day06类成功加载！！！");
//        testIntpair();
//        GenericMethodTest.test();
//        MaximumTest.test();
//        SerializeDemo.test();
//        DeserializeDemo.test();
//        GreetingServer.server(new String[]{"6066"});
//        GreetingClient.client(new String[]{"localhost", "6066"});
        TestThread.test();
    }
}

interface Hello {
    void morning(String name);
}

class Person implements Comparable<Person> {
    String name;
    int score;

    Person(String name, int score) {
        this.name = name;
        this.score = score;
    }

    //    public int compareTo(Person other) {
//        return this.name.compareTo(other.name);
//    }
    @Override
    public int compareTo(Person other) {

        int score = other.score - this.score;

        if (score == 0) {
            score = this.name.compareTo(other.name);
        }

        return score;
    }

    public String toString() {
        return this.name + ":" + this.score;
    }
}

class Pair<T> {
    private T first;
    private T last;

    public Pair(T first, T last) {
        this.first = first;
        this.last = last;
    }

    public T getFirst() {
        return first;
    }

    public T getLast() {
        return last;
    }
}

class IntPair extends Pair<Integer> {
    public IntPair(Integer first, Integer last) {
        super(first, last);
    }
}