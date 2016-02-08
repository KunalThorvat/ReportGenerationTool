/**
 * 
 */
package com.tool.mcphp.databeans;

/**
 * @author kthorv2
 * bean for "H|" part of the csv
 */
public class HPart {
	
	private String stateID;
	private String providerID;
	private String courseID;
	private String completionDate;
	
	
	public HPart(){
		stateID = "";
		providerID = "";
		courseID = "";
		completionDate = "";
	}
	
	public String getStateID() {
		return stateID;
	}
	public void setStateID(String stateID) {
		this.stateID = stateID;
	}
	public String getProviderID() {
		return providerID;
	}
	public void setProviderID(String providerID) {
		this.providerID = providerID;
	}
	public String getCourseID() {
		return courseID;
	}
	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}
	public String getCompletionDate() {
		return completionDate;
	}
	public void setCompletionDate(String completionDate) {
		this.completionDate = completionDate;
	}
	
	
}
