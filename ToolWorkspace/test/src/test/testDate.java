package test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class testDate {

	public static void main(String[] args) {
		Date date = Calendar.getInstance().getTime();
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	    System.out.println(sdf.format(date));

	}

}
