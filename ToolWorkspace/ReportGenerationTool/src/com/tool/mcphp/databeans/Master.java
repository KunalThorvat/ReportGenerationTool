/**
 * 
 */
package com.tool.mcphp.databeans;

/**
 * @author kthorv2
 * for storing the all combined details
 */
public class Master {
	
	private String emailID;
	private String firstName;
	private String lastName;
	private String npn;
	
	public Master(){
		emailID = "";
		firstName = "";
		lastName = "";
		npn = "";
	}
	
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNpn() {
		return npn;
	}
	public void setNpn(String npn) {
		this.npn = npn;
	}
}
