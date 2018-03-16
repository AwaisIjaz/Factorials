import java.util.Scanner;

public class Person {

	Scanner scan = new Scanner(System.in);
	
	public void introducingGame() {
        
		System.out.println("Wake up! You are lost in a barren moor!");
		
		System.out.println("Try 'look' to find clues of your whereabouts.");
		
		String look = scan.nextLine();
	
		if (!(look.equals("look"))) {
			System.out.println("Please enter 'look'");
			}
			
			else { 
			System.out.println("You find a digital compass. It says you are *7m* away from the plain. Use it to help you escape by moving 'north', 'east', 'south', and 'west'!");
            String [][] barrenMoor1 = {{" ", " ", " "}, {" ", "*", " "}, {" ", " ", " "}};
			
			for (int i = 0; i < barrenMoor1.length; i++) {
				for (int j = 0; j < barrenMoor1.length; j++) {
				System.out.print("[" + barrenMoor1[i][j] + "]");
				}
				System.out.println();}
			}}
	
	public void playerMoving1() {	
		String move = scan.nextLine();
		
		switch (move) {
		case "north":
			System.out.println("You have moved north and are now *11.2m* away from the plain.");
            String [][] barrenMoor1 = {{" ", "*", " "}, {" ", " ", " "}, {" ", " ", " "}};
			
			for (int i = 0; i < barrenMoor1.length; i++) {
				for (int j = 0; j < barrenMoor1.length; j++) {
				System.out.print("[" + barrenMoor1[i][j] + "]");
				}
				System.out.println();}
		break;
		case "east":
			System.out.println("You have moved east and are now *5m* away from the plain.");
            String [][] barrenMoor2 = {{" ", " ", " "}, {" ", " ", "*"}, {" ", " ", " "}};
			
			for (int i = 0; i < barrenMoor2.length; i++) {
				for (int j = 0; j < barrenMoor2.length; j++) {
				System.out.print("[" + barrenMoor2[i][j] + "]");
				}
				System.out.println();}
		break;	
		case "south":
			System.out.println("You have moved south and are now *5m* away from the plain.");
            String [][] barrenMoor3 = {{" ", " ", " "}, {" ", " ", " "}, {" ", "*", " "}};
			
			for (int i = 0; i < barrenMoor3.length; i++) {
				for (int j = 0; j < barrenMoor3.length; j++) {
				System.out.print("[" + barrenMoor3[i][j] + "]");
				}
				System.out.println();}
		break;	
		case "west":
			System.out.println("You have moved west and are now *11.2m* away from the plain.");
            String [][] barrenMoor4 = {{" ", " ", " "}, {"*", " ", " "}, {" ", " ", " "}};
			
			for (int i = 0; i < barrenMoor4.length; i++) {
				for (int j = 0; j < barrenMoor4.length; j++) {
				System.out.print("[" + barrenMoor4[i][j] + "]");
				}
				System.out.println();}
		break;
		}	
	}	
	}

