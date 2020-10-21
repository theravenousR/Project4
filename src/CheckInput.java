import java.util.Scanner;

/** 
 * Static functions used to check console input for validity.
 *
 * Use:	Place CheckInput class in the same project folder as your code.
 *	Call CheckInput functions from your code using "CheckInput."
 *
 * Example:  int num = CheckInput.getInt();
 *
 * @author Shannon Cleary 2020
 */
public class CheckInput {
	
	/**
	 * Checks if the inputted value is an integer.
	 * @return the valid input.
	 */
	public static int getInt() {
		Scanner in = new Scanner( System.in );
		int input = 0;
		boolean valid = false;
		while( !valid ) {
			if( in.hasNextInt() ) {
				input = in.nextInt();
				valid = true;
			} else {
				in.next(); //clear invalid string
				System.out.println( "Invalid Input." );
			}
		}
		return input;
	}
	
	/**
	 * Checks if the inputted value is an integer and 
	 * within the specified range (ex: 1-10)
	 * @param low lower bound of the range.
	 * @param high upper bound of the range.
	 * @return the valid input.
	 */
	public static int getIntRange( int low, int high ) {
		Scanner in = new Scanner( System.in );
		int input = 0;
		boolean valid = false;
		while( !valid ) {
			if( in.hasNextInt() ) {
				input = in.nextInt();
				if( input <= high && input >= low ) {
					valid = true;
				} else {
					System.out.println( "Invalid Range." );
				}
			} else {
				in.next(); //clear invalid string
				System.out.println( "Invalid Input." );
			}
		}
		return input;
	}
	/**
	 * Checks if the inputted value is a non-negative integer.
	 * @return the valid input.
	 */
	public static int getPositiveInt( ) {
		Scanner in = new Scanner( System.in );
		int input = 0;
		boolean valid = false;
		while( !valid ) {
			if( in.hasNextInt() ) {
				input = in.nextInt();
				if( input >= 0 ) {
					valid = true;
				} else {
					System.out.println( "Invalid Range." );
				}
			} else {
				in.next(); //clear invalid string
				System.out.println( "Invalid Input." );
			}
		}
		return input;
	}

	/**
	 * Checks if the inputted value is a double.
	 * @return the valid input.
	 */
	public static double getDouble() {
		Scanner in = new Scanner( System.in );
		double input = 0;
		boolean valid = false;
		while( !valid ) {
			if( in.hasNextDouble() ) {
				input = in.nextDouble();
				if (input < 0) {
					System.out.println("Invalid Input. Try again:");
				}
				else {
					valid = true;
				}
			} else {
				in.next(); //clear invalid string
				System.out.println( "Invalid Input." );
			}
		}
		return input;
	}
	
	/**
	 * Takes in a string from the user.
	 * @return the inputted String.
	 */
	public static String getString() {
		Scanner in = new Scanner( System.in );
		String info = in.nextLine();
		return info;
	}

	public static String getDate() {
		boolean valid = false;
		Scanner in = new Scanner( System.in );
		String input = "";
		while (!valid) {
			input = in.nextLine();
			if (input.length() == 8 && input.charAt(2) == '/' && input.charAt(5) == '/') {
				valid = true;
				for (int x = 0; x < input.length(); x++) {
					if (input.charAt(x) != '/') {
						try {
							Integer.parseInt(input.substring(x, x+1));
						} catch (NumberFormatException e) {
							valid = false;
							System.out.println("Number is not a valid integer!");
							break;
						}
					}
				}
			}
			else {
				System.out.println("Enter the date in the specified format");
			}
			if (Integer.parseInt(input.substring(0, 2)) < 1 || Integer.parseInt(input.substring(0, 2)) > 12) {
				valid = false;
				System.out.println("Number is not in valid month range!");
			}
			else if (Integer.parseInt(input.substring(3, 5)) < 1 || Integer.parseInt(input.substring(3, 5)) > 31) {
				valid = false;
				System.out.println("Number is not in valid day range!");
			}
		}
		return input;
	}

	/**
	 * Takes in a yes/no from the user.
	 * @return true if yes, false if no.
	 */
	public static boolean getYesNo(){
		boolean valid = false;
		while( !valid ) {
			String s = getString();
			if( s.equalsIgnoreCase("yes") || s.equalsIgnoreCase("y") ) {
				return true;
			} else if( s.equalsIgnoreCase("no") || s.equalsIgnoreCase("n") ) {
				return false;
			} else {
				System.out.println( "Invalid Input." );
			}
		}
		return false;
	}	
}
