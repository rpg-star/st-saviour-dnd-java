public class Player {
    
    public String x;
    public String y;

    public int a;
    public int b;

    public Player (String x, String y){
        this.x = x;
        this.y = y;
    }
    public void dosomething(){
        System.out.println (this.x + this.y + "does something");
    }
}
