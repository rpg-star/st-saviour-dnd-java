public class Player {
    
    public String name;
   
    public int life = 3;


    public Player (String name){
        this.name = name;
    }
   
    public void losealife(){
        System.out.println (this.name + " lost a life!");
        life --; 
        System.out.println("Lives left: " + life );
    }

    public static int rollD20(){
        int r = (int)(Math.random() * 20) + 1;
        Ascii.drawD20(r);
        return r;
    }

    // public static int rollAdvantage(){
    //     int first  = (int)(Math.random() * 20) + 1;
    //     Ascii.drawD20(first);
    //     int second =  (int)(Math.random() * 20) + 1;
    //     Ascii.drawD20(second);
    //     if (first > second){
    //         return first;
    //     }
    //     else{
    //         return second;
    //     }
    // }

}
