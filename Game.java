// This is my final for Java programming. For my final I am creating a text adventure based around the Rat King.
// The player will play as the Rat King and will have to make choices that will affect the outcome of the game.
// There are three different endings to the game based off the Rat King's bloodlust score.

// Import the libraries we need for the program
import java.util.Scanner;

// Create a class called Game
public class Game {
    // Create a private RatKing object called player
    private RatKing player;

    // Create a constructor for the Game class that takes a RatKing object as a parameter
    public Game(RatKing player) {
        // Set the player attribute to the RatKing object passed in
        this.player = player;

    }

    // Create a variable called scanner of type Scanner
    Scanner scanner = new Scanner(System.in);

    // Create a variable to track the amount of turns the player has taken
    int turns = 0;

    // Create a method called explore
    public void explore() {
        System.out.println("You explore the sewers and find a hidden chamber.");
        System.out.println("Inside the chamber, you find a chest filled with gold and jewels.");
        System.out.println("You gain 10 bloodlust and lose 10 health.");
        player.bloodlust += 10;
        player.health -= 10;
    }

    public void assist() {
        System.out.println("You listen to your subjects about their concerns.");
        System.out.println("You make a plan to assist your citizens and ease their concerns.");
        System.out.println("You lose 10 bloodlust.");
        player.bloodlust += 10;
    }

    // Create a method called attack
    public void attack() {
        System.out.println("You attack the humans and feast on their flesh.");
        System.out.println("You gain 20 bloodlust and lose 10 health.");
        player.bloodlust += 20;
        player.health -= 10;
    }

    // Create a method called rest
    public void rest() {
        System.out.println("You rest and regain your strength.");
        System.out.println("You gain 20 health.");
        player.health += 20;
    }

    // Create a method called checkBloodlust
    public void checkBloodlust() {
        System.out.println("Your current bloodlust is: " + player.bloodlust);
    }

