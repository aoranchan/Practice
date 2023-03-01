package Day25;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Day25 {
    private static void ex01(){
        int x = 1;
        x = ~x;
        System.out.printf("%d",x);
        BigDecimal m = new BigDecimal("1.255433");
        BigDecimal n = m.setScale(3, RoundingMode.HALF_DOWN);
        System.out.println(n);// 1.255
    }
    

    public static void day25() {
        System.out.println("------------------");
        System.out.println("Day25");
        ex01();
        System.out.println("------------------");
    }
}
