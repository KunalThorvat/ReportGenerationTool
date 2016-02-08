/**
 * 
 */
package com.tool.mcphp.databeans;

/**
 * @author kthorv2
 * bean for "S|"  part of the final CSV
 */
public class SPart {

	private String npn;
	private String licNbr;
	private String ssn;
	private String licClass;
	private String credit;
	private String firstName;
	private String middleName;
	private String lastName;

	
	public SPart(){
		npn = "";
		licNbr = "";
		ssn = "";
		licClass = "";
		credit = "";
		firstName = "";
		middleName = "";
		lastName = "";
	}

	public String getNpn() {
		return npn;
	}

	public void setNpn(String npn) {
		this.npn = npn;
	}

	public String getLicNbr() {
		return licNbr;
	}

	public void setLicNbr(String licNbr) {
		this.licNbr = licNbr;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getLicClass() {
		return licClass;
	}

	public void setLicClass(String licClass) {
		this.licClass = licClass;
	}

	public String getCredit() {
		return credit;
	}

	public void setCredit(String credit) {
		this.credit = credit;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	
}
