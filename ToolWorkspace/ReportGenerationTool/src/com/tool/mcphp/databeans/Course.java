/**
 * 
 */
package com.tool.mcphp.databeans;

import javax.faces.bean.ManagedBean;

/**
 * @author kthorv2
 * for stroing all the course related details
 *
 */

public class Course {
	
	private String folderName;
	private String folderPath;
	private String allSubmittedPath;
	private String csvFileName;
	private String excelFileName;
	private String courseID;
	private String stateID;
	private String providerID;
	private String missingNPNPath;
	
	
	public Course(){
		this.folderName = "";
		this.folderPath = "";
		this.allSubmittedPath = "";
		this.csvFileName = "";
		this.excelFileName = "";
		this.courseID = "";
		this.missingNPNPath = "";
	}
	
	public String getFolderName() {
		return folderName;
	}
	public void setFolderName(String folderName) {
		this.folderName = folderName;
	}
	public String getFolderPath() {
		return folderPath;
	}
	public void setFolderPath(String folderPath) {
		this.folderPath = folderPath;
	}
	public String getAllSubmittedPath() {
		return allSubmittedPath;
	}
	public void setAllSubmittedPath(String allSubmittedPath) {
		this.allSubmittedPath = allSubmittedPath;
	}
	public String getCsvFileName() {
		return csvFileName;
	}
	public void setCsvFileName(String csvFileName) {
		this.csvFileName = csvFileName;
	}
	public String getExcelFileName() {
		return excelFileName;
	}
	public void setExcelFileName(String excelFileName) {
		this.excelFileName = excelFileName;
	}
	public String getCourseID() {
		return courseID;
	}
	public void setCourseID(String courseID) {
		this.courseID = courseID;
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

	public String getMissingNPNPath() {
		return missingNPNPath;
	}

	public void setMissingNPNPath(String missingNPNPath) {
		this.missingNPNPath = missingNPNPath;
	}
	
	

}
