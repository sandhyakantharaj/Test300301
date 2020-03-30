package club;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList<Team> memberdetails = new ArrayList<Team>();
	
	static ArrayList<Team> coachdetails = new ArrayList<Team>();


	public static void main(String[] args) {

		// Team members(players)
	
		
		memberdetails.add(new Team("John", "Cena", "PLAYER", "MALE", "Indian", LocalDate.of(1992, 11, 14),
				"46,Quadrant court", "Mirla square", "Zarkhand", "Bihar", "824211", "INDIA"));
		memberdetails.add(new Team("Sania", "Mirza", "PLAYER", "FEMALE", "Indian", LocalDate.of(1992, 01, 14),
				"46,Quadrant court", "Mantri square", "Hyderabad", "Andra Pradesh", "70140", "INDIA"));

		memberdetails.add(new Team("Mark", "John", "PLAYER", "MALE", "Indian", LocalDate.of(1986, 11, 14),
				"46,Quadrant court", "Mirla square", "Zarkhand", "Bihar", "824211", "INDIA"));
		memberdetails.add(new Team("Anu", "Kingsly", "PLAYER", "FEMALE", "Indian", LocalDate.of(1992, 01, 14),
				"46,Quadrant court", "Mantri square", "Hyderabad", "Andra Pradesh", "70140", "INDIA"));
		

		memberdetails.add(new Team("John", "Kingsly", "PLAYER", "MALE", "Indian", LocalDate.of(1987, 11, 14),
				"46,Quadrant court", "Mirla square", "Zarkhand", "Bihar", "824211", "INDIA"));

		memberdetails.add(new Team("Savita", "Pai", "PLAYER", "FEMALE", "Indian", LocalDate.of(1992, 01, 14),
				"46,Quadrant court", "Mantri square", "Hyderabad", "Andra Pradesh", "70140", "INDIA"));
		

		memberdetails.add(new Team("Joshua", "Paul", "PLAYER", "MALE", "Indian", LocalDate.of(1987, 11, 14),
				"46,Quadrant court", "Mirla square", "Zarkhand", "Bihar", "824211", "INDIA"));;

		memberdetails.add(new Team("Shamita", "Chandrashekar", "PLAYER", "FEMALE", "Indian", LocalDate.of(1992, 01, 14),
				"46,Quadrant court", "Mantri square", "Hyderabad", "Andra Pradesh", "70140", "INDIA"));
		
		

		memberdetails.add(new Team("Virendra", "Shewag", "PLAYER", "MALE", "Indian", LocalDate.of(1986, 11, 14),
				"46,Quadrant court", "Mirla square", "Zarkhand", "Bihar", "824211", "INDIA"));

		memberdetails.add(new Team("Sunita", "verma", "PLAYER", "FEMALE", "Indian", LocalDate.of(1992, 01, 14),
				"46,Quadrant court", "Mantri square", "Hyderabad", "Andra Pradesh", "70140", "INDIA"));

		


		memberdetails.add(new Team("Sachin", "Tendulkar", "PLAYER", "MALE", "Indian", LocalDate.of(1990, 11, 14),
				"46,Quadrant court", "Jumla square", "Bombay", "Mumbai", "824211", "INDIA"));
		memberdetails.add(new Team("Nayana", "tara", "PLAYER", "FEMALE", "Indian", LocalDate.of(1991, 01, 14),
				"46,Quadrant court", "Mantri square", "Hyderabad", "Andra Pradesh", "70140", "INDIA"));

		
		


		memberdetails.add(new Team("Virat", "Kohli", "PLAYER", "MALE", "Indian", LocalDate.of(1988, 11, 14),
				"46,Quadrant court", "Jumla square", "Bombay", "Mumbai", "824211", "INDIA"));
		memberdetails.add(new Team("Samanta", "Akkinan", "PLAYER", "FEMALE", "Indian", LocalDate.of(1990, 01, 14),
				"46,Quadrant court", "Mantri square", "Hyderabad", "Andra Pradesh", "70140", "INDIA"));

		

		memberdetails.add(new Team("Shikan", "Dhawan", "PLAYER", "MALE", "Indian", LocalDate.of(1987, 11, 14),
				"46,Quadrant court", "Jumla square", "Bombay", "Mumbai", "824211", "INDIA"));

		memberdetails.add(new Team("Sathya", "Kiran", "PLAYER", "FEMALE", "Indian", LocalDate.of(1989, 01, 14),
				"46,Quadrant court", "Mantri square", "Hyderabad", "Andra Pradesh", "70140", "INDIA"));
		
		

		memberdetails.add(new Team("Ashish", "Nehra", "PLAYER", "MALE", "Indian", LocalDate.of(1986, 11, 14),
				"46,Quadrant court", "Jumla square", "Bombay", "Mumbai", "824211", "INDIA"));

		memberdetails.add(new Team("Maina", "Verma", "PLAYER", "FEMALE", "Indian", LocalDate.of(1988, 01, 14),
				"46,Quadrant court", "Mantri square", "Hyderabad", "Andra Pradesh", "70140", "INDIA"));
		
		
		


		memberdetails.add(new Team("Zaheer", "Khan", "PLAYER", "MALE", "Indian", LocalDate.of(2003, 11, 14),
				"46,Quadrant court", "Jumla square", "Bombay", "Mumbai", "824211", "INDIA"));

		memberdetails.add(new Team("Anusha", "Rathan", "PLAYER", "FEMALE", "Indian", LocalDate.of(2006, 01, 14),
				"46,Quadrant court", "Mantri square", "Hyderabad", "Andra Pradesh", "70140", "INDIA"));




		memberdetails.add(new Team("Hruthik", "Roshan", "PLAYER", "MALE", "Indian", LocalDate.of(2005, 11, 14),
				"46,Quadrant court", "Jumla square", "Bombay", "Mumbai", "824211", "INDIA"));
		memberdetails.add(new Team("Aliana", "Mathews", "PLAYER", "FEMALE", "British", LocalDate.of(2003, 11, 14),
				"46,Quadrant court", "Jumla square", "winterthurway", "Basingstoke", "RG1 8GH", "UK"));


		memberdetails.add(new Team("Pramod", "Shetty", "PLAYER", "MALE", "Indian", LocalDate.of(2009, 11, 14),
				"46,Quadrant court", "Jumla square", "Bombay", "Mumbai", "824211", "INDIA"));

		memberdetails.add(new Team("Melina", "Mathews", "PLAYER", "FEMALE", "British", LocalDate.of(2006, 11, 14),
				"46,Quadrant court", "Jumla square", "winterthurway", "Basingstoke", "RG1 9GH", "UK"));

		memberdetails.add(new Team("Preetham", "Prakash", "PLAYER", "MALE", "Indian", LocalDate.of(2004, 11, 14),
				"46,Quadrant court", "Jumla square", "Bombay", "Mumbai", "824211", "INDIA"));

		memberdetails.add(new Team("Irene", "Rebecca", "PLAYER", "FEMALE", "British", LocalDate.of(2005, 11, 14),
				"46,Quadrant court", "Jumla square", "winterthurway", "Basingstoke", "RG1 7GH", "UK"));



		memberdetails.add(new Team("Jaden", "Maxwell", "PLAYER", "MALE", "Indian", LocalDate.of(2006, 11, 14),
				"46,Quadrant court", "Mirla square", "Zarkhand", "Sikkim", "814211", "INDIA"));

		memberdetails.add(new Team("Sheeba", "Sherlin", "PLAYER", "FEMALE", "British", LocalDate.of(2004, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		
		

		memberdetails.add(new Team("Javed", "Akthar", "PLAYER", "MALE", "Indian", LocalDate.of(2002, 11, 14),
				"46,Quadrant court", "Mirla square", "Zarkhand", "Assam", "824291", "INDIA"));

		memberdetails.add(new Team("Karishma", "Kapoor", "PLAYER", "FEMALE", "British", LocalDate.of(2006, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		
		

		memberdetails.add(new Team("Dhruva", "Vikram", "PLAYER", "MALE", "Indian", LocalDate.of(2003, 11, 14),
				"46,Quadrant court", "Mirla square", "Zarkhand", "Bihar", "824211", "INDIA"));


		memberdetails.add(new Team("Kareena", "Kapoor", "PLAYER", "FEMALE", "British", LocalDate.of(2006, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		// Coach	
		

		coachdetails.add(new Team("Rahul", "Dravid", "COACH", "MALE", "Indian", LocalDate.of(1981, 01, 14),
				"46,Quadrant court", "Mantri square", "Bangalore", "Karnataka", "506204", "INDIA"));
	
		coachdetails.add(new Team("Ramya", "Raghav", "COACH", "FEMALE", "British", LocalDate.of(1981, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));

		System.out.println("Available number of players:" + memberdetails.size());

		Scanner userInput = new Scanner(System.in);

		String ageGroup;
		String gender;
		
		try {

			System.out.println(
					"Which age Group are you creating a team for ? Enter Junior (if the age is below 18) or Senior  (if the age is above 18)");
			while (true) {
				ageGroup = userInput.nextLine().toUpperCase();
				if (ageGroup.contentEquals("JUNIOR")) {

					System.out.println("You have choosen the Junior age group");
					System.out.println("***************************************************");
					break;
				} else if (ageGroup.contentEquals("SENIOR")) {
					System.out.println("You have choosen the Senior age group");
					System.out.println("*******************************************************");
					break;
				} else {
					System.out.println("Please enter the valid input");

				}
			}

			System.out.println("Please enter the gender. Enter Male or Female or Mixed");
			while (true) {
				gender = userInput.nextLine().toUpperCase();
				if (gender.contentEquals("MALE")) {

					System.out.println("You have selected MALE");
					System.out.println("*************************************************");
					break;
				} else if (gender.contentEquals("FEMALE")) {
					System.out.println("You have selected FEMALE");
					System.out.println("*************************************************");
					break;
				} else if (gender.contentEquals("MIXED")) {
					System.out.println("You have selected MIXED");
					System.out.println("***************************************************");
					break;
				}

				else {
					System.out.println("Please enter the valid input. Enter 'Male' or 'Female' or 'Mixed'");
				}

			}

			

			System.out.println("How many players would you like in the team ?. Please enter the number");

			int teamsize = userInput.nextInt();
			System.out.println("***************************************************************");
			System.out.println("Generating  a"+" "+gender +" "+"team" + "  "+"of"+" "+ teamsize +" "+"players.");
			System.out.println("**************************************************************");
			Team team = new Team();

			if ((ageGroup.contains("JUNIOR")) && (gender.contentEquals("MALE")))
					 {
				team.getJuniorMalePlayer(teamsize);
				team.getMaleCoach();
				
			}

			
			else if ((ageGroup.contains("JUNIOR")) && (gender.contentEquals("FEMALE")))
				 {
				team.getJuniorFemalePlayer(teamsize);
				team.getFemaleCoach();
				//team.getCount(teamsize);
			}

			

			else if (ageGroup.contains("JUNIOR") && gender.contentEquals("MIXED"))
					 {
				team.getJuniorMixedPlayer(teamsize);
		
				team.getCoach();
			

			} else if ((ageGroup.contains("SENIOR")) && (gender.contentEquals("MIXED")))
				 {
				team.getSeniorMixedPlayer(teamsize);
				team.getCoach();

			} 
			
			else if ((ageGroup.contains("SENIOR")) && (gender.contentEquals("MALE"))
					) {
				team.getMaleSeniorPlayer(teamsize);
				team.getMaleCoach();
			}

			
			else if ((ageGroup.contains("SENIOR")) && (gender.contentEquals("FEMALE"))
					) {
				team.getFemaleSeniorPlayer(teamsize);
				team.getFemaleCoach();
			}

		}

		catch (Exception e) {
			System.out.println("There are not enough Members available to create a team");
		}

	}

}
