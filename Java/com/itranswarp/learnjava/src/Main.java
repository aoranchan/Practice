import Day01.Day01;
import Day02.Day02;
import Day03.Day03;
import Day04.Day04;
import Day05.Day05;
import Day06.Day06;

import java.io.IOException;

//import Day26.Day26.*;
public class Main {
//    public static void main(String[] args){


    public static void main(String[] args) throws IOException {



//        Day01.variable();
//        Day01.day01();
//        Day01.absoluteValue(300);
//        Day01.test03();
//        Day01.test05();
//        Day01.test06(23);
//        int  tt = Day01.decToBin(23);
//        System.out.println(tt);
//        int[] arr = { 10, 20 };
//        System.out.println("交换前： a = " + arr[0] + "； b = " + arr[1]);
//        swap(arr);
//        System.out.println("交换后： a = " + arr[0] + "； b = " + arr[1]);
//        Day05.TestExceptions.TestException();
//        float f1 = 3.14f;
//        float f2 = 3.14e38f; // 科学计数法表示的3.14x10^38
//        double d = 1.79e308;
//        double d2 = -1.79e308;
//        double d3 = 4.9e-324; // 科学计数法表示的4.9x10^-324
//        char a = 79;
//        char zh = '中';
//        System.out.println(a);
//        System.out.println(zh);
//        System.out.println(f1);
//        System.out.println(f2);
//        System.out.println(d);
//        System.out.println(d2);
//        System.out.println(d3);
//        System.out.println("hello World!");
//        mathRoot(1.0,3.0,-4.0);
//        int age = 5;
//        // primary student的定义: 6~12岁
//        boolean isPrimaryStudent = age>6 && age < 12;
//        System.out.println(isPrimaryStudent ? "Yes" : "No");
//        String s = "ABC\n\u4e2d\u6587"; // 包含6个字符: A, B, C, 换行符, 中, 文
//        System.out.println(s);
//        System.out.println("快捷键");
//        day06();
//        day07();
//        day08();
//        test();
//        test();
//        new Day23().go();
//        for (int i = 0; i < 10; i++) {
//            Day24.ThreadTestDrive.test();
//        }
//        Day25.Day25.day25();
//        Day26.Day26.test();
//        Day28.Day28.test();
//        Day29.Day29.test();
//        PrimitiveTypeTest.test();
        Day01.test();
        Day02.day02(args);
        Day03.day03();
        Day04.day04(args);
        Day05.day05();
        Day06.day06();
    }

//    public static void main(String[] args) throws Exception {
//        // 原文:
//        String message = "Hello, world!";
//        System.out.println("Message: " + message);
//        // 256位密钥 = 32 bytes Key:
//        byte[] key = "1234567890abcdef1234567890abcdef".getBytes("UTF-8");
//        // 加密:
//        byte[] data = message.getBytes("UTF-8");
//        byte[] encrypted = encrypt(key, data);
//        System.out.println("Encrypted: " + Base64.getEncoder().encodeToString(encrypted));
//        // 解密:
//        byte[] decrypted = decrypt(key, encrypted);
//        System.out.println("Decrypted: " + new String(decrypted, "UTF-8"));
//    }
//
//    // 加密:
//    public static byte[] encrypt(byte[] key, byte[] input) throws GeneralSecurityException {
//        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
//        SecretKeySpec keySpec = new SecretKeySpec(key, "AES");
//        // CBC模式需要生成一个16 bytes的initialization vector:
//        SecureRandom sr = SecureRandom.getInstanceStrong();
//        byte[] iv = sr.generateSeed(16);
//        IvParameterSpec ivps = new IvParameterSpec(iv);
//        cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivps);
//        byte[] data = cipher.doFinal(input);
//        // IV不需要保密，把IV和密文一起返回:
//        return join(iv, data);
//    }
//
//    // 解密:
//    public static byte[] decrypt(byte[] key, byte[] input) throws GeneralSecurityException {
//        // 把input分割成IV和密文:
//        byte[] iv = new byte[16];
//        byte[] data = new byte[input.length - 16];
//        System.arraycopy(input, 0, iv, 0, 16);
//        System.arraycopy(input, 16, data, 0, data.length);
//        // 解密:
//        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
//        SecretKeySpec keySpec = new SecretKeySpec(key, "AES");
//        IvParameterSpec ivps = new IvParameterSpec(iv);
//        cipher.init(Cipher.DECRYPT_MODE, keySpec, ivps);
//        return cipher.doFinal(data);
//    }
//
//    public static byte[] join(byte[] bs1, byte[] bs2) {
//        byte[] r = new byte[bs1.length + bs2.length];
//        System.arraycopy(bs1, 0, r, 0, bs1.length);
//        System.arraycopy(bs2, 0, r, bs1.length, bs2.length);
//        return r;
//    }

}
