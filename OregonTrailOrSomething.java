import java.util.Scanner;
import java.util.Random;
public class OregonTrailOrSomething {
    public static void main (String [] args) { 
 
    Scanner in = new Scanner(System.in); //Objects for Game 
    Random rand = new Random();

    int maxDiceNumb = 18;
    
    boolean gameRunning = true; 
    
    System.out.println("You find yourself in a strange place with a dice, you have ");
    System.out.println("a odd urge to select one of three " );
    System.out.println("options a voice in the wind tells you. ");
    
    GAME:
    while(gameRunning) {
        // START BOOL GAME AND OPENING CHOICE
        System.out.println("==========================================");
        
        String openingOne = "1. Walk towards a village "; 
        String openingTwo = "2. Try and seach for a powerful weapon"; 
        String openingThree = "3. Try and learn a flying spell"; 
        
        System.out.println(openingOne);
        System.out.println(openingTwo);
        System.out.println(openingThree);

        
        int numbRolled = rand.nextInt(maxDiceNumb);//Generates random number for player

        String input = in.nextLine();
        
        if(input.equals("1")) {
        System.out.println("You have rolled a " + numbRolled);
            if (numbRolled >= 3) {
                System.out.println("You wonder to the nearby village and find a rusty broadswoard that could break at any moment"); 
            }
                if (numbRolled <3 ) {
                    System.out.println("You have failed this task! Try Again! ");
            }
    }
        else if (input.equals("2")) {
            System.out.println("You have rolled a " + numbRolled);
            if (numbRolled >= 9) {
                System.out.println("You look around and notice a shiny staff near the base of a tree ");
                System.out.println("Upon inspection you can feel its power and it casts a lightning bolt!");
            }
                    if (numbRolled < 9) {
                        System.out.println("You have failed this task! Try Again! ");
                    }
            }
        else if (input.equals("3")) {
            System.out.println("You have rolled a " + numbRolled);
            if (numbRolled >= 13) {
                System.out.print("You grab the tome on a nearby barel and read a spell that sprouts wings out of your back! ");
            }
                if (numbRolled < 13) {
                    System.out.println("You have failed this task! Try Again! ");
                }

        }
        else {
            System.out.println("Invalad command!");
            break;

        }
    
    System.out.println("==========================================");
    System.out.println("Please select another option: ");
    System.out.println("Please type GO to continue! ");

    String inputContinue = in.nextLine();
// START FOR MID GAME 
    String midGameOne = "4. Follow a path from the village to the castle on the hill";
    String midGameTwo = "5. Take your new staff and head down a path to the Kings castle ";
    String midGameThree = "6. Use your new found ability to fly around in seach for adventure";

    if(inputContinue.equals("GO")) {
        System.out.println(midGameOne);
        System.out.println(midGameTwo);
        System.out.println(midGameThree);
    }
    
    String inputMidGame = in.nextLine();


    if(inputMidGame.equals("4")) {
        System.out.println("You have rolled a " + numbRolled);
            if (numbRolled >= 3) {
                System.out.println("You begin to walk down the path with you sword at your side. "); 
            }
                if (numbRolled <3 ) {
                    System.out.println("You have failed this task! Try Again! ");
            }
    }
        else if (inputMidGame.equals("5")) {
            System.out.println("You have rolled a " + numbRolled);
            if (numbRolled >= 9) {
                System.out.println("You grab you new staff and walk towards the kings castle very quickly! ");
                System.out.println("Your new weapon seems to make you as light as air as you walk quicker than ever! ");
            }
                    if (numbRolled < 9) {
                        System.out.println("You have failed this task! Try Again! ");
                    }
            }
        else if (inputMidGame.equals("6")) {
            System.out.println("You have rolled a " + numbRolled);
            if (numbRolled >= 13) {
                System.out.print("Your new wings push massive gusts of wind at the ground and propell you into the air! ");
            }
                if (numbRolled < 13) {
                    System.out.println("You have failed this task! Try Again! ");
                }

        }
        else {
            System.out.println("Invalad command!");
        }
    
    
    // START INPUT FOR LATE GAME 
    System.out.println("==========================================");
    System.out.println("Please select another option: ");
    System.out.println("Please type GO to continue! ");

    inputContinue = in.nextLine();

    String lateGameOne = "7. The long trek makes you tired. Would you like to try and find food, then head towards the castle? ";
    String lateGameTwo = "8. You approch the King's castle and enter. Would you like to barter your staff with the king in exchange for peace?  ";
    String lateGameThree = "9. Once in the air you see the King's Castle. Would you like to fly to it? ";

    if(inputContinue.equals("GO")) {
        System.out.println(lateGameOne);
        System.out.println(lateGameTwo);
        System.out.println(lateGameThree);
    }
    
    String inputLateGame = in.nextLine();


    if(inputLateGame.equals("7")) {
        System.out.println("You have rolled a " + numbRolled);
            if (numbRolled >= 3) {
                System.out.println("You find an apple tree and eat a few and reembark on your journey. "); 
            }
                if (numbRolled <3 ) {
                    System.out.println("You have failed this task! Try Again! ");
            }
    }
        else if (inputLateGame.equals("8")) {
            System.out.println("You have rolled a " + numbRolled);
            if (numbRolled >= 9) {
                System.out.println("The king seems hesitant but reluctantly accepts your offer, but with his own qualms.  ");
                
            }
                    if (numbRolled < 9) {
                        System.out.println("You have failed this task! Try Again! ");
                    }
            }
        else if (inputLateGame.equals("9")) {
            System.out.println("You have rolled a " + numbRolled);
            if (numbRolled >= 13) {
                System.out.print("Speedier than ever you quickly arrive at the King's castle and approach him. ");
            }
                if (numbRolled < 13) {
                    System.out.println("You have failed this task! Try Again! ");
                }

        }
        else {
            System.out.println("Invalad command!");
        }
    // START INPUT FOR END GAME
        System.out.println("==========================================");
        System.out.println("Please select another option: ");
        System.out.println("Please type GO to continue! ");
    
        inputContinue = in.nextLine();
    
        String endGameOne = "10. Would you like to fight the King for fun? ";
        String endGameTwo = "11. Would you like to join the King and reign along side?  ";
        String endGameThree = "12. Would you like to attempt to slay the King and usurp power? ";
    
        if(inputContinue.equals("GO")) {
            System.out.println(endGameOne);
            System.out.println(endGameTwo);
            System.out.println(endGameThree);
        }
        String inputEndGame = in.nextLine();
    
        if(inputEndGame.equals("10")) {
            System.out.println("You have rolled a " + numbRolled);
                if (numbRolled >= 3) {
                    System.out.println("You were able to defeat the King! Type QUIT to exit the game!"); 
                }
                    if (numbRolled <3 ) {
                        System.out.println("The King has defeated you! Type QUIT to exit the game! ");
                }
        }
            else if (inputEndGame.equals("11")) {
                System.out.println("You have rolled a " + numbRolled);
                if (numbRolled >= 9) {
                    System.out.println("The King has agreed to your request and you will reign beside him! ");
                }
                        if (numbRolled < 9) {
                            System.out.println("The King has denied your request and smited you! Type QUIT to exit the game! ");
                        }
                }
            else if (inputEndGame.equals("12")) {
                System.out.println("You have rolled a " + numbRolled);
                if (numbRolled >= 13) {
                    System.out.print("You have slain the King and taken his power! You are now the ruler of the Kingdom!");
                }
                    if (numbRolled < 13) {
                        System.out.println("The King has defeated you! Type QUIT to exit the game! ");
                    }
    
            }
            else if (inputEndGame.equals("QUIT")) {
                System.out.println("Thank you for playing!");
                break;
            }
            else {
                System.out.println("Invalad command!");
                break;
            
            }
        }
    }
}