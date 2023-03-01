package Day07;

import java.util.*;

public class Day07 {

    private static void demoList() {
        List<String> list = new ArrayList<>();
        list.add("apple"); // size=1
        list.add("pear"); // size=2
        list.add("apple"); // 允许重复添加元素，size=3
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    private static void demoList2() {
        List<String> list = new ArrayList<>();
        list.add("apple"); // size=1
        list.add(null); // size=2
        list.add("pear"); // size=3
        String second = list.get(1); // null
        System.out.println(second);
    }

    private static void demoTraverse() {
//        List<String> list = List.of("apple", "pear", "banana");
//        for (Iterator<String> it = list.iterator(); it.hasNext(); ) {
//            String s = it.next();
//            System.out.println(s);
//        }  //java9提供
        List<String> list = new ArrayList<>(Arrays.asList("apple", "pear", "banana"));
        for (Iterator<String> it = list.iterator(); it.hasNext(); ) {
            String s = it.next();
            System.out.println(s);
        }
    }

    private static void demoTraverse2() {
        List<String> list = new ArrayList<>(Arrays.asList("apple", "pear", "banana"));
        for (Iterator<String> it = list.iterator(); it.hasNext(); ) {
            String s = it.next();
            System.out.println(s);
        }
    }

    private static void exList1() {
        // 构造从start到end的序列：
        final int start = 10;
        final int end = 20;
        List<Integer> list = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            list.add(i);
        }
        // 随机删除List中的一个元素:
        int removed = list.remove((int) (Math.random() * list.size()));
        int found = findMissingNumber(start, end, list);
        System.out.println(list.toString());
        System.out.println("missing number: " + found);
        System.out.println(removed == found ? "测试成功" : "测试失败");
    }

    private static void exList2() {
        // 构造从start到end的序列：
        final int start = 10;
        final int end = 20;
        List<Integer> list = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            list.add(i);
        }
        // 洗牌算法shuffle可以随机交换List中的元素位置:
        Collections.shuffle(list);
        // 随机删除List中的一个元素:
        int removed = list.remove((int) (Math.random() * list.size()));
        int found = findMissingNumber(start, end, list);
        System.out.println(list.toString());
        System.out.println("missing number: " + found);
        System.out.println(removed == found ? "测试成功" : "测试失败");
    }

    static int findMissingNumber(int start, int end, List<Integer> list) {
        for (int i = start; i <= end; i++) {
            if (!list.contains(i)) {
                return i;
            }
        }
        return 0;
    }

    private static void demoContains() {
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));
        System.out.println(list.contains(new String("C"))); // true or false?
        System.out.println(list.indexOf(new String("C"))); // 2 or -1?
    }

    private static void exEqual() {
        List<Person> list = new ArrayList<>(Arrays.asList(
                new Person("Xiao", "Ming", 18),
                new Person("Xiao", "Hong", 25),
                new Person("Bob", "Smith", 20)
        ));
        boolean exist = list.contains(new Person("Bob", "Smith", 20));
        System.out.println(exist ? "测试成功!" : "测试失败!");
    }

    private static void demomap() {
        Student s = new Student("Xiao Ming", 99);
        Map<String, Student> map = new HashMap<>();
        map.put("Xiao Ming", s); // 将"Xiao Ming"和Student实例映射并关联
        Student target = map.get("Xiao Ming"); // 通过key查找并返回映射的Student实例
        System.out.println(target == s); // true，同一个实例
        System.out.println(target.score); // 99
        Student another = map.get("Bob"); // 通过另一个key查找
        System.out.println(another); // 未找到返回null
    }

    private static void demoHashMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 123);
        map.put("pear", 456);
        System.out.println(map.get("apple")); // 123
        map.put("apple", 789); // 再次放入apple作为key，但value变为789
        System.out.println(map.get("apple")); // 789
    }

    private static void demoMap2() {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 123);
        map.put("pear", 456);
        map.put("banana", 789);
        for (String key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }

    private static void demoEntrySet() {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 123);
        map.put("pear", 456);
        map.put("banana", 789);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " : " + value);
        }
    }

    private static void exMap() {
        List<Student> list = new ArrayList<>(Arrays.asList(
                new Student("Bob", 78),
                new Student("Alice", 85),
                new Student("Brush", 66),
                new Student("Newton", 99)));
        Students holder = new Students(list);
        System.out.println(holder.getScore("Bob") == 78 ? "测试成功!" : "测试失败!");
        System.out.println(holder.getScore("Alice") == 85 ? "测试成功!" : "测试失败!");
        System.out.println(holder.getScore("Tom") == -1 ? "测试成功!" : "测试失败!");
    }

    private static void testMap() {
        String key1 = "a";
        Map<String, Integer> map = new HashMap<>();
        map.put(key1, 123);

        String key2 = new String("a");
        map.get(key2); // 123

        System.out.println(key1 == key2); // false
        System.out.println(key1.equals(key2)); // true
    }


    static List<Message> process(List<Message> received) {
        // TODO: 按sequence去除重复消息
        HashSet<Message> messageSet = new HashSet<>(received);
        ArrayList<Message> messageList = new ArrayList<>(messageSet);
        return messageList;
//        return received;
    }

    private static void exSet() {
        List<Message> received = new ArrayList<>(Arrays.asList(
                new Message(1, "Hello!"),
                new Message(2, "发工资了吗？"),
                new Message(2, "发工资了吗？"),
                new Message(3, "去哪吃饭？"),
                new Message(3, "去哪吃饭？"),
                new Message(4, "Bye")
        ));
        List<Message> displayMessages = process(received);
        for (Message message : displayMessages) {
            System.out.println(message.text);
        }
    }

    private static void demoPoll() {
        Queue<String> q = new LinkedList<>();
        // 添加3个元素到队列:
        q.offer("apple");
        q.offer("pear");
        q.offer("banana");
        // 从队列取出元素:
        System.out.println(q.poll()); // apple
        System.out.println(q.poll()); // pear
        System.out.println(q.poll()); // banana
        System.out.println(q.poll()); // null,因为队列是空的
    }

    private static void demoPeek() {
        Queue<String> q = new LinkedList<>();
        // 添加3个元素到队列:
        q.offer("apple");
        q.offer("pear");
        q.offer("banana");
        // 队首永远都是apple，因为peek()不会删除它:
        System.out.println(q.peek()); // apple
        System.out.println(q.peek()); // apple
        System.out.println(q.peek()); // apple
    }

    private static void demoPriorityQueue() {
        Queue<User> q = new PriorityQueue<>(new UserComparator());
        // 添加3个元素到队列:
        q.offer(new User("Bob", "A1"));
        q.offer(new User("Alice", "A2"));
        q.offer(new User("Allen", "A11"));
        q.offer(new User("Cook", "A22"));
        q.offer(new User("Jim", "A100"));
        q.offer(new User("Green", "V5"));
        q.offer(new User("Sherry", "V102"));
        q.offer(new User("House", "V11"));
        q.offer(new User("Boss", "V1"));
//        System.out.println(q.poll()); // Boss/V1
//        System.out.println(q.poll()); // Bob/A1
//        System.out.println(q.poll()); // Alice/A2
//        System.out.println(q.poll()); // null,因为队列为空
        while (q.peek() != null) {
            System.out.println(q.poll());
        }
    }

