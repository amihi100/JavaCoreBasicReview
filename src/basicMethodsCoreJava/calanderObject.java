package basicMethodsCoreJava;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class calanderObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		SimpleDateFormat sd = new SimpleDateFormat ("mm/d/yyyy hh:mm:ss");
		System.out.println(sd.format(cal.getTime()));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
	}

}
