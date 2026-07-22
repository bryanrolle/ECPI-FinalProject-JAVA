import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	
	private static ArrayList<Character> characters = new ArrayList<>();
	private static ArrayList<Mission> missions = new ArrayList<>();
	private static ArrayList<Item> items = new ArrayList<>();
	
	private static Character selectedCharacter;
	private static Mission selectedMission;
	private static Item selectedItem;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		addGameObjects();
		
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
					chooseCharacter(input);
					break; 
					
				case 3:
					chooseMission(input);
					break;
					
				case 4:
					chooseItem(input);
					break;
					
				case 5:
					viewPlayerStats(input);
					break;
				
				case 6:
					viewInstructions(input);
					break;
				
				case 7:
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
		System.out.println("2. Choose Character");
		System.out.println("3. Choose Mission");
		System.out.println("4. Choose Item");
		System.out.println("5. View Player Stats");
		System.out.println("6. View Instructions");
		System.out.println("7. Exit");
		System.out.println("=================================");
		System.out.print("Enter your choice: ");
	}
	
	public static int getMenuChoice(Scanner input) {
		
		int choice;
		
		while (true) {
		
		while (!input.hasNextInt()) {
			System.out.println("Invalid input. Enter a number from 1 - 7");
			input.nextLine();
			//System.out.print("Enter your choice: ");
		}
		
		choice = input.nextInt();
		input.nextLine();
		
		if (choice >= 1 && choice <= 7) {
			return choice;
			
		}	
		
		System.out.print("Invalid choice. Enter a number from 1 - 7: ");
	}
		
		
}
	
	public static void chooseCharacter(Scanner input) {
		
		System.out.println("\n============= CHOOSE CHARACTER ============");
		
		for (int i = 0; i < characters.size(); i++) {
			
			Character character = characters.get(i);
			
			System.out.println((i + 1) + ". " + character.getName());
			System.out.println("   Class: " + character.getCharacterType());
			System.out.println("   Health:  " + character.getHealth());
			System.out.println("   Energy:  " + character.getEnergy());
			System.out.println("   Ability: " + character.getSpecialAbility());
			System.out.println();
		} 
		
		System.out.print("Enter your choice: ");
		
		int choice = getListChoice(input, characters.size());
		
		selectedCharacter = characters.get(choice - 1);
		
		System.out.println("\nYou selected " 
							+ selectedCharacter.getName() 
							+ " the "
							+ selectedCharacter.getCharacterType()
							+ ".");
		
		pause(input);
	} 
	
	public static void chooseMission(Scanner input) {
		
		System.out.println("\n=========== CHOOSE MISSION ============");
		
		for (int i = 0; i < missions.size(); i++) {
			
			Mission mission = missions.get(i);
			
			System.out.println((i + 1) + ". " + mission.getMissionName());
			
			System.out.println("  " + mission.getDescription());
			
			System.out.println(" Reward: " + mission.getReward() + " gold");
		}
		
		System.out.print("Enter your choice: ");
		
		int choice = getListChoice(input, missions.size());
		
		selectedMission = missions.get(choice - 1);
		
		System.out.println("\n You selected " + selectedMission.getMissionName() + ".");
		
		pause(input);
	} 
	
	public static void chooseItem(Scanner input) {
		
		System.out.println("\n ============= CHOOSE ITEM ============");
		
		for (int i = 0; i < items.size(); i++) {
			
			Item item = items.get(i);
			
			System.out.println("  " + item.getItemName());
			
			System.out.println("  " + item.getDescription());
		}
		
		System.out.print("Enter your choice: ");
		
		int choice = getListChoice(input, items.size());
		
		selectedItem = items.get(choice - 1);
		
		System.out.println("\nYou selected " + selectedItem.getItemName() + ".");
		
		pause(input);
	}
	
	public static int getListChoice(Scanner input, int numberOfOptions) {
		
		int choice;
		
		while (true) {
			
			while (!input.hasNextInt()) {
				System.out.print("Invalid input. Enter a number 1 - " + numberOfOptions + ": ");
				
				input.nextLine();
			}
			
			choice = input.nextInt();
			input.nextLine();
			
			if (choice >= 1 && choice <= numberOfOptions) {
				return choice;
			}
			
			System.out.print("Invalid choice. Enter a number from 1 -" + numberOfOptions + ": ");
		}
	}

	
	public static void startGame(Scanner input) {
		
		if (selectedCharacter == null) {
			System.out.println("\nYou must choose a character first");
			
			pause(input);
			return;
		}
		
		if (selectedMission == null) {
			System.out.println("\nYou must choose a mission first.");
			
			pause(input);
			return;
		}
		
		if (selectedItem == null) {
			System.out.println("\nYou must choose an item first.");
			
			pause(input);
			return;
		}
		
		System.out.println("\n============ GAME STARTED ==============");
		
		System.out.println("Character: " + selectedCharacter.getName());
		
		System.out.println("Mission: " + selectedMission.getMissionName());
		
		System.out.println("Item: " + selectedItem.getItemName());
		
		System.out.println();
		System.out.println(selectedCharacter.getName()
				+ " begins the "
				+ selectedMission.getMissionName()
				+ " mission using a "
				+ selectedItem.getItemName()
				+ ".");
		
		
		selectedCharacter.earnReward(50, selectedMission.getReward());
		
		System.out.println("\nMission completed!");
		System.out.println("XP earned +50");
		System.out.println("Gold earned: " + selectedMission.getReward());
		
		pause(input);
		
	}
	
	public static int getGameMenuChoice(Scanner input) {
		while (!input.hasNextInt()) {
			System.out.println("Invalid input. Enter a number from 1 - 7");
			input.nextLine();
			System.out.print("Enter your choice: ");
		}
		
		int choice = input.nextInt();
		input.nextLine();
		return choice;
	}
	
	public static void viewInstructions(Scanner input) {
		System.out.println("\n============== INSTRUCTIONS ============");
		System.out.println("1. Choose Character from the menu.");
		System.out.println("2. Select Missions.");
		System.out.println("3. Select Items.");
		System.out.println("4. Complete Missions to earn gold and xp.");
		System.out.println("===========================================");
		
		pause(input);
	}
	
	public static void viewPlayerStats(Scanner input) {
		System.out.println("\n============== PLAYER STATS ==============");
		
		if (selectedCharacter == null) {
			System.out.println("Character: Not selected");
		} else {
			System.out.println("Name: " + selectedCharacter.getName());
			
			System.out.println("Class: " + selectedCharacter.getCharacterType());
			
			System.out.println("Special Ability: " + selectedCharacter.getSpecialAbility());
			
			System.out.println("Health: " + selectedCharacter.getHealth());
			
			System.out.println("Energy: " + selectedCharacter.getEnergy());
			
			System.out.println("XP: " + selectedCharacter.getXp());
			
			System.out.println("Gold: " + selectedCharacter.getGold());
		}
		
		if (selectedMission == null) {
			System.out.println("Mission: Not selected");
		} else {
			System.out.println("Mission: " + selectedMission.getMissionName());
		}
		
		if (selectedItem == null) {
			System.out.println("Item: Not selected");
		} else {
			System.out.println("Item: " + selectedItem.getItemName());
		}
		
		System.out.println("=============================================");
		
		pause(input);
	}
	
	public static void addGameObjects() {
		
		characters.add(new Warrior(
				"Garen",
				120,
				80,
				90));
		
		characters.add(new Mage(
				"Veigar",
				80,
				120,
				100));
		
		characters.add(new Ranger(
				"Graves",
				100,
				100,
				95));
		
		missions.add(new Mission(
			"Forest Search",
			"Search the forest for missing supplies",
			20));
		
		missions.add(new Mission(
				"Cave Exploration",
				"Explore a dark cave and find treasure",
				30));
		
		missions.add(new Mission(
				"Village Defense",
				"Protect the village from enemies",
				40));
		
		items.add(new Item(
				"Mighty Sword",
				"Giant Sword that does a heavy strike"
				));
		
		items.add(new Item(
				"Magical Staff",
				"Unique staff that casts spells"
				));
		
		items.add(new Item(
				"Mega Shotgun",
				"Fires a powerful blast"
				));
		}
	
	public static void pause(Scanner input) {
		System.out.print("\nPress Enter to continue");
		input.nextLine();
	}
		

}
