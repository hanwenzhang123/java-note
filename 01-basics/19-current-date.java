import java.text.SimpleDateFormat;  //format
import java.util.Date;

public class CurrentDate {

	public static void main(String[] args) {

		// https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html

		Date currentDate = new Date();
		System.out.println(currentDate); 

		SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss"); //07:40:32
		System.out.println(timeFormat.format(currentDate)); //using .format() method

		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy"); //07/20/2021
		System.out.println(dateFormat.format(currentDate));

		SimpleDateFormat dayOfTheWeekFormat = new SimpleDateFormat("EEEE"); //Tuesday
		System.out.println(dayOfTheWeekFormat.format(currentDate));

		SimpleDateFormat clockFormat = new SimpleDateFormat("h:mm a");  //7:40PM
		System.out.println(clockFormat.format(currentDate));
	}

}
