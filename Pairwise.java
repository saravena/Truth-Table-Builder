
public class Pairwise {
	/**
	* Main method that allows more than two parameters
	* Program will end if the number of arguments is below 2
	*
	* @param args array used to track the arguments form the cmdline
	*/
	public static void main(String[] args) {
		// Parameter check
		if (args.length < 2) {
			System.out.println("Please enter at least two parameters!");
			System.exit(1);
		}

		// check parameter chars
		for (int i = 0; i < args.length; i++) {
			if (args[i].length() > 10) {
				args[i] = args[i].substring(0, 10);
			}
			System.out.print(args[i] + "\t");
		}

		System.out.println();
		generateTable(0, args.length, new int[args.length]);
	}

	/**
 * Generates a truth table based on the arguments inputted.
 * This method always prints out a truth table
 *
 * @param  index  jthe starting index for the truth table
 * @param  size   the number of arguments
 * @param  current array used for printing the table
 */
	public static void generateTable(int index, int size, int[] current) {
	    if (index == size) {
	        for (int i = 0; i < size; i++) {
	            System.out.print(current[i] + "\t");
	        }
	        System.out.println();
	    } else {
	        for (int i = 0; i < 2; i++) {
	            current[index] = i;
	            generateTable(index + 1, size, current);
	        }
	    }
	}

}