    // Introduce the game to the player
    public void start() {
        System.out.println("************ The Tale of the Rat King ************");
        System.out.println("Welcome to the world of the Rat King!");
        System.out.println("You are the Rat King, a powerful and feared monarch who has been sealed away for centuries.");
        System.out.println("It is the time of your awakening, and you must make choices that will determine your fate.");
        System.out.println("Will you be a benevolent ruler, or will you give in to your bloodlust and become a tyrant?");
        System.out.println("The choice is yours, Rat King.");
        System.out.println("*************************************************");

        // Game loop
        // The game will continue to run as long as the player is alive and for a certain number of turns
        // After three turns, a special event will occur that will affect the player's bloodlust
        for (int i = 0; i < 10; i++) {
            // Print out the player's current health and bloodlust
            System.out.println("Health: " + player.health);
            System.out.println("Bloodlust: " + player.bloodlust);
            System.out.println("*************************************************");
            // Print out the player's current location
            System.out.println("My Lord, is it a new day. What shall you do today?");
            // Print out the player's options
            System.out.println("What will you do?");
            System.out.println("1. Explore the sewers");
            System.out.println("2. Assist your subjects");
            System.out.println("3. Attack the humans");
            System.out.println("4. Rest and regain your strength");
            System.out.println("5. Check your bloodlust");
            System.out.println("6. Quit game");
            System.out.println("*************************************************");
            // Get the player's choice
            int choice = scanner.nextInt();
            // Use a switch statement to determine what to do based on the player's choice
            switch (choice) {
                case 1:
                    explore();
                    break;
                case 2:
                    assist();
                    break;
                case 3:
                    attack();
                    break;
                case 4:
                    rest();
                    break;
                case 5:
                    checkBloodlust();
                    break;
                case 6:
                    System.out.println("You have chosen to quit the game. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            // Increment the number of turns
            turns++;

            // Special event
            // After three turns, a special event will occur that will affect the player's bloodlust
            // The player has to make an important choice that will either increase or decrease their bloodlust
            if (turns == 3) {
                System.out.println("************************ SPECIAL EVENT *************************");
                System.out.println("In the night, you sense a powerful presence in the sewers.");
                System.out.println("You are drawn to it, and you find a mysterious artifact.");
                System.out.println("The artifact is pulsing with dark energy, and you can feel its power calling to you.");
                // Print out the player's options
                System.out.println("What will you do?");
                System.out.println("1. Embrace the artifact and gain its power");
                System.out.println("2. Destroy the artifact and resist its influence");
                System.out.println("*************************************************");
                // Get the player's choice
                int artifactChoice = scanner.nextInt();
                // Use an if statement to determine what to do based on the player's choice
                if (artifactChoice == 1) {
                    System.out.println("You embrace the artifact and feel its dark power coursing through your veins.");
                    System.out.println("You gain 30 bloodlust and 30 health.");
                    player.bloodlust += 30;
                    player.health += 30;
                } else if (artifactChoice == 2) {
                    System.out.println("You resist the artifact's influence and destroy it.");
                    System.out.println("You lose 20 bloodlust.");
                    player.bloodlust -= 20;
                }
            }

            // After six turns, the player will encounter a powerful enemy
            // The player has another choice to determine the outcome of the encounter
            if (turns == 6) {
                System.out.println("*********************** SPECIAL EVENT *************************");
                System.out.println("During a stroll, you encounter a powerful enemy in the sewers.");
                System.out.println("The enemy is a dark sorcerer who seeks to destroy you.");
                // Print out the player's options
                System.out.println("What will you do?");
                System.out.println("1. Fight the sorcerer and unleash your full power");
                System.out.println("2. Confront the sorcerer through diplomacy and attempt to make peace");
                // Get the player's choice
                int enemyChoice = scanner.nextInt();
                // Use an if statement to determine what to do based on the player's choice
                if (enemyChoice == 1) {
                    System.out.println("You unleash your full power and defeat the sorcerer.");
                    System.out.println("You gain 50 bloodlust.");
                    player.bloodlust += 50;
                } else if (enemyChoice == 2) {
                    System.out.println("You confront the sorcerer and attempt to make peace.");
                    System.out.println("The sorcerer agrees to a truce and leaves the sewers.");
                    System.out.println("You lose 30 bloodlust.");
                    player.bloodlust -= 30;
                }
            }
        
            // Check if the player's health has dropped to 0 or below
            if (player.health <= 0) {
                System.out.println("************************ GAME OVER *************************");
                // If the player's health is 0 or below, print out a message and end the game
                System.out.println("You have died. Game over.");
                break;
            }
            // Check if the player's bloodlust has reached 100
            if (player.bloodlust >= 100) {
                System.out.println("************************ TYRANT ENDING *************************");
                // If the player's bloodlust has reached 100, print out a message and end the game
                System.out.println("You have given in to your bloodlust and become a monster.");
                System.out.println("You are consumed by your own power and destroy the city.");
                System.out.println("Congratulations! You have achieved the Tyrant ending.");
                break;
            }
            // Check if the player has reached the maximum number of turns
            if (turns == 10) {
                // If the player has reached the maximum number of turns, print out a message and end the game
                System.out.println("You have reached the end of the game.");
                // Check the player's bloodlust score and print out a message based on the score
                if (player.bloodlust < 40) {
                    System.out.println("************************* BENEVOLENT GRACE ENDING ************************");
                    System.out.println("You have shown restraint and avoided giving in to your bloodlust.");
                    System.out.println("You are hailed as a hero and a savior of the city.");
                    System.out.println("Congratulations! You have achieved the Benevolent Grace ending.");
                } else if (player.bloodlust > 40 && player.bloodlust < 60) {
                    System.out.println("************************ SEALED ENDING *************************");
                    System.out.println("You were not clear enough in your ruling and your subjects couldn't understand your intentions.");
                    System.out.println("You were sealed away again, another couple centuries of slumber should help.");
                    System.out.println("Congratulations! You have achieved the Sealed Ending.");
                }
                else if (player.bloodlust > 60 && player.bloodlust < 100) {
                    System.out.println("************************ TYRANT ENDING *************************");
                    // If the player's bloodlust has reached 100, print out a message and end the game
                    System.out.println("You have given in to your bloodlust and become a monster.");
                    System.out.println("You are consumed by your own power and destroy the city.");
                    System.out.println("Congratulations! You have achieved the Tyrant ending.");
            }
        }
    }
}

    // Main method that will be used to run the program
    public static void main(String[] args) {
        // Create a new RatKing object with the name "Rat King", 100 health, and 0 bloodlust
        RatKing player = new RatKing("Rat King", 100, 0);
        // Create a new Game object with the RatKing object
        Game game = new Game(player);
        // Start the game
        game.start();
    }
}