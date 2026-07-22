import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		boolean running = true;
		
		System.out.println("==========================");
		System.out.println("   WELCOME TO THE GAME"    );
		System.out.println("===========================");
		
		
	
		while(running) {
			displayMenu();
			
			int choice = getMenuChoice(input);
			
			switch(choice) {
				case 1:
					startGame(input);
					break;
				
				case 2:
					viewInstructions(input);
					break;
				
				case 3:
					viewPlayerStats(input);
					break;
				
				case 4:
					System.out.println("\nThank you for playing!");
					running = false;
					break;
				
				default:
					System.out.println("\nInvalid selection");
						
			}
			
		}
		
		input.close();

	}
	
	public static void displayMenu() {
		System.out.println("\n======== MAIN MENU ===========");
		System.out.println("1. Start Game");
		System.out.println("2. View Instructions");
		System.out.println("3. View Player Stats");
		System.out.println("4. Exit");
		System.out.println("=================================");
		System.out.print("Enter your choice: ");
	}
	
	public static int getMenuChoice(Scanner input) {
		while (!input.hasNextInt()) {
			System.out.println("Invalid input. Enter a number from 1 - 4");
			input.nextLine();
			System.out.print("Enter your choice: ");
		}
		
		int choice = input.nextInt();
		input.nextLine();
		return choice;
	}
	
	public static void startGame(Scanner input) {
		boolean gameMenuRunning = true;
		
		while(gameMenuRunning) {
			System.out.println("\n============== GAME MENU ==============");
			System.out.println("1. Begin Mission");
			System.out.println("2. Rest");
			System.out.println("3. View Status");
			System.out.println("4. Return to Main Menu");
			System.out.println("=========================================");
			System.out.print("Enter your choice: ");
			
			int choice = getGameMenuChoice(input);
			
			switch(choice) {
				case 1:
					System.out.println("\nYou begin a new mission!");
					System.out.println("Mission completed");
					pause(input);
					break;
					
				case 2:
					System.out.println("\nYou rest and recover energy");
					pause(input);
					break;
					
				case 3:
					System.out.println("\nHealth; 100");
					System.out.println("Energy: 100");
					System.out.println("Score: 0");
					pause(input);
					break;
					
				case 4:
					System.out.println("\nReturning to the main menu");
					gameMenuRunning = false;
					break;
					
				default:
					System.out.println("\nInvalid choice. Enter 1 - 4");
			
			}
		}
	}
	
	public static int getGameMenuChoice(Scanner input) {
		while (!input.hasNextInt()) {
			System.out.println("Invalid input. Enter a number from 1 - 4");
			input.nextLine();
			System.out.print("Enter your choice: ");
		}
		
		int choice = input.nextInt();
		input.nextLine();
		return choice;
	}
	
	public static void viewInstructions(Scanner input) {
		System.out.println("\n============== INSTRUCTIONS ============");
		System.out.println("1. Choose Start Game from the menu.");
		System.out.println("2. Select missions and actions.");
		System.out.println("3. Maintain your health and energy.");
		System.out.println("4. Complete missions to earn points.");
		System.out.println("===========================================");
		
		pause(input);
	}
	
	public static void viewPlayerStats(Scanner input) {
		System.out.println("\n============== PLAYER STATS ==============");
		System.out.println("Player Name: New Player");
		System.out.println("Health: 100");
		System.out.println("Energy: 100");
		System.out.println("Score: 0");
		System.out.println("=============================================");
		
		pause(input);
	}
	
	public static void pause(Scanner input) {
		System.out.print("\nPress Enter to continue");
		input.nextLine();
	}
		

}
