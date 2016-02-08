package com.tool.mcphp.helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.servlet.ServletContextEvent;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.tool.mcphp.constant.ConstantFile;
import com.tool.mcphp.databeans.Course;
import com.tool.mcphp.databeans.Master;

/**
 * 
 * @author kthorv2
 * for populating all the course related details (implemented as a singleton)
 */

public class CourseDetails {

	
	private static Map<String,Course> courseMap = new LinkedHashMap<String,Course>();
	
	private ArrayList<Master> masterList = new ArrayList<Master>();
	
	private static CourseDetails courseDetails = null;
	
	
	private CourseDetails(){
		// to disable instantiation
	}
	
	
	public static CourseDetails getInstance(){
		
		if(courseDetails == null){
			courseDetails = new CourseDetails();
		}
		
		return courseDetails;
	}
	
	
	
	

	public Map<String, Course> getCourseMap() {
		return courseMap;
	}

	public void setCourseMap(Map<String, Course> courseMap) {
		this.courseMap = courseMap;
	}
	
	
	
	public ArrayList<Master> getMasterList() {
		return masterList;
	}


	public void setMasterList(ArrayList<Master> masterList) {
		this.masterList = masterList;
	}


	/*method for building the csvdetails map*/
	public Map<String,Course> buildCsvDetails() throws Exception{
		
		System.out.println("Building the csv map.......");
		
		Workbook wb = new XSSFWorkbook(new FileInputStream(ConstantFile.MAIN_PATH+ConstantFile.CSV_DETAILS_FILE));
		Sheet sheet = wb.getSheetAt(0);
		
		Iterator rowIterator = sheet.rowIterator();
		
		while(rowIterator.hasNext()){
			Row row = (Row) rowIterator.next();
			
			if(row.getRowNum() != 0){
				Course course = new Course();
				Iterator cellIterator = row.cellIterator();
				
				while(cellIterator.hasNext()){
					
					Cell cell = (Cell) cellIterator.next();
					
					if(cell.getColumnIndex() == ConstantFile.CSV_DETAILS_FOLDER_NAME){
						cell.setCellType(cell.CELL_TYPE_STRING);
						course.setFolderName(cell.getRichStringCellValue().getString());
					}else if(cell.getColumnIndex() == ConstantFile.CSV_DETAILS_FOLDER_PATH){
						cell.setCellType(cell.CELL_TYPE_STRING);
						course.setFolderPath(cell.getRichStringCellValue().getString());
					}else if(cell.getColumnIndex() == ConstantFile.CSV_DETAILS_ALL_SUBMITTED){
						cell.setCellType(cell.CELL_TYPE_STRING);
						course.setAllSubmittedPath(cell.getRichStringCellValue().getString());
					}else if(cell.getColumnIndex() == ConstantFile.CSV_DETAILS_CSV_FILE_NAME){
						cell.setCellType(cell.CELL_TYPE_STRING);
						course.setCsvFileName(cell.getRichStringCellValue().getString());
					}else if(cell.getColumnIndex() == ConstantFile.CSV_DETAILS_EXCEL_FILE_NAME){
						cell.setCellType(cell.CELL_TYPE_STRING);
						course.setExcelFileName(cell.getRichStringCellValue().getString());
					}else if(cell.getColumnIndex() == ConstantFile.CSV_DETAILS_COURSE_ID){
						cell.setCellType(Cell.CELL_TYPE_STRING);
						course.setCourseID(cell.getRichStringCellValue().getString());
					}else if(cell.getColumnIndex() == ConstantFile.CSV_DETAILS_STATE_ID){
						cell.setCellType(Cell.CELL_TYPE_STRING);
						course.setStateID(cell.getRichStringCellValue().getString());
					}else if(cell.getColumnIndex() == ConstantFile.CSV_DETAILS_PROVIDER_ID){
						cell.setCellType(Cell.CELL_TYPE_STRING);
						course.setProviderID(cell.getRichStringCellValue().getString());
					}else if(cell.getColumnIndex() == ConstantFile.CSV_DETAILS_MISSING_NPN){
						cell.setCellType(Cell.CELL_TYPE_STRING);
						course.setMissingNPNPath(cell.getRichStringCellValue().getString());
					}
				}
				
				courseMap.put(course.getCourseID(), course);
			}
			
			
			
		}
		
		//printCSVMap();
		return courseMap;
		
	}

	/**
	 * for building the masterlist
	 * @throws IOException 
	 */
	public void getAllCombinedList() throws IOException{
		
		FileInputStream masterStream = new FileInputStream(ConstantFile.MAIN_PATH + ConstantFile.ALL_COMBINED_FILE);
		Workbook wb = new XSSFWorkbook(masterStream);
		Sheet sheet = wb.getSheetAt(0);
		
		
		Iterator rowIterator = sheet.iterator();
		
		while(rowIterator.hasNext()){
			Row row = (Row) rowIterator.next();
			//for ignoring the column headers
			if(row.getRowNum() != 0){
				Iterator cellIterator = row.cellIterator();
				Master master = new Master();
				
				while(cellIterator.hasNext()){
					Cell cell = (Cell) cellIterator.next();
					cell.setCellType(1);
					if(cell.getColumnIndex() == ConstantFile.MASTER_EMAIL_ID_COLUMN){
						
												
						if(cell.getStringCellValue()!=null)
							master.setEmailID(cell.getStringCellValue());
						else{
							master.setEmailID("");
						}
						
						
						
					}else if(cell.getColumnIndex() == ConstantFile.MASTER_FIRST_NAME_COLUMN){
												
						if(cell.getStringCellValue()!=null)
							master.setFirstName(cell.getStringCellValue());
						else
							master.setFirstName("");
						
					}else if(cell.getColumnIndex() == ConstantFile.MASTER_LAST_NAME_COLUMN){
						
						if(cell.getStringCellValue()!=null)
							master.setLastName(cell.getStringCellValue());
						else
							master.setLastName("");
						
					}
					else if(cell.getColumnIndex() == ConstantFile.MASTER_NPN_COLUMN){
						if(cell.getStringCellValue()!=null)
							master.setNpn(cell.getStringCellValue());
						else
							master.setNpn("");
					}
				}
				masterList.add(master);
			}
		}
		//printMasterList();
	}
	
	
	/*for testing purpose only*/
	public void printCSVMap(){
		Iterator it = courseMap.entrySet().iterator();
		
		while(it.hasNext()){
			Map.Entry pair = (Map.Entry)it.next();
			
			System.out.println(pair.getKey() + " : " );
			Course course = (Course) pair.getValue();
			
			System.out.println(course.getFolderName());
			System.out.println(course.getFolderPath());
			System.out.println(course.getAllSubmittedPath());
			System.out.println(course.getCsvFileName());
			System.out.println(course.getExcelFileName());
			System.out.println(course.getCourseID());
			System.out.println(course.getStateID());
			System.out.println(course.getProviderID());
			
		}
	} 
	
	
	
	public void printMasterList(){
		
		for(Master master: masterList){
			System.out.println(master.getEmailID()+"  |  "+master.getFirstName()+"  |  "+master.getLastName()+"  |  "+master.getNpn());
		}
		
		for(int i = 0;i < masterList.size();i++){
			System.out.println(masterList.get(i).getEmailID()+"  |  "+masterList.get(i).getFirstName()+"  |  "+masterList.get(i).getLastName()+"  |  "+masterList.get(i).getNpn());
		}
		
	}	
	
	/*for testing purpose only*/
}
	
	

