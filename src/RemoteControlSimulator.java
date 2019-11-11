import java.util.Scanner;

public class RemoteControlSimulator {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		String input = "";
		
		do { // turn on sequence, only accepts 'on' to move to remainder of controller
			System.out.print("To begin, turn on the remote control: ");
			input = kb.next();
		} while (!input.equalsIgnoreCase("on"));
		
		turningOn();
		
		do { // controller is on, user can input 0-9 or 'off' to exit
			System.out.print("Select a button: ");
			input = kb.next();
			switch (input.toUpperCase()){
				case "0":  // all single digits fall through to pressButton() and continue the loop
				case "1":
				case "2":
				case "3":
				case "4":
				case "5":
				case "6":
				case "7":
				case "8":
				case "9":
					pressButton();
					break;
				case "OFF": // upper case - input manipulated toUpperCase
					turningOff();
					break;
				default:
					badCommand();
					break;
			}
		} while (!input.equalsIgnoreCase("off"));
		
		kb.close();
	} // end main

	public static void turningOn() {
		System.out.println("TURNING ON...");
	}
	
	public static void turningOff() {
		System.out.println("TURNING OFF...");
	}
	
	public static void pressButton() {
		System.out.println("BOOP!");
	}
	
	public static void badCommand() {
		System.out.println("Command not recognized");
	}
}
