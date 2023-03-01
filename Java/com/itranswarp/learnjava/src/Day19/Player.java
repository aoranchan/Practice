package Day19;

public class Player {
    static int playerCount = 0;
    private String name;
    public Player(String n){
        name = n;
        playerCount++;
    }
    int x = 12;
    public void go(final int x){
        System.out.println(x);
    }
}
