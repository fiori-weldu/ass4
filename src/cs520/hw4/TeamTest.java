/**
 This is a placeholder file. Copy TeamTest.java from Assignment 3 and overwrite this file.
 Change its package statement to match the current package (cs520.hw4).
 */

package cs520.hw4;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class TeamTest { 
	public static Player createPlayer(String number, String name, String position, String year) {

		// Convert number argument from string to integer
		int uniformNumber = Integer.parseInt(number);

		// Instantiate Player and set its instance variables
		Player player = new Player(name);
		player.setName(name);
		player.setNumber(uniformNumber);
		player.setPosition(position);
		player.setYear(year);

		// Call the player instance computeScoringAverage() method and save the returned
		// score
		//double score = player.computeScoringAverage();

		// Print the player's information and scoring average to the console
		System.out.printf("%s:  %d%n", player);

		return player;
	}

	public static void main(String[] args) {

		// Initialize Scanner object
		Scanner scanner = null;

		try {
			// initialize totalScoringAverage
//			double totalScoringAverage = 0.0;

			// Instantiate File object with file input of team.txt
			// Instantiate Scanner object with file input
			File file = new File("team.txt");
			scanner = new Scanner(file);
			ArrayList<Player> players=new ArrayList<Player>();
			// Loop through scanner input file, reading the first four lines into variables
			while (scanner.hasNextLine()) {
				String number = scanner.nextLine();
				String name = scanner.nextLine();
				String position = scanner.nextLine();
				String year = scanner.nextLine();

				// Go to the next line in order to ignore the fifth line "----"
				scanner.nextLine();

				// Pass the variables from each loop to createPlayer() method
				Player player = createPlayer(number, name, position, year);
				players.add(player);

				// Add the returned value from the createPlayer() method to totalScoringAverage
//				totalScoringAverage += playerScore;
			}
			String[] opponents = new String[] {"BC", "Northeastern", "Harvard",
					"MIT", "UMass"};
			for(int i=0; i<opponents.length;i++) {
				Game game= new Game();
				game.set_teamName("Boston University");
				game.set_opponentName(opponents[i]);
				game.setDate(2,3,2021);
				game.set_players(players);
				game.simulateGame();
				
			}
			// compute the average for all players
//			double playerAverage = totalScoringAverage / 10;

//			System.out.println("\nAverage score:  " + playerAverage);
		} catch (Exception e) {
			// Display friendly message to console when an Exception is caught
			System.out.println("Sorry, but an error has occurred. Check and re-run the program.");
		} finally {
			// Check if scanner is before closing it
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}

