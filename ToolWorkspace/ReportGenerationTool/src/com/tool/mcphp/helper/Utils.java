/**
 * 
 */
package com.tool.mcphp.helper;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.Part;

import org.joda.time.DateTime;
import org.joda.time.Months;
import org.joda.time.Years;

import com.tool.mcphp.constant.ConstantFile;

/**
 * @author kthorv2
 *contains all the utility methods used in application
 */
public class Utils {
	
	public static String getFileNameFromPart(Part part) {
        final String partHeader = part.getHeader("content-disposition");
        for (String content : partHeader.split(";")) {
        	
            if (content.trim().startsWith("filename")) {
                String fileName = content.substring(content.indexOf('=') + 1)
                        .trim().replace("\"", "");
                return fileName;
            }
        }
        return null;
    }
	
	/**
	 * returns true if the lastSubmittedDate & lastSubmittedDate for the current NPN has a difference of more than one year 
	 * @param lastSubmittedDate
	 * @param currentExtractedDate
	 * @return
	 */
	public static boolean isValidYear(String lastSubmittedDate,String currentExtractedDate){
		
		//getting the current date
		
		
		
		int lastSubmittedDateArray[] = parseDate(Integer.parseInt(lastSubmittedDate));
		int currentExtractedDateArray[] = parseDate(Integer.parseInt(currentExtractedDate));

		
		//System.out.println(lastSubmittedDate+"|"+currentExtractedDate);
		
		//System.out.println("lastSubmittedDate: "+lastSubmittedDate + "|" + lastSubmittedDateArray[ConstantFile.MONTH]);
		DateTime submitted = new DateTime(lastSubmittedDateArray[ConstantFile.YEAR], 
										lastSubmittedDateArray[ConstantFile.MONTH], 
										lastSubmittedDateArray[ConstantFile.DATE], 0, 0, 0, 0);
	    DateTime currentExtracted = new DateTime(currentExtractedDateArray[ConstantFile.YEAR], 
	    								currentExtractedDateArray[ConstantFile.MONTH], 
	    								currentExtractedDateArray[ConstantFile.DATE], 0, 0, 0, 0);

	   if(Years.yearsBetween(submitted, currentExtracted).getYears() > 1)
	    	return true;
	   else
	    	return false;
	  
	    
	    
	}
	
	/**
	 * checks if the current extracted record is not greater that six months
	 * @param currentExtractedDate
	 * @return
	 */
	public static boolean isValidMonth(String currentExtractedDate){
	
		int currentExtractedDateArray[] = parseDate(Integer.parseInt(currentExtractedDate));
		int currentDateArray[] = parseDate(Integer.parseInt(new SimpleDateFormat(ConstantFile.DATE_FROMAT).format(new Date())));
		DateTime currentExtracted = new DateTime(currentExtractedDateArray[ConstantFile.YEAR], 
					currentExtractedDateArray[ConstantFile.MONTH], 
					currentExtractedDateArray[ConstantFile.DATE], 0, 0, 0, 0);
		DateTime current = new DateTime(currentDateArray[ConstantFile.YEAR], 
		currentDateArray[ConstantFile.MONTH], 
		currentDateArray[ConstantFile.DATE], 0, 0, 0, 0);
		
		if(Months.monthsBetween(currentExtracted, current).getMonths() <= 6)
			return true;
		else
			return false;
		
	}
	
	/**
	 * for parsing the formatted date
	 * @param date
	 * @return
	 */
	public static int[] parseDate(int date){
		

		int returnArray [] = {0,0,0};
		int year = date/10000;
		int value = date % 10000;
		
		int month = value / 100;
		int day = value % 100;
		

		
		returnArray [0] = month;
		returnArray [1] = day;
		returnArray [2] = year;
		
		
		return returnArray;
		
	}
}