//    public static List iteratorRemove(List list, Object element) {
//        Iterator iterator = list.iterator();
//        while (iterator.hasNext()) {
//            Object cur = iterator.next();
//            if (cur.equals(element)) {
//                // 注意！！！这里时Iterator.remove()!!!而不是list.remove()!!!
//                iterator.remove();
//            }
//        }
//        return list;
//    }

    private static void demoDeque() {
        Deque<String> deque = new LinkedList<>();
        deque.offerLast("A"); // A
        deque.offerLast("B"); // A <- B
        deque.offerFirst("C"); // C <- A <- B
        System.out.println(deque.pollFirst()); // C, 剩下A <- B
        System.out.println(deque.pollLast()); // B, 剩下A
        System.out.println(deque.pollFirst()); // A
        System.out.println(deque.pollFirst()); // null
    }

    static String toHex(int n) {
        Deque<String> stack = new LinkedList<>();
        int mod = n / 16;
        int rem = n % 16;
        while (mod != 0 || rem != 0) {
            stack.push(Integer.toHexString(rem));
            n = mod;
            mod = n / 16;
            rem = n % 16;
        }
        String s = "";
        while (!stack.isEmpty()) {
            s = s + stack.pop();
        }
        return s;
    }

    private static void exStack1() {
        String hex = toHex(12500);
        if (hex.equalsIgnoreCase("30D4")) {
            System.out.println("测试通过");
        } else {
            System.out.println("测试失败");
        }
    }

    private static void demoIterator() {
        ReverseList<String> rlist = new ReverseList<String>();
        rlist.add("Apple");
        rlist.add("Orange");
        rlist.add("Pear");
        for (String s : rlist) {
            System.out.println(s);
        }
    }

    private static void demoCollections1(){
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("pear");
        list.add("orange");
        // 排序前:
        System.out.println(list);
        Collections.sort(list);
        // 排序后:
        System.out.println(list);
    }

    private static void demoCollections2(){
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<10; i++) {
            list.add(i);
        }
        // 洗牌前:
        System.out.println(list);
        Collections.shuffle(list);
        // 洗牌后:
        System.out.println(list);
    }

    private static void demoCollections3(){
        List<String> mutable = new ArrayList<>();
        mutable.add("apple");
        mutable.add("pear");
        // 变为不可变集合:
        List<String> immutable = Collections.unmodifiableList(mutable);
        mutable.add("orange");
        System.out.println(immutable);
    }

    private static void demoCollections4(){
        List<String> mutable = new ArrayList<>();
        mutable.add("apple");
        mutable.add("pear");
        // 变为不可变集合:
        List<String> immutable = Collections.unmodifiableList(mutable);
        // 立刻扔掉mutable的引用:
        mutable = null;
        System.out.println(immutable);
    }

    public static void day07() {
//        demoList();
//        demoList2();
//        demoTraverse();
//        exList2();
//        demoContains();
//        exEqual();
//        demomap();
//        demoHashMap();
//        demoMap2();
//        demoEntrySet();
//        exMap();
//        testMap();
//        exSet();
//        demoPoll();
//        demoPeek();
//        demoPriorityQueue();
//        demoDeque();
//        exStack1();
//        demoIterator();
        demoCollections1();
        demoCollections2();
        demoCollections3();
        demoCollections4();
    }
}


