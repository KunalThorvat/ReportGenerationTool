/**
 * 
 */
package com.tool.mcphp.databeans;

/**
 * @author kthorv2
 * bean for storing the uploaded file
 */
public class Uploaded {
	private String firstName;
	private String lastName;
	private String emailID;
	private String completionDate;
	private String completionDateFormatted;
	private String certificateCode;
	
	
	public Uploaded(){
		firstName = "";
		lastName = "";
		emailID = "";
		completionDate = "";
		completionDateFormatted = "";
		certificateCode = "";
		
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
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getCompletionDate() {
		return completionDate;
	}
	public void setCompletionDate(String completionDate) {
		this.completionDate = completionDate;
	}
	public String getCompletionDateFormatted() {
		return completionDateFormatted;
	}
	public void setCompletionDateFormatted(String completionDateFormatted) {
		this.completionDateFormatted = completionDateFormatted;
	}
	public String getCertificateCode() {
		return certificateCode;
	}
	public void setCertificateCode(String certificateCode) {
		this.certificateCode = certificateCode;
	}
}
