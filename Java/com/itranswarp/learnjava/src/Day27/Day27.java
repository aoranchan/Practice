package Day27;

public class Day27 {
    private static void ex01(){
        String str = "13abf";
        int len = str.length();
        int sum = 0;
        for(int i = 0 ; i < len ; i++)
        {
            char c = str.charAt(len - 1 - i);
            int n = Character.digit(c ,16);
            sum += n * (1 << (4 * i));
        }
        System.out.println(sum);
    }
    private static void ex02(){
        String str = "13abf";
        int sum = Integer.parseInt(str,16);
        System.out.println(sum);
    }
    private static void ex03(int N,int T){
        double R = 0.144;
        int monthMoney = T/N/12;
        double monthRate = R/12;
        int totalMonth = N * 12;
        double totalRate = 0;
        for(int i = 1 ; i <= totalMonth ; i++)
        {
            totalRate += monthMoney * monthRate * i;
        }
        double result = monthMoney + totalRate/N/12;
        System.out.println(result);
        System.out.println(totalRate);
    }
    private static void ex04(){
        String str = "fkjavx";
        char[] arr = str.toCharArray();
        String[] result = {""};
        for (int i = 0 ; i < arr.length ; i++ )
        {
            String[] tmp = new String[result.length * (arr.length - i)];
            int counter = 0;
            for (int j = 0 ; j < result.length; j++ )
            {
                for (int k = 0 ; k < arr.length ; k++ )
                {
                    System.out.println(j + " ----" + result[j]);
                    if(!result[j].contains(arr[k] + ""))
                    {
                        tmp[counter++] = result[j] + arr[k];
                    }
                }
            }
            result = tmp;
            System.out.println(java.util.Arrays.toString(result));
        }
        System.out.println(java.util.Arrays.toString(result));
    }
    public static void test(){
        ex01();
        ex02();
        ex03(3,3000);
        ex04();
    }
}
