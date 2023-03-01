package Day08;

import java.io.*;
import java.nio.file.Files;
import java.text.NumberFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class Day08 {
    private static void demoGetPath() {
        File f = new File("..");
        System.out.println(f.getPath());
        System.out.println(f.getAbsolutePath());
//        System.out.println(f.getCanonicalPath());
    }

    private static void exPath() {
        File f = new File("..");
        File[] dir = new File("..").listFiles();
        printFiles(dir);
    }

    static void printFiles(File[] files) {
        System.out.println("==========");
        if (files != null) {
            for (File f : files) {
                System.out.println(f);
            }
        }
        System.out.println("==========");
    }

//    static void copy(String source, String target) throws IOException {
//        // 友情提示：测试时请使用无关紧要的文件
//        // TODO:
//        String s;
//        StringBuilder sb = new StringBuilder();
//        InputStream input = new FileInputStream(source);
//        OutputStream output = new FileOutputStream(target);
//        byte[] buffer = new byte[1024];
//        try (input) {
//            int n;
//            while ((n = input.read(buffer)) != -1) {
//                sb.append(new String(buffer, "UTF-8"));
//            }
//            s = sb.toString();
//            //System.out.println(s);
//            output.write(s.getBytes("UTF-8"));
//
//        }
//    }

//    private static void exCopyFile() {
//        if (args.length != 2) {
//            System.err.println("Usage:\n  java CopyFile.java <source> <target>");
//            System.exit(1);
//        }
//        copy(args[0], args[1]);
//        System.out.println("Done!");
//    }

    private static void demoData() {
        int n = 123400;
        // 123400
        System.out.println(n);
        // 1e208
        System.out.println(Integer.toHexString(n));
        // $123,400.00
        System.out.println(NumberFormat.getCurrencyInstance(Locale.US).format(n));
    }

    private static void demoLocalDate() {
        LocalDate d = LocalDate.now(); // 当前日期
        LocalTime t = LocalTime.now(); // 当前时间
        LocalDateTime dt = LocalDateTime.now(); // 当前日期和时间
        System.out.println(d); // 严格按照ISO 8601格式打印
        System.out.println(t); // 严格按照ISO 8601格式打印
        System.out.println(dt); // 严格按照ISO 8601格式打印
    }

    private static void demoDateTimeFormatter() {
        // 自定义格式化:
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(dtf.format(LocalDateTime.now()));

        // 用自定义格式解析:
        LocalDateTime dt2 = LocalDateTime.parse("2019/11/30 15:16:17", dtf);
        System.out.println(dt2);
    }

    private static void demoLocalDateWith() {
        // 本月第一天0:00时刻:
        LocalDateTime firstDay = LocalDate.now().withDayOfMonth(1).atStartOfDay();
        System.out.println(firstDay);

        // 本月最后1天:
        LocalDate lastDay = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(lastDay);

        // 下月第1天:
        LocalDate nextMonthFirstDay = LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println(nextMonthFirstDay);

        // 本月第1个周一:
        LocalDate firstWeekday = LocalDate.now().with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        System.out.println(firstWeekday);
    }

    private static void demoPeriod() {
        LocalDateTime start = LocalDateTime.of(2019, 11, 19, 8, 15, 0);
        LocalDateTime end = LocalDateTime.of(2020, 1, 9, 19, 25, 30);
        Duration d = Duration.between(start, end);
        System.out.println(d); // PT1235H10M30S

        Period p = LocalDate.of(2019, 11, 19).until(LocalDate.of(2020, 1, 9));
        System.out.println(p); // P1M21D
    }

    static LocalDateTime calculateArrivalAtNY(LocalDateTime bj, int h, int m) {
        //到达纽约时的北京时间（中国时区）
        ZonedDateTime bjZonedDateTime = bj.plusHours(h).plusMinutes(m).atZone(ZoneId.systemDefault());
        //中国时区北京时间转为美国东部时区纽约时间
        ZonedDateTime nyZonedDateTime = bjZonedDateTime.withZoneSameInstant(ZoneId.of("America/New_York"));

        return nyZonedDateTime.toLocalDateTime();
    }

    private static void exDate() {
        LocalDateTime departureAtBeijing = LocalDateTime.of(2019, 9, 15, 13, 0, 0);
        int hours = 13;
        int minutes = 20;
        LocalDateTime arrivalAtNewYork = calculateArrivalAtNY(departureAtBeijing, hours, minutes);
        System.out.println(departureAtBeijing + " -> " + arrivalAtNewYork);
        // test:
        if (!LocalDateTime.of(2019, 10, 15, 14, 20, 0)
                .equals(calculateArrivalAtNY(LocalDateTime.of(2019, 10, 15, 13, 0, 0), 13, 20))) {
            System.err.println("测试失败!");
        } else if (!LocalDateTime.of(2019, 11, 15, 13, 20, 0)
                .equals(calculateArrivalAtNY(LocalDateTime.of(2019, 11, 15, 13, 0, 0), 13, 20))) {
            System.err.println("测试失败!");
        }
    }

//    private static void demoLocal(){
//        ZonedDateTime zdt = ZonedDateTime.now();
//        var formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm ZZZZ");
//        System.out.println(formatter.format(zdt));
//
//        var zhFormatter = DateTimeFormatter.ofPattern("yyyy MMM dd EE HH:mm", Locale.CHINA);
//        System.out.println(zhFormatter.format(zdt));
//
//        var usFormatter = DateTimeFormatter.ofPattern("E, MMMM/dd/yyyy HH:mm", Locale.US);
//        System.out.println(usFormatter.format(zdt));
//    }

    public static void day08() {
//        demoGetPath();
//        exPath();
//        demoData();
//        demoLocalDate();
//        demoDateTimeFormatter();
//        demoLocalDateWith();
//        demoPeriod();
        exDate();
    }
}
