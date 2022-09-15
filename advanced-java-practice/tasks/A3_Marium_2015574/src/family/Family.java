package Task1;

public class Family {
	private String forename;
	private String surname;
	private String parent;
	private String location;

	/**
	 * default family constructor to initialize attributes with default parameters
	 */
	public Family() {
		this.forename = "Mickey";
		this.surname = "Mouse";
		this.parent = "Disney";
		this.location = "USA";
	}

	/**
	 * Parameter constructor sets all the attribute values based on the given
	 * parameter values
	 * 
	 * @param forename
	 * @param surname
	 * @param parent
	 * @param location
	 */
	public Family(String forename, String surname, String parent, String location) {
		this.forename = forename;
		this.surname = surname;
		this.parent = parent;
		this.location = location;
	}

	/**
	 * Accessor for the forename attribute
	 * 
	 * @return the forename value
	 */
	public String getForename() {
		return forename;
	}

	/**
	 * Mutator for the forename attribute
	 */
	public void setForename(String forename) {
		this.forename = forename;
	}

	/**
	 * Accessor for the surname attribute
	 * 
	 * @return the surname value
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * Mutator for the surname attribute
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * Accessor for the parent attribute
	 * 
	 * @return the parent value
	 */
	public String getParent() {
		return parent;
	}

	/**
	 * Mutator for the parent attribute
	 */
	public void setParent(String parent) {
		this.parent = parent;
	}

	/**
	 * Accessor for the location attribute
	 * 
	 * @return the location value
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * Mutator for the location attribute
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * format the family attribute values into a readable string
	 */
	@Override
	public String toString() {
		return "Member of forename: " + forename + ", surname: " + surname + ", parent: " + parent + ", location: " + location;
	}

}