class Person {
    String firstName;
    String lastName;
    int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    @Override
    public int hashCode() {
        int h = 0;
        h = 31 * h + firstName.hashCode();
        h = 31 * h + lastName.hashCode();
        h = 31 * h + age;
        return h;
    }

    public boolean equals(Object o) {
        if (o instanceof Person) {
            Person p = (Person) o;
            return Objects.equals(this.firstName, p.firstName) && Objects.equals(this.lastName, p.lastName) && this.age == p.age;
        }
        return false;
    }
}

//class Student {
//    public String name;
//    public int score;
//
//    public Student(String name, int score) {
//        this.name = name;
//        this.score = score;
//    }
//}

class Students {
    List<Student> list;
    Map<String, Integer> cache;

    Students(List<Student> list) {
        this.list = list;
        cache = new HashMap<>();
    }

    /**
     * 根据name查找score，找到返回score，未找到返回-1
     */
    int getScore(String name) {
        // 先在Map中查找:
        Integer score = this.cache.get(name);
        if (score == null) {
            // TODO:
            score = findInList(name);
            if (score != null) {
                // 存在，缓存到MAP，下次查找则直接查询MAP
                this.cache.put(name, score);
            } else {
                System.out.printf("学生名：%s, 系统中不存在!", name);
            }
        }
        return score == null ? -1 : score.intValue();
    }

    Integer findInList(String name) {
        for (Student ss : this.list) {
            if (ss.name.equals(name)) {
                return ss.score;
            }
        }
        return null;
    }
}

class Student {
    String name;
    int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class Message {
    public final int sequence;
    public final String text;

    public Message(int sequence, String text) {
        this.sequence = sequence;
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return sequence == message.sequence && Objects.equals(text, message.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sequence, text);
    }
}

class UserComparator implements Comparator<User> {
    public int compare(User u1, User u2) {
        if (u1.number.charAt(0) == u2.number.charAt(0)) {
            // 如果两人的号都是A开头或者都是V开头,比较号的大小:
//            return u1.number1.compareTo(u2.number1);
            // 相同的字母开头，截取后面的值
            int v1 = u1.number.length();
            int v2 = u2.number.length();
            String n1 = u1.number.substring(1, v1);
            String n2 = u2.number.substring(1, v2);
            // 负值，n1排前面
            return Integer.parseInt(n1) - Integer.parseInt(n2);
        }
        if (u1.number.charAt(0) == 'V') {
            // u1的号码是V开头,优先级高:
            return -1;
        } else {
            return 1;
        }
    }
}

class User {
    public final String name;
    public final String number;

    public User(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String toString() {
        return name + "/" + number;
    }
}

class ReverseList<T> implements Iterable<T> {

    private List<T> list = new ArrayList<>();

    public void add(T t) {
        list.add(t);
    }

    @Override
    public Iterator<T> iterator() {
        return new ReverseIterator(list.size());
    }

    class ReverseIterator implements Iterator<T> {
        int index;

        ReverseIterator(int index) {
            this.index = index;
        }

        @Override
        public boolean hasNext() {
            return index > 0;
        }

        @Override
        public T next() {
            index--;
            return ReverseList.this.list.get(index);
        }
    }
}