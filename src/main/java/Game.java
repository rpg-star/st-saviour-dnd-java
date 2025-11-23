import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Game {

    public static void main(String[] args){ 

        // Create Scanner for collecting user input.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine();
        // collects player's name
        Player player = new Player(name);
        //create a new instance of player
        System.out.println("Your name is " + name + "!");
        int lives = 3;
        //make the player start with 3 lives (for some reason the terminating condition couldn't work with player.life so i had to make another variable)
        while (lives > 0) {
        //the loop ends once the player has 0 lives left

        printDramaticText("WAKE UP!!!!");
        printDramaticText("First day of school today! Feeling ready?");
        System.out.println("A) I’m so excited! This school year’s gonna be great!\nB) Is it too late to unenroll?\nC) 5 more minutes…");
        System.out.println("Press A for choice A, B for choice B, or C for choice C to continue");
        String choice1 = scanner.nextLine();
        //collects user input and saves it in a variable
            if (choice1.equals("A") || choice1.equals("a")){
            System.out.println("That’s the spirit!! ");
            //if user types A or a, print line 29
             } else if (choice1.equals("B") || choice1.equals("b")){
            System.out.println("I didn’t spend all of that time and money just for you to not want to go to school! It would be a bad look if you didn’t show up on your first day…");
            //if user types B or b, print line 32  
            } else if (choice1.equals("C") || choice1.equals("c")){
                System.out.println("Fine...");
                System.out.println("You slept for so long that they discontinued the penny");
                break;
                }
                //if the player types C or c, print lines 35 and 36, and end the game   
            else {
            System.out.println("if you dont follow the instructions the poor dev team worked on john coding WILL place a curse on you");
            }
            //
                   
        printDramaticText("You get up and go brush your teeth. A part of you is excited for this new year, but the other half is slightly worried. Will things be the same as they were last year, or will they be different? You start to wonder off into thought, and the morning flies by. It's already time to enter the school, and you notice that your hands are slightly shaking from the nerves. You open the door.");
        System.out.println("Welcome to John Persona High!\npretend theres a really cool school animation because game devs dont get paid enough to animate");
        printDramaticText("You walk into the school, and you check the time. The bell will ring in 5 minutes, and you have no idea where any of the classes are at. You… ");
        System.out.println("DICE ROLL!\nPress enter to roll");
            scanner.nextLine();
            //collects user input
           int roll1 = Player.rollD20(); 
           //makes an int that saves the value of the roll
                if(roll1 >= 1 && roll1 <= 7){
                    System.out.println("You’re basically unstoppable! Some may be directionally challenged, but you aren’t! Hopefully you aren’t late to the next one!!!");
           //if the roll value is {1 - 7}, print line 54
                } else if (roll1 >= 8 && roll1 <= 15){
                System.out.println("You start to look for your next class, but you realize something. You’re completely lost. As you lose hope you…\n");
                printDramaticText("Random student: " + "OUCH!!\nI’m so sorry i didnt mean to run into you!! I knocked the books out of your hands too! Please forgive me!!\n");
                System.out.println("The kind girl helps you compose yourself, picking up the books you carried in your hand. Wait hold on, don't you have a locker? You realize how much of an idiot you are and how easily this could have been avoided. Its too late now, and the girl looks at you with a kind gaze.\n");
                printDramaticText("Hey hey! She’s waiting for you to say something! I’m trying to not interrupt your thoughts but you can’t zone out now!\n");
                System.out.println("You snap out of it and ask where your first period class is. You get the directions to not only your first period class, but to all of the classes you have today! You thank the girl and run to class before you get marked late.");
            }
            //if the roll value is {8 - 15}, print lines 57 to 61
            else{
                System.out.println("You run around the school, hurriedly trying to find your class. Unfortunately, the bell has rung, and you only get more and more lost. After 5 minutes, you finally find your class, but you start to wonder if you should even enter…");
                printDramaticText("C’mon, what are you waiting for? You didn’t spend all that time just to chicken out! You’re going in, no matter what!!");
                System.out.println("The teacher reprimands you for being late, but class continues on as normal. You introduce yourself to everyone, the class nods and goes back to doing their work.");
                player.losealife();
                lives--;
            }
            //if the roll value is (16 - 20}, print lines 65 to 67, and make the player lose a life
       
        System.out.println("⋆*･ﾟ:⋆*･ﾟTIME SKIP⋆*･ﾟ:⋆*･ﾟ\n");
        System.out.println("Its lunch time! Finally! You’re starving, but wait…\n DICE ROLL!!");
        scanner.nextLine();
        int roll2 = Player.rollD20();
        //make an int to store the roll value
            if(roll2 >= 1 && roll2 <= 10){
                System.out.println("You have your wallet!! Time to wait in the line that seems to span the whole cafeteria…");
            }
            //if the role value is {1 - 10}, print line 79
            else{
                System.out.println("You left your wallet at home… Looks like you have to starve :(");
                player.losealife();
                lives--;
            }
            //if the role value is {11-20}, print line 83 and make the player lose a life
        if (lives == 0 && player.life == 0){
            break;
        }
        //if at this point in the game the player is dead, end the game

        printDramaticText("You look around for a place to sit. You see a person sitting alone, and decide to sit with her. Normally, you would get a fleshed out interaction with her, but because the game devs don’t get paid enough, all you need to know is that the girl’s name is Amber and that you and Amber are bros now. If you want more dialogue, you can fund the dev team yourself.");
        printDramaticText("\nYou head back to class, but it seems like you’re about to run into trouble! The dean is walking up to you, and you realize why. You forgot that in this school, you can’t have your phone out! You: ");
        System.out.println ("\nA) Run away! What is she gonna do, run down?\nB) Confront her and convince her to change the policy\nC) Accept your detention\nPress A for choice A, B for choice B, and C for choice C"); 
            String choice2 = scanner.nextLine();
            //makes a variable to save the players input
            int roll3 = player.rollD20();
            //makes an int to store the roll value
            if(choice2.equals("A") || choice2.equals("a")){
                    if(roll3 >= 0 && roll3 <= 10){
                        System.out.println("You successfully escaped! All of that running to catch the train has finally paid off!");
                    } else {
                        System.out.println("Unfortunately the dean caught up to you, and now you have detention after school for trying to escape and having your phone out. It sucks to suck I guess.");
                        player.losealife();
                        lives--;
                    }
                }
            //if the player types A or a, and the roll value is {1 - 10}, print line 102. If the roll value is {11 - 20}, print line 104, and make the player lose a life.    
            if (lives == 0 && player.life == 0){
            break;
            }
            //if at this point in the game the player is dead, end the game
            if(choice2.equals("B") || choice2.equals("b")){
                if(roll3 >= 0 && roll3 <= 10){
                System.out.println("Somehow, you managed to convince the dean to remove the phone policy! Now everyone in the school loves you, and you gsin respect from the teachers. Its only day 1 and you're already extremely popular!");
                }else{
                    System.out.println("Did you really think that was gonna work? Just put the detention in the bag buddy");
                    player.losealife();
                    lives--;
                }
            }
            //if the player types B or b, and the roll value is {1 - 10}, print line 116. If the roll value is {11 - 20}, print line 118 and make the player lose a life.
            if (lives == 0 && player.life == 0){
            break;
            }
            //if at this point in the game the player is dead, end the game
            if (choice2.equals("C") || choice2.equals("c")){
                if(roll3 >= 0 && roll3 <= 18){
                    System.out.println("Did you think the dean would excuse you out of pity? Nice try.");
                    player.losealife();
                    lives--;
                } 
                //if the player types C or c and has a roll value of {1 , 18}, print line 130 and make the player lose a life
            if (lives == 0 && player.life == 0){
            break;
            } 
            //if at this point in the game the player is dead, end the game   
                else{
                    System.out.println("Wow! the dean was nice enough to excuse your detention. I guess she took pity on you for being new? Be more careful in the future, because the dean isn't known for her acts of charity.");
                }
                //if the player types C or c and has a roll value of {19 , 20}, print line 140
            } 
        
        printDramaticText("You walk to class and try to get through the rest of the day. It's 6th period and...");
        printDramaticText("HEY! YOU CAN'T FALL ASLEEP! THIS IS GONNA BE ON THE QUIZ!!");
        printDramaticText("You can really...feel...the sleepiness...kick in... You:");
        System.out.println("A) Fall asleep. You already knew this stuff anyway.\nB) Stay awake. If you don't, the quiz will kick your butt! Besides, what if the teacher decides to call you out for napping?");
            String choice3 = scanner.nextLine();
            //store player's input in a variable 
            System.out.println("Press enter to roll");
            scanner.nextLine();
            if (choice3.equals("A") || choice3.equals("a")){
                int roll4 = player.rollD20();
                if (roll4 >= 0 && roll4 <= 12){
                System.out.println("You take a little nap, and you even start to dream for a bit. You wake up energized and refreshed, ready for the last classes of the day!");
                }
            } 
            //Roll a D20. If the player types A or a and has a roll value of {0 - 12}, print line 156
            else {
                System.out.println("The teacher catches you sleeping, and humiliates you in front of the class. What a lovely first impression...");
                player.losealife();
                lives--;
            //If the player types A or a and has a roll value of {13 - 20}, print line 162 and make the player lose a life
            }
            if (lives == 0 && player.life == 0){
            break;
            //if at this point in the game the player is dead, end the game
            }
            if (choice3.equals("B") || choice3.equals("b")){
                int roll4 = player.rollD20();
                if (roll4 >= 0 && roll4 <= 15){
                    System.out.println("You fight your sleepiness and pay attention. Turns out you already knew the information, but at least it served as a refresher?");
                } 
            //Roll a D20. if the player types B or b and and the roll value is {0 - 15}, print line 174
                else{
                    System.out.println("You try your hardest to not succumb to your sleepiness, but for the whole period you were on the verge of being knocked out. You ended up not paying attention as a result of trying not to sleep. At that point, you should've just slept...");
                    player.losealife();
                    lives--;
                }
            //if the player types B or b and the roll value is {16 - 20}, print line 176 and make the player lose a life
            if (lives == 0 && player.life == 0){
                break;
            //if at this point in the game the player is dead, end the game
                }
            } 
        
        System.out.println("⋆*･ﾟ:⋆*･ﾟTIME SKIP (dev team doesnt get paid for extra dialogue)⋆*･ﾟ:⋆*･ﾟ\n");
        printDramaticText("The day is over, and you think about your first day at John Persona High. It'll take a while to get used to, but with your new friend and friends to come, you'll have a great time");
       if(player.life > 0 && lives > 0){ 
        break;
        }
        //if the player isn't dead at this point, end the game            
    }
        System.out.println("Game over! Thank you for playing");  

    }
    public static void printDramaticText(String text) {
        // Delay in milliseconds
        int delay = 50;

        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                TimeUnit.MILLISECONDS.sleep(delay);
            } catch (InterruptedException e) {
                System.err.println("Interrupted: " + e.getMessage());
                Thread.currentThread().interrupt();
            }
        }
    }
}






