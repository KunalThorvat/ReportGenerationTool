/**
 * 
 */
package com.tool.mcphp.databeans;

/**
 * @author kthorv2
 * bean for the final generated csv record
 */
public class FinalCSVRecord {

	private HPart hPart;
	private SPart sPart;
	private String tPart;
	
	public FinalCSVRecord(){
		hPart = new HPart();
		sPart = new SPart();
		tPart = "";
	}

	public HPart gethPart() {
		return hPart;
	}

	public void sethPart(HPart hPart) {
		this.hPart = hPart;
	}

	public SPart getsPart() {
		return sPart;
	}

	public void setsPart(SPart sPart) {
		this.sPart = sPart;
	}

	public String gettPart() {
		return tPart;
	}

	public void settPart(String tPart) {
		this.tPart = tPart;
	}
	
	
}
