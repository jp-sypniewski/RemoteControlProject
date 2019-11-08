import java.util.Scanner;

public class RemoteControlSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		String input = "";
		
		do {
			System.out.print("To begin, turn on the remote control: ");
			input = kb.next();
		} while (!input.equalsIgnoreCase("on"));
		
		turningOn();
		pressButton();
		
		do {
			System.out.print("Select a button: ");
			input = kb.next();
			switch (input){
				case "0":
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
				case "off":
				case "ofF":
				case "oFf":
				case "Off":
				case "oFF":
				case "OFf":
				case "OfF":
				case "OFF":
					turningOff();
					break;
				default:
					badCommand();
					break;
			}
			
			
			
		} while (!input.equalsIgnoreCase("off"));
		
		
		
		kb.close();
	}

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
