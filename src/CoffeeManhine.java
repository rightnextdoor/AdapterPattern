import java.util.Scanner;

public class CoffeeManhine {

	

	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Choose coffee selection A or B ");
		String choose = input.next().toUpperCase();
		
		selection(choose);
		
		
	}
	
	public static String selection(String choose) {
		if (choose.equals("A")) {
			OldCoffeeMachine coffee = new OldCoffeeMachine();
			CoffeeTouchscreenAdapter coffees = new CoffeeTouchscreenAdapter((OldCoffeeMachine) coffee);
			coffees.chooseFirstSelection();
		} else if(choose.equals("B")) {
			OldCoffeeMachine coffee = new OldCoffeeMachine();
			CoffeeTouchscreenAdapter coffees = new CoffeeTouchscreenAdapter((OldCoffeeMachine) coffee);
			coffees.chooseSecondSelection();
		} else {
			System.out.println("You didn't enter A or B");
		}
		return choose;
	}

}
