package fortuneteller;

import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Hello! Would you please tell me your first and last name?");
		
//name		
		String firstName = input.next();
		String lastName = input.next();

		System.out.println("Thank you, " + firstName + " " + lastName + ". " + "Nice to meet you.");

//age as int
		
		System.out.println("May I ask, how old are you?");

		int userAge = input.nextInt();
		System.out.println("Wow, " + userAge + " years old, huh? You look young for " + userAge +".");

// birth month as int

		System.out.println("In which month were you born?");

		int birthMonth = input.nextInt();

		System.out.println("Ah, yes! That is a good month.");
		
// favorite color
		String questionColor = "So, what is your favorite color in ROYGBIV?";
		String suggestion = "If you are unfamiliar with ROYGBIV colors, please type \"Help\".";
		System.out.println(questionColor + " " + suggestion);		
		String favoriteColor = input.next();
//help		
		if (favoriteColor.toLowerCase().equals("help")){
			System.out.println("Ok, ROYGBIV colors are red, orange, yellow, green, blue, indigo, and violet.");// Which of these colors do you like the best?");
			
			System.out.println(questionColor);	
			
			favoriteColor = input.next();
		
		} else {
			System.out.println("That's a nice color.");
		}
		
//  siblings as int
		
		System.out.println("How many siblings do you have?");
		
		int siblingNumber = input.nextInt();
		
		System.out.println("Ok, thank you. Now, I must consult the spirits.");
		
// Logic stuff
		
		
		// userAge determines retYears
		
		int retYears = 0;
		if (userAge % 2 == 0){
			retYears = 20;
		}else {
			retYears = 30;
		}

		
		// birthMonth determines bankBalance
		
		int bankBalance = 0;
		if (birthMonth > 0 || birthMonth <= 4) {
			bankBalance = 50000;
		}else if (birthMonth > 4 && birthMonth <= 8) {
			bankBalance = 1000000;
		}else if (birthMonth > 8) {
			bankBalance = 25000;
		}else {
		}
		
		
		// siblingNumber determines vacationHome
		
		String vacationHome = "";
		if (siblingNumber == 0) {
			vacationHome = "Fiji";
		}else if (siblingNumber == 1) {
			vacationHome = "Paris, France";
		}else if (siblingNumber == 2) {
			vacationHome = "Napa, CA";
		}else if (siblingNumber == 3) {
			vacationHome = "Portland, OR";
		}else if (siblingNumber >=4) {
			vacationHome = "Tucson, AZ";
		}else {
			vacationHome = "Siberia, Russia";
		}
		
		
		// favoriteColor determines userVehicle
		
		String userVehicle = "";
		switch (favoriteColor.toLowerCase()) {
		case "red":
			userVehicle = "motorcycle";
			break;
		case "orange":
			userVehicle = "helicopter";
			break;
		case "yellow":
			userVehicle = "bicycle";
			break;
		case "green":
			userVehicle = "Geo Tracker";
			break;
		case "blue":
			userVehicle = "Porsche 911";
			break;
		case "indigo":
			userVehicle = "sailboat";
			break;
		case "violet":
			userVehicle = "scooter";
			break;
		default:
			userVehicle = "foot";
			break;
		}


		input.close();

		System.out.println("The spirits say that you, " + firstName + " " + lastName + ", will retire in" + " " + retYears + " years " + "with $" + bankBalance + " in the bank, a vacation home in " + vacationHome + ", and will travel by " + userVehicle +".");
		
		System.out.println("Hope you enjoyed your fortune!");
		
		// Kelli Valverde Oct-21-2019

	}

}
