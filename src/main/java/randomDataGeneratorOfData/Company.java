package randomDataGeneratorOfData;

/** Basic company object so that the attributes that are related can be held together.
 *  This has get and set operations for the name and web site of the company.
 */

public class Company {

	private String nameOfCompany;
	private String website;
	
	/** Basic company object constructor - with website and name attributes.
	 * 
	 * @param nameOfCompany name of the company
	 * @param website - website address
	 */
	
	public Company(String nameOfCompany, String website) {
		super();
		this.nameOfCompany = nameOfCompany;
		this.website = website;
	}
	
	/** Basic company object - get method for the name of the company.
	 * @return NameOfComapny as a string
	 */
	
	public String getNameOfCompany() {
		return nameOfCompany;
	}
	
	/** Basic company object  - set method for the name the company.
	 * @param nameOfCompany - name of the company
	 */
	
	public void setNameOfCompany(String nameOfCompany) {
		this.nameOfCompany = nameOfCompany;
	}
	
	/** Basic company object - get method for the web site of the company.
	 * @return Returns the website address 
	 */
	
	public String getWebsite() {
		return website;
	}
	
	/** Basic company object - set method for the web site of the company.
	 * @param website - the website address string
	 */
	
	public void setWebsite(String website) {
		this.website = website;
	}
}
