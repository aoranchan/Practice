package Day10;

import java.util.*;

public class Day10 {

    private static double calPI() {
        double PI = 0;
        int sign = 1;
        for (int i = 0; i < 10000000; i++) {
            PI = PI + 4 * (1.0 / (2 * i + 1)) * sign;
            sign = (-1) * sign;
        }
        return PI;
    }

    static double PI = calPI();

    private static double calCircleArea(double r) {
        return r * r * PI;
    }

    private static double calcCircum(double r) {
        return 2 * r * PI;
    }

    private static void calpopulation() {
        int population = 312032486;
        int time = 365 * 24 * 60 * 60;
        for (int i = 1; i <= 5; i++) {
            population = (int) (population + time / 7.0 - time / 13.0 + time / 45.0);
            System.out.println("第" + i + "年，国家的人口总数是" + population + "。");
        }
    }

    private static void computerAreaWithConsoleInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for radius: ");
        double radis = input.nextDouble();
        double area = radis * radis * 3.14159;
        System.out.println("The area for the circle of radius " + radis + " is " + area);
    }

    private static void inputThreeNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Three numbers:");
        double d1 = input.nextDouble();
        double d2 = input.nextDouble();
        double d3 = input.nextDouble();
        System.out.printf("You inputs are: %f %f %f%n", d1, d2, d3);
        if (d1 + d2 > d3 && d1 + d3 > d2 && d2 + d3 > d1) {
            System.out.println("They can constitute triangle!");
        } else {
            System.out.println("they can't constitute triangle!");
        }
    }

    private static int[] insertSort(int[] a) {
        for (int i = 1; i < a.length; i++) {//因为第一次不用，所以从1开始
            int insertNum = a[i];
            while (i > 0 && a[i - 1] > insertNum) {//从后往前循环，将大于insertNum的数向后移动
                a[i] = a[i - 1];//元素向后移动
                i--;
            }
            a[i] = insertNum;//找到位置，插入当前元素
        }
        return a;
    }

    private static int[] sheelSort(int[] a) {
        int len = a.length;//单独把数组长度拿出来，提高效率
        while (len != 0) {
            len = len / 2;
            for (int i = 0; i < len; i++) {//分组
                for (int j = i + len; j < a.length; j += len) {//元素从第二个开始
                    int k = j - len;//k为有序序列最后一位的位数
                    int temp = a[j];//要插入的元素
                    while (k >= 0 && temp < a[k]) {//从后往前遍历
                        a[k + len] = a[k];
                        k -= len;//向后移动len位
                    }
                    a[k + len] = temp;
                }
            }
        }
        return a;
    }

    private static int[] selectSort(int[] a) { //选择排序
        int len = a.length;
        for (int i = 0; i < len; i++) {//循环次数
            int value = a[i];
            int position = i;
            for (int j = i + 1; j < len; j++) {//找到最小的值和位置
                if (a[j] < value) {
                    value = a[j];
                    position = j;
                }
            }
            a[position] = a[i];//进行交换
            a[i] = value;
        }
        return a;
    }

    private static int[] ramdomArray(int n) {//生产n个不重复数随机数组
        if (n < 1) {
            System.out.println("输入的数组个数小于1，不合法！");
            return null;
        }
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            Random r = new Random();
            array[i] = r.nextInt(100 * n);
        }
        return array;
    }

    private static int[] heapSort(int[] a) {
        int len = a.length;
        //循环建堆
        for (int i = 0; i < len - 1; i++) {
            //建堆
            buildMaxHeap(a, len - 1 - i);
            //交换堆顶和最后一个元素
            swap(a, 0, len - 1 - i);
        }
        return a;
    }

    //交换方法
    private static void swap(int[] data, int i, int j) {
        int tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }

    //对data数组从0到lastIndex建大顶堆
    private static void buildMaxHeap(int[] data, int lastIndex) {
        //从lastIndex处节点（最后一个节点）的父节点开始
        for (int i = (lastIndex - 1) / 2; i >= 0; i--) {
            //k保存正在判断的节点
            int k = i;
            //如果当前k节点的子节点存在
            while (k * 2 + 1 <= lastIndex) {
                //k节点的左子节点的索引
                int biggerIndex = 2 * k + 1;
                //如果biggerIndex小于lastIndex，即biggerIndex+1代表的k节点的右子节点存在
                if (biggerIndex < lastIndex) {
                    //若果右子节点的值较大
                    if (data[biggerIndex] < data[biggerIndex + 1]) {
                        //biggerIndex总是记录较大子节点的索引
                        biggerIndex++;
                    }
                }
                //如果k节点的值小于其较大的子节点的值
                if (data[k] < data[biggerIndex]) {
                    //交换他们
                    swap(data, k, biggerIndex);
                    //将biggerIndex赋予k，开始while循环的下一次循环，重新保证k节点的值大于其左右子节点的值
                    k = biggerIndex;
                } else {
                    break;
                }
            }
        }
    }

    private static int[] bubbleSort(int[] a) {
        int len = a.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i - 1; j++) {//注意第二重循环的条件
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return a;
    }

    private static int[] quickSort(int[] a, int start, int end) {
        if (start < end) {
            int baseNum = a[start];//选基准值
            int midNum;//记录中间值
            int i = start;
            int j = end;
            do {
                while ((a[i] < baseNum) && i < end) {
                    i++;
                }
                while ((a[j] > baseNum) && j > start) {
                    j--;
                }
                if (i <= j) {
                    midNum = a[i];
                    a[i] = a[j];
                    a[j] = midNum;
                    i++;
                    j--;
                }
            } while (i <= j);
            if (start < j) {
                quickSort(a, start, j);
            }
            if (end > i) {
                quickSort(a, i, end);
            }
        }
        return a;
    }

    // 注：数组下标0开始，所有取值都-1
    private static void doMerge(int[] from, int[] to, int begin, int middle, int end) {
        int index = begin;
        int position = middle + 1;
        while (begin <= middle && position <= end) {
            if (from[begin - 1] < from[position - 1]) {
                to[index - 1] = from[begin - 1];
                begin++;
            } else {
                to[index - 1] = from[position - 1];
                position++;
            }
            index++;
        }
        while (begin <= middle) {
            to[index - 1] = from[begin - 1];
            begin++;
            index++;
        }
        while (position <= end) {
            to[index - 1] = from[position - 1];
            position++;
            index++;
        }
    }

    private static int[] mergeSort(int[] nums) {
        // 避免生成大量的临时对象，声明等大数组存储空间
        int[] tmp = new int[nums.length];
        doSort(nums, tmp, 1, nums.length);
        return nums;
    }

    // 注：数组下标0开始，所有取值都-1
    private static void doSort(int[] nums, int[] tmp, int begin, int end) {
        if (begin == end) {
            tmp[begin - 1] = nums[begin - 1];
        } else {
            int middle = (begin + end) / 2;
            doSort(nums, tmp, begin, middle);
            doSort(nums, tmp, middle + 1, end);
            doMerge(tmp, nums, begin, middle, end);
            System.arraycopy(nums, begin - 1, tmp, begin - 1, (end - begin) + 1);
        }
    }

    private static int[] baseSort(int[] a) {
        //首先确定排序的趟数;
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        int time = 0;
        //判断位数;
        while (max > 0) {
            max /= 10;
            time++;
        }
        //建立10个队列;
        List<ArrayList<Integer>> queue = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < 10; i++) {
            ArrayList<Integer> queue1 = new ArrayList<Integer>();
            queue.add(queue1);
        }
        //进行time次分配和收集;
        for (int i = 0; i < time; i++) {
            //分配数组元素;
            for (int j = 0; j < a.length; j++) {
                //得到数字的第time+1位数;
                int x = a[j] % (int) Math.pow(10, i + 1) / (int) Math.pow(10, i);
                ArrayList<Integer> queue2 = queue.get(x);
                queue2.add(a[j]);
                queue.set(x, queue2);
            }
            int count = 0;//元素计数器;
            //收集队列元素;
            for (int k = 0; k < 10; k++) {
                while (queue.get(k).size() > 0) {
                    ArrayList<Integer> queue3 = queue.get(k);
                    a[count] = queue3.get(0);
                    queue3.remove(0);
                    count++;
                }
            }
        }
        return a;
    }

    private static int[] bucketSort(int[] data, int min, int max) {
        // 缓存数组
        int[] tmp = new int[data.length];
        // buckets用于记录待排序元素的信息
        // buckets数组定义了max-min个桶
        int[] buckets = new int[max - min];
        // 计算每个元素在序列出现的次数
        for (int i = 0; i < data.length; i++) {
            buckets[data[i] - min]++;
        }
        // 计算“落入”各桶内的元素在有序序列中的位置
        for (int i = 1; i < max - min; i++) {
            buckets[i] = buckets[i] + buckets[i - 1];
        }
        // 将data中的元素完全复制到tmp数组中
        System.arraycopy(data, 0, tmp, 0, data.length);
        // 根据buckets数组中的信息将待排序列的各元素放入相应位置
        for (int k = data.length - 1; k >= 0; k--) {
            data[--buckets[tmp[k] - min]] = tmp[k];
        }
        return data;
    }

    public static void day10() {
//        System.out.println("PI的值取： "+ PI);
//        System.out.println("半径5.5的圆周长是： "+ calcCircum(5.5));
//        System.out.println("半径5.5的圆面积是： "+ calCircleArea(5.5));
//        calpopulation();
//        computerAreaWithConsoleInput();
//        inputThreeNumbers();
        int[] ns = ramdomArray(20);
        assert ns != null;
        System.out.println("原随机生成数组：" + Arrays.toString(ns));
//        int[] bs = bubbleSort(ns);
//        int[] bs = quickSort(ns,0,ns.length-1);
        int[] bs = bucketSort(ns,0,10000);
        System.out.println("排序后的数组为：" + Arrays.toString(bs));
    }
}
