//package Day05;
//
//public class TestExceptions {
//    public  void TestException() {
//        String test = "no";
//        try {
//            System.out.println("test try");
//            doRisky(test);
//            System.out.println("end try");
//        } catch ( ScaryException se) {
//            System.out.println("scary exception");
//        } finally {
//            System.out.println("finally");
//        }
//        System.out.println("end of main");
//    }
//
//    static void doRisky(String test) throws ScaryException {
//        System.out.println("start risky");
//        if ("yes".equals(test)) {
//            throw new ScaryException();
//        }
//        System.out.println("end risky");
//        return;
//    }
//}
//public class ScaryException{
//    static void sayHi();
//}