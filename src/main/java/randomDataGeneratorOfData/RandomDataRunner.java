package randomDataGeneratorOfData;

/** This is simple class to invoke the program and create test data.
 * 
 * @author Rob
 *
 */

public class RandomDataRunner {

	
	/**
	 * The main method here is simple  -  it simply creates an instance of the Random data collator, runs it. Control is then 
	 * handed over to the rdc where the output is defined and iterations occur.
	 * @param args - no args are required to run this.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomDataCollator rdc = new RandomDataCollator();
		rdc.buildTestData();
	}

}
