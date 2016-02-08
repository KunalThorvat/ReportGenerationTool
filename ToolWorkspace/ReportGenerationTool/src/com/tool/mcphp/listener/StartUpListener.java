/**
 * 
 */
package com.tool.mcphp.listener;

import java.io.FileNotFoundException;
import java.util.Map;

import javax.faces.event.ListenerFor;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.slf4j.bridge.SLF4JBridgeHandler;

import com.tool.mcphp.databeans.Course;
import com.tool.mcphp.helper.CourseDetails;
import com.tool.mcphp.managedbeans.FileUpload;

/**
 * @author kthorv2
 * initialize course details map on server startup
 */

public class StartUpListener implements ServletContextListener {

	/* (non-Javadoc)
	 * @see javax.servlet.ServletContextListener#contextDestroyed(javax.servlet.ServletContextEvent)
	 */
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see javax.servlet.ServletContextListener#contextInitialized(javax.servlet.ServletContextEvent)
	 */
	@Override
	public void contextInitialized(ServletContextEvent event) {
		// TODO Auto-generated method stub
		System.out.println("Server started......");
		try {
			
			
			CourseDetails courseDetails = CourseDetails.getInstance();
			
			
			//building the courseDetails object
			Map<String,Course> course = courseDetails.buildCsvDetails();
			
			
			//building the dropdown map
			Map<String,String> courseDropDown = FileUpload.courseDropDown;
			
			//for populating courseDropdown
	        courseDropDown.clear();
	        
	        courseDropDown.put("Select your course","0000");
	        
	        course.forEach((key,value)->{
	    	    if(value.getFolderName()!=null){
	    	    	if(!value.getFolderName().trim().equalsIgnoreCase("")){
	    	    		courseDropDown.put(value.getFolderName(), key);
	    	    	}
	    	    	
	    	    }
	            	
	         });

			//for populating master details
	        courseDetails.getAllCombinedList();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
