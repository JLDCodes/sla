/**
 * Program Name: Student.java(file_name)
 * Purpose: create a student object to store information submitted by user
 * Coder: JL
 * Date:April 2nd, 2020
 */

public class Student {
	private String studentID;
	private String surname;
	private String middleName;
	private String firstName;
	private String aptNumber;
	private String streetNumber;
	private String streetName;
	private String city;
	private String province;
	private String postalCode;
	private double cslLoanAmount;
	private double oslLoanAmount;
	
	public Student(String stdID, String surname, String mid, String firstName, String aptNumber, 
			String streetNumber, String streetName, String city, String province, String postalCode, 
			double cslLoanAmount, double oslLoanAmount) {
		this.studentID = stdID;
		this.surname = surname;
		this.middleName = mid;
		this.firstName = firstName;
		this.aptNumber = aptNumber;
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.city = city;
		this.province = province;
		this.postalCode = postalCode;
		this.cslLoanAmount = cslLoanAmount;
		this.oslLoanAmount = oslLoanAmount; 
		
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getAptNumber() {
		return aptNumber;
	}

	public void setAptNumber(String aptNumber) {
		this.aptNumber = aptNumber;
	}

	public String getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public double getCslLoanAmount() {
		return cslLoanAmount;
	}

	public void setCslLoanAmount(double cslLoanAmount) {
		this.cslLoanAmount = cslLoanAmount;
	}

	public double getOslLoanAmount() {
		return oslLoanAmount;
	}

	public void setOslLoanAmount(double oslLoanAmount) {
		this.oslLoanAmount = oslLoanAmount;
	}

	public String getStudentID() {
		return studentID;
	}
	/**
	 * Method Name: toString
	 * Purpose: override the toString method with aditional information
	 * Accepts: nothing
	 * Returns: a string that
	 * Date: April 2nd, 2020
	 */
	public String toString() {
		String name = "Student Name: "+surname+", "+firstName+" "+middleName+"\n";
		String number = "Student Number: "+studentID+"\n";
		String cslAmount = "CSL Amount is "+String.format("%.2f", cslLoanAmount)+"\n";
		String oslAmount = "OSL Amount is "+String.format("%.2f", oslLoanAmount)+"\n";
		
		String rString = name + number +cslAmount + oslAmount;
		return rString; 		
	}
}
