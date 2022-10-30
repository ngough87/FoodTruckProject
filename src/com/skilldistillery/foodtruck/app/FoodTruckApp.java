package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;




public class FoodTruckApp {
	
	public Scanner userInput = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		FoodTruckApp list = new FoodTruckApp();
		FoodTruck[] trucks = new FoodTruck[5];
		
		list.run(trucks);	
	}

	
//	User Story #1
//	The user is prompted to input the name, food type, and rating for up to five food trucks.
//	For each set of input, a FoodTruck object is created, its fields set to the user's input, 
//	and it is added to the array. The truck id is not input by the user, but instead assigned 
//	automatically in the FoodTruck constructor from a static field that is incremented as each 
//	truck is created.	
		
	public void run(FoodTruck[] trucks) { 
		int counter;
		for (int i = 0; i < trucks.length;  i++)  {
			counter = i + 1;
			
			System.out.println("Enter food truck name: \nEnter 'quit' to exit program");
			String name = userInput.next();
//	User Story #2
//	If the user inputs quit for the food truck name, input ends immediately 
//	and the program continues.
			if (name.equals("quit")){	//allows user exit loop at anytime
				showFoodTruckList(trucks); // brings user options list
				break;
			}  
			
			System.out.println("Enter food truck type: ");
			String foodType = userInput.next();
			System.out.println("Enter food truck rating: ");
			int rating = userInput.nextInt();
				
		trucks[i] = new FoodTruck (name, foodType, rating, counter);
		
			while (i == 4) {
			showFoodTruckList(trucks); // brings user options list
			
				}
		
			}
					
//		User Story #4
//		After choosing a menu item, the user sees the menu again and can 
//		choose another item until the choose to quit.
//	
	
		}

	public void quitProgram() { //allows user to exit program completely
		System.out.println("Thank you for the input, goodbye! ");
		
	}
	
//	User Story #3
//	After input is complete, the user sees a menu from which they can choose to:
//
//	List all existing food trucks.
//	See the average rating of food trucks.
//	Display the highest-rated food truck.
//	Quit the program.
	
		public void showFoodTruckList(FoodTruck[] trucks) { //creating the food truck list
			if (trucks[0] == null) {
				quitProgram();
			} else {
				System.out.println("\n ############  Food Truck Menu   ##############");
				System.out.println("\t1. List all existing food trucks"          );
				System.out.println("\t2. See average rating of food trucks"      );
				System.out.println("\t3. See highest rating of food trucks"  );
				System.out.println("\t4. Exit the program"                 	   );
				System.out.println(" #############################################");
				int options = userInput.nextInt();
				
				switch (options) {
				default: 
					System.out.println("That is not an option. Try again. ");
					showFoodTruckList(trucks);
					break;
				case 1: 
					foodTruckOptions(trucks);
					break;
				case 2:
					avgRating(trucks);
					break;
				
				case 3: 
					highestRating(trucks);
					break;
				case 4:
					quitProgram();
					break;
				
					
					}
				}
		}
	
		public void foodTruckOptions(FoodTruck[] trucks) { //calculating all of the trucks submitted by user
			for (int i = 0; i < trucks.length; i++) {
				if(trucks[i] != null) {
				System.out.println(trucks[i].toString());
				}
			}
			showFoodTruckList(trucks);
		}
		public void avgRating(FoodTruck[] trucks) { //calculating average
			int counter = 0;
			double total = 0;
			double avg =0;
			for (int i = 0; i < trucks.length; i++) {
			if(trucks[i] != null) {
				counter = i  + 1;
					total +=trucks[i].getRating();
				}
				avg = total/counter;
				
			}
			System.out.println("Average rating: " + avg);
			showFoodTruckList(trucks);
		}


		public void highestRating(FoodTruck[] trucks) { // determining the highest score
			int num1 = 0;
			int scores = trucks[0].getRating();
			for (int i = 0; i <trucks.length; i++) {
				if(trucks[i] != null) {
					if(trucks[i].getRating() > scores) {
						num1 =1;
						scores = trucks[i].getRating();
					}
				}
			}
	System.out.println("The highest rating was " + scores + " for " + trucks[num1].getName() );
	System.out.println(trucks[num1].toString());
	showFoodTruckList(trucks);
			}

	}
