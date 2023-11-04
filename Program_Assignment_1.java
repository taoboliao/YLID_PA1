package PA2;

public class Program_Assignment_1 {
	/** DO NOT MODIFY THESE CONSTANTS */
	// Used to determine if a number is even or odd
	private static final int EVEN_DIVISOR = 2;

	// Number of required arguments
	private static final int REQUIRED_ARGS = 1;

	// Used when width is not valid
	private static final String INVALID_WIDTH_ERR = "Width is not valid!\n";
	
	// Used when length is not valid
	private static final String INVALID_LENGTH_ERR = "Length is not valid!\n";

	// Used when there are more arguments passed in than required
	private static final String EXTRA_ARGS_ERR = "Too many args passed in!\n";

	// Used when no arguments are passed in
	private static final String HELP_STR = "Usage: java Hourglass width\n" + "width has to be >= 1 and odd\n" 
										   + "java Triangle length\n" + "length has to be >= 1";

	// The character the hourglass will be drawn with
	private static final char HOURGLASS_CHAR = '*';

	// The character the padding will be drawn with
	private static final char PADDING_CHAR = ' ';
	
	// The distance between "=" and k's value
	private static final int PADDING_DISTANCE = 2;

	// The initial padding for the print line function
	private static final int INITIAL_PADDING = 0;
	/** Declare any constants that you may need here */
	
	

	/**
	 * Main function that will read in command line arguments and start the
	 * corresponding method if valid arguments were passed in
	 *
	 * @param args An array of all the command line arguments passed in
	 */
	public static void main(String[] args) {

		// Print help message if no arguments are passed in
		if (args.length == 0) {
			System.out.println(HELP_STR);
			return;
		}
		// Check to make sure there is exactly one arg
		else if (args.length > REQUIRED_ARGS) {
			System.out.println(EXTRA_ARGS_ERR);
		}
		// Check if the input arg is for the print triangle function and parse k value into it
		else if(args[0].contains("k =")) {
			int k = Integer.parseInt(args[0].substring(args[0].indexOf("=") + PADDING_DISTANCE));
			if (k <= 0 ) {
				System.out.println(INVALID_LENGTH_ERR);
				return;
			} else {
				printMyTriangle(k);
			}
		}
		// Parse the width for the print hourglass function and make sure it's valid
		else {
			if (Integer.parseInt(args[0]) <= 0 || Integer.parseInt(args[0]) % EVEN_DIVISOR == 0) {
				System.out.println(INVALID_WIDTH_ERR);
				return;
			} else {
				printHourglass(Integer.parseInt(args[0]), INITIAL_PADDING);
			}
		}

	}

	
	/**
	 * 
	 * 
	 * @param length The length of the last line of out put triangle
	 */
	protected static void printMyTriangle(int length) {
		// TODO
	}
	
	/**
	 * 
	 * 
	 * @param width   The width of the hourglass
	 * @param padding The amount of padding to use to position the hourglass
	 */
	protected static void printHourglass(int width, int padding) {
		// TODO
	}
	
	/**
	 * Helper function that will print a line of the hourglass
	 *
	 * @param width   The width of the line in the hourglass
	 * @param padding The amount of padding to use to position the line
	 */
	protected static void printLine(int width, int padding) {
		// Print the padding character padding times
		for (int i = 0; i < padding; i++) {
			System.out.print(PADDING_CHAR);
		}

		// Print the hourglass character width times
		for (int i = 0; i < width; i++) {
			System.out.print(HOURGLASS_CHAR);
		}

		// Print the padding character padding times
		for (int i = 0; i < padding; i++) {
			System.out.print(PADDING_CHAR);
		}

		// Move to the next line (can also be placed at the top)
		System.out.println();
	}
}
