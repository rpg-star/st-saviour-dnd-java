import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Game {

    public static void main(String[] args) {

        // Create Scanner for collecting user input.
        Scanner scanner = new Scanner(System.in);

        // Collect character name from user.
        System.out.print("Name: ");
        String name = scanner.nextLine();

        // Collect character role from user.
        // System.out.print("Role: ");
        // String role = scanner.nextLine();

        Player player = new Player (name);
        System.out.println("Your name is " + name + "!");
        
        // TODO Create character by collecting user input (name + role.

        // TODO Print character sheet.

        // Start the adventure.
        printDramaticText("WAKE UP!!!!");
        printDramaticText("First day of school today! Feeling ready?");
        System.out.println("A) I’m so excited! This school year’s gonna be great!\nB) Is it too late to unenroll?\nC) 5 more minutes…");
        String choice1 = scanner.nextLine();
            if (choice1.equals("A") || choice1.equals("a")){
            System.out.println("That’s the spirit!! ");
             } else if (choice1.equals("B") || choice1.equals("b")){
            System.out.println("I didn’t spend all of that time and money just for you to not want to go to school! It would be a bad look if you didn’t show up on your first day…");
                } else if (choice1.equals("C") || choice1.equals("c")){
                System.out.println("Fine...");
                    } 
             else{
            System.out.println("game devs didn't spend days locked in the basement for you to ignore instructions :(");
            }
        printDramaticText("You get up and go brush your teeth. A part of you is excited for this new year, but the other half is slightly worried. Will things be the same as they were last year, or will they be different? You start to wonder off into thought, and the morning flies by. It's already time to enter the school, and you notice that your hands are slightly shaking from the nerves. You open the door.");
        System.out.println("Welcome to John Persona High!\npretend theres a really cool school animation because game devs dont get paid enough to animate");
        printDramaticText("You walk into the school, and you check the time. The bell will ring in 5 minutes, and you have no idea where any of the classes are at. You… ");
        System.out.println("DICE ROLL!\nPress enter to roll");
            scanner.nextLine();
           int roll1 = Player.rollD20();
                if(roll1 >= 1 && roll1 <= 7){
                    System.out.println("You’re basically unstoppable! Some may be directionally challenged, but you aren’t! Hopefully you aren’t late to the next one!!!");
            } else if (roll1 >= 8 && roll1 <= 15){
                System.out.println("You start to look for your next class, but you realize something. You’re completely lost. As you lose hope you…\n");
                printDramaticText("Random student: " + "OUCH!!\nI’m so sorry i didnt mean to run into you!! I knocked the books out of your hands too! Please forgive me!!\n");
                System.out.println("The kind girl helps you compose yourself, picking up the books you carried in your hand. Wait hold on, don't you have a locker? You realize how much of an idiot you are and how easily this could have been avoided. Its too late now, and the girl looks at you with a kind gaze.\n");
                printDramaticText("Hey hey! She’s waiting for you to say something! I’m trying to not interrupt your thoughts but you can’t zone out now!\n");
                System.out.println("You snap out of it and ask where your first period class is. You get the directions to not only your first period class, but to all of the classes you have today! You thank the girl and run to class before you get marked late.");
            }
            else{
                System.out.println("You run around the school, hurriedly trying to find your class. Unfortunately, the bell has rung, and you only get more and more lost. After 5 minutes, you finally find your class, but you start to wonder if you should even enter…");
                printDramaticText("C’mon, what are you waiting for? You didn’t spend all that time just to chicken out! You’re going in, no matter what!!");
                System.out.println("The teacher reprimands you for being late, but class continues on as normal. You introduce yourself to everyone, the class nods and goes back to doing their work.");
                player.losealife();
            }
        System.out.println("⋆*･ﾟ:⋆*･ﾟTIME SKIP⋆*･ﾟ:⋆*･ﾟ");
        System.out.println("Its lunch time! Finally! You’re starving, but wait…\n DICE ROLL!!");
            scanner.nextLine();
         int roll2 = Player.rollD20();
            if(roll2 >= 1 && roll2 <= 10){
                System.out.println("You have your wallet!! Time to wait in the line that seems to span the whole cafeteria…");
            }
            else{
                System.out.println("You left your wallet at home… Looks like you have to starve :(");
                player.losealife();
            }
        printDramaticText("You look around for a place to sit. You see a person sitting alone, and decide to sit with her. Normally, you would get a fleshed out interaction with her, but because the game devs don’t get paid enough, all you need to know is that the girl’s name is Amber and that you and Amber are bros now. If you want more dialogue, you can fund the dev team yourself.");
        printDramaticText("\nYou head back to class, but it seems like you’re about to run into trouble! The dean is walking up to you, and you realize why. You forgot that in this school, you can’t have your phone out!");
        // Roll a d20
        System.out.print("Press Enter to roll a d20.");
        scanner.nextLine();
        Player.rollD20();
       

        // TODO Continue ...
    }
        
    public static void printDramaticText(String text) {
        // Delay in milliseconds
        int delay = 100;

        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                TimeUnit.MILLISECONDS.sleep(delay);
            } catch (InterruptedException e) {
                System.err.println("Interrupted: " + e.getMessage());
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
    }

    // Draws a monster and returns an int which represents the difficulty of roll required.
    public static int generateMonster() {
        int r = (int)(Math.random() * 6) + 1;
        if(r == 1 || r == 2 || r == 3) {
            String zombie = Character.toString(0x1F9DF);
            System.out.println("++++++++ " + zombie + " A HORDE OF ZOMBIES " + zombie + " ++++++++");
            System.out.println("+                                        +");
            System.out.println("+           roll required:  8            +");
            System.out.println("+                                        +");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++");

            return 8;
        }
        if(r == 4 || r == 5) {
            String mask = Character.toString(0x1F3AD);
            System.out.println("++++++++++ " + mask + " DISGUISED MIMIC " + mask + " +++++++++");
            System.out.println("+                                        +");
            System.out.println("+           roll required:  12           +");
            System.out.println("+                                        +");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++");

            return 12;
        }
        if(r == 6) {
            String eye = Character.toString(0x1F441);
            System.out.println("+++++++++++ " + eye +  " EVIL BEHOLDER " + eye + " ++++++++++++");
            System.out.println("+                                        +");
            System.out.println("+           roll required:  18           +");
            System.out.println("+                                        +");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++");

            return 18;
        }
        return -1;
    } 
}
