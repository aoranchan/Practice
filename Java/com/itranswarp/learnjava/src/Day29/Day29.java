package Day29;

import java.util.Arrays;

public class Day29 {
    public static <E extends Comparable<E>> void sort(E[] list) {
        E currentMin;
        int currentMinIndex;
        for (int i = 0; i < list.length - 1; i++) {
            currentMin = list[i];
            currentMinIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin.compareTo(list[j]) > 0) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if(currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
    public static void printList(Object[] list){
        Arrays.stream(list).map(o -> o + " ").forEach(System.out::print);
        System.out.println();
    }
    private static void ex19(){
        Integer[] intArray = {2, 4, 3};
        String[] stringArray = {"Tom","Susan","Kim"};
        sort(intArray);
        sort(stringArray);
        printList(intArray);
        printList(stringArray);
    }
    public static void test(){
        ex19();
    }
}
