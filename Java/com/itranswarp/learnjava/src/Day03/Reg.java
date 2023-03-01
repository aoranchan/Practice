package Day03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg {
    private static void regText(){
        String content = "I am noob " +
                "from runoob.com.";

        String pattern = ".*runoob.*";

        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println("字符串中是否包含了 'runoob' 子字符串? " + isMatch);
    }

    private static void regGroup(){
        // 按指定模式在字符串查找
        String line = "This order was placed for QT3000! OK?";
        String pattern = "(\\D*)(\\d+)(.*)";

        // 创建 Pattern 对象
        Pattern r = Pattern.compile(pattern);

        // 现在创建 matcher 对象
        Matcher m = r.matcher(line);
        if (m.find( )) {
            System.out.println("Found value: " + m.group(0) );
            System.out.println("Found value: " + m.group(1) );
            System.out.println("Found value: " + m.group(2) );
            System.out.println("Found value: " + m.group(3) );
        } else {
            System.out.println("NO MATCH");
        }
    }
    private static final String REGEX = "\\bcat\\b";
    private static final String INPUT = "cat cat cat cattie cat";

    private static void demoRegMatch(){
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(INPUT); // 获取 matcher 对象
        int count = 0;

        while(m.find()) {
            count++;
            System.out.println("Match number "+count);
            System.out.println("start(): "+m.start());
            System.out.println("end(): "+m.end());
        }
    }


    private static final String REGEX2 = ".*foo*";
    private static final String INPUT2 = "fooooooooooooooooo";
    private static final String INPUT3 = "ooooofoooooooooooo";
    private static Pattern pattern;
    private static Matcher matcher1;
    private static Matcher matcher2;

    private static void regexMatches(){
        pattern = Pattern.compile(REGEX2);
        matcher1 = pattern.matcher(INPUT2);
        matcher2 = pattern.matcher(INPUT3);

        System.out.println("Current REGEX2 is: "+REGEX2);
        System.out.println("Current INPUT2 is: "+INPUT2);
        System.out.println("Current INPUT3 is: "+INPUT3);


        System.out.println("lookingAt(): "+matcher1.lookingAt());
        System.out.println("matches(): "+matcher1.matches());
        System.out.println("lookingAt(): "+matcher2.lookingAt());
        System.out.println("matches(): "+matcher2.matches());
    }



    public static void test() {
//        regText();
//        regGroup();
        regexMatches();
    }
}
