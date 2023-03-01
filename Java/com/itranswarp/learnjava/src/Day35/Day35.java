package Day35;

import java.util.ArrayList;

public class Day35 {
    private static int ex01(int x) {
        if (x <= 0)
            return 0;
        else if (x == 1)
            return 1;
        else if (x == 2)
            return 2;
        else return ex01(x - 1) + ex01(x - 2);
    }

    private static int ex02(int x) {
        int flag = 0;
        for (int i = 2; i < Math.sqrt(x); i++) {
            if (x % i == 0) {
                flag = 0;
                break;
            }
            flag = 1;
        }
        return flag;
    }

    private static void ex03(){
        ArrayList<String>  st = new ArrayList<>();
        st.add("Java");
        st.add("MySQL");
        st.add("Mybatis");
        st.add("Java");
        st.add("Mybatis");
        System.out.println(st);
        st.remove("Java");
        System.out.println(st);
        st.remove(1);
        System.out.println(st.contains( "123"));
        System.out.println(st);
        System.out.println(st.size());
    }

    public static void test() {
//        for (int i = 1; i <= 30; i++) {
//            System.out.println(i + ":" + ex01(i));
//        }
//        System.out.println(ex02(101));
        ex03();
    }
}
