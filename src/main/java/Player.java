public class Player {
    
    public String name;
    public int life = 3;
    //every player haas a name and a set number of lives

    public Player (String name){
        this.name = name;
    }
   //creates a player
    public void losealife(){
        System.out.println (this.name + " lost a life!");
        life --; 
        System.out.println("Lives left: " + life );
    }
    //creates a method to lose a life
    public static int rollD20(){
        int r = (int)(Math.random() * 20) + 1;
        Ascii.drawD20(r);
        return r;
    }
    //creates a method to roll a 20 sided die
}
