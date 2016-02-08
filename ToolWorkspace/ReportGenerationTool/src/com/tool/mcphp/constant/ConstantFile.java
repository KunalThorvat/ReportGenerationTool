/**
 * 
 */
package com.tool.mcphp.constant;

import java.util.Arrays;
import java.util.List;

/**
 * @author kthorv2
 *for storing all the constants
 */
public class ConstantFile {

	public static final String MAIN_PATH = "C:\\Users\\kthorv2\\Desktop\\ReportGeneration\\Files\\Course Submissions\\";	
	
	public static final String CSV_DETAILS_FILE = "CSV_DETAILS.xlsx";
	public static final String ALL_COMBINED_FILE = "COMBINED NAVIPCCACJanuary2016.xlsx";
	
	
	
	//csv details column headers
	public static final int CSV_DETAILS_FOLDER_NAME = 0;
	public static final int CSV_DETAILS_FOLDER_PATH = 1;
	public static final int CSV_DETAILS_ALL_SUBMITTED = 2;
	public static final int CSV_DETAILS_CSV_FILE_NAME = 3;
	public static final int CSV_DETAILS_EXCEL_FILE_NAME = 4;
	public static final int CSV_DETAILS_COURSE_ID = 5;
	public static final int CSV_DETAILS_STATE_ID = 6;
	public static final int CSV_DETAILS_PROVIDER_ID = 7;
	public static final int CSV_DETAILS_MISSING_NPN = 8;
	
	
	//buffer size
	public static final int BUFFER_SIZE = 1024; 
	
	
	//downloaded table columns
	public static final int FIRST_NAME_COLUMN = 0;
	public static final int LAST_NAME_COLUMN = 1;
	public static final int EMAIL_ID_COLUMN = 2;
	public static final int COMPLETION_DATE_COLUMN = 3;
	public static final int COMPLETION_DATE_FORMATTED_COLUMN = 4;
	public static final int CERTIFICATE_CODE_COLUMN = 5;
	
	
	//master table columns
	public static final int  MASTER_LAST_NAME_COLUMN = 0;
	public static final int  MASTER_FIRST_NAME_COLUMN = 1;
	public static final int  MASTER_EMAIL_ID_COLUMN = 9;
	public static final int  MASTER_NPN_COLUMN = 2;
	
	
	public static final String UPLOADED_FILE_SEPARATOR = ",";
	
	public static final String FOLDER_NAMING_DATE_FORMAT = "yyyy-MM-dd";
	
	public static final List<String> MERGED_COLUMN_HEADERS = Arrays.asList("firstname",
			"lastname",
			"email",
			"completion date",
			"completion date formatted",
			"certificate code",
			"NPN");
	
	//merged table columns
	public static final int MERGED_FIRST_NAME_COLUMN = 0;
	public static final int MERGED_LAST_NAME_COLUMN = 1;
	public static final int MERGED_EMAIL_ID_COLUMN = 2;
	public static final int MERGED_COMPLETION_DATE_COLUMN = 3;
	public static final int MERGED_COMPLETION_DATE_FORMATTED_COLUMN = 4;
	public static final int MERGED_CERTIFICATE_CODE_COLUMN = 5;
	public static final int MERGED_NPN_COLUMN = 6;
	public static final int MERGED_TOTAL_COLUMNS = 7;
	
	//for date
	public static final int MONTH = 0;
	public static final int DATE = 1;
	public static final int YEAR = 2;
	public static final String DATE_FROMAT = "yyyyMMdd";
	
	//for writing to CSV
	public static final String H_PART = "H";
	public static final String S_PART = "S";
	public static final String T_PART = "T";
	public static final String RECORD_SEPARATOR = "|";
	public static final String NEW_LINE = "\n";
}
