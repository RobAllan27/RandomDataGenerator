package randomDataGeneratorOfData;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * This class is used to actually get each of the set of random data, and then write out to file.
 * 
 * @author Rob
 *
 */

public class RandomDataCollator {
	FileWriter fw;
	
	public  RandomDataCollator() {
		//C:\Users\Rob\Userdata\DX Software Testing\Automation
		
	}
	
	/**
	 * This public method creates the random data source and a new file writer.
	 * It then iterates across the random data source and creates random person objects. 
	 * It gets the string builder for each of those entities and then writes out to a file. 
	 */
		public void buildTestData() {
		RandomDataSource rds = new RandomDataSource();
		StringBuilder stringBuilderofDetails;
		rds.generateNewRandomPerson();
		
		
		try {
		fw = new FileWriter(new File("C:/Users/Rob/Userdata/DX Software Testing/Automation/Automationtest.csv"));
		for (int i = 0; i< 5000; i++) {
			stringBuilderofDetails = rds.generateNewRandomPerson();
			rds.generateNewRandomPerson();
			writeLineToFile(stringBuilderofDetails);
		}
		
		}
		catch (Exception e) {
			e.getMessage();
		}finally {
			try {
				if (fw != null) {
					fw.flush();
					fw.close();					
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
	
	/**
	 * This private method does some basic formatting of each line and sends a newline character.
	 * @param inStringSB - pass in a string builder , so its contents can be written out to file.
	 */
	private void writeLineToFile(StringBuilder inStringSB) {
			try {
				fw.write(inStringSB.toString());
				fw.write("\n");
			} catch (Exception e) {
					e.getMessage();
				}
			}	 
	    }
