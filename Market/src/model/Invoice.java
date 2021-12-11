package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class Invoice {
	private ArrayList<ListProduct> list;
	private String dateToday;
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String fecha() {

		String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());

		return timeStamp;
	}
}
