package Day26;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day26 {
    public static void ex01(){
        String regex = "20\\d\\d";
        System.out.println("2019".matches(regex)); // true
        System.out.println("2100".matches(regex)); // false
    }
    public static void ex02(){
        Pattern pattern = Pattern.compile("(\\d+)(0*)");
        Matcher matcher = pattern.matcher("1230000");
        if (matcher.matches()) {
            System.out.println("group1=" + matcher.group(1)); // "1230000"
            System.out.println("group2=" + matcher.group(2)); // ""
        }
    }
    public static void test(){
        ex02();
    }
}
