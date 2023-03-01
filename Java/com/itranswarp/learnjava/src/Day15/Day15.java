package Day15;

public class Day15 {
    private static void ex01() {
        int x = 3;
        while(x > 0){
            if(x >2){
                System.out.print("a");
            }
            x = x - 1;
            System.out.print("-");
            if(x == 2){
                System.out.print("b c");
            }
            x = x - 1;
            System.out.print("-");
            if(x == 1){
                System.out.print("d");
                x = x -1;
            }
        }
    }
    private static void ex02(){
        int x = 1;
        while( x < 10 ){
            if( x > 3){
                System.out.println("big x");
            }
            x++;
        }
    }

    private static void ex03(){
        int x = 5;
        while ( x > 1){
            x = x - 1;
            if( x < 3){
                System.out.println("small x");
            }
        }
    }

    public static void ex04() {
        int x = 0;
        int y = 30;
        for (int outer = 0; outer < 3; outer++) {
            for (int inner = 4; inner > 1; inner--) {
                x = x + 3;
                y = y - 2;
                if (x == 6){
                    break;
                }
                x = x + 3;
            }
            y = y - 2;
        }
        System.out.println(x + " " + y);
    }

    public static void day15() {
        ex03();
    }
}

class Output {
    public static void ex01() {
        Output o = new Output();
        o.go();
    }

    void go() {
        int y = 7;
        for (int x = 1; x < 8; x++) {
            y++;
            if (x > 4) {
                System.out.print(++y + " ");
            }
            if (y > 14) {
                System.out.println(" x = " + x);
                break;
            }
        }
    }
}