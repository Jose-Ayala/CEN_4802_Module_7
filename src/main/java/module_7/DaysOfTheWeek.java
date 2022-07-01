package module_7;

/**
 * <h1>Days of the Week</h1> 
 * A program that returns the day of the week
 * based on a value of 1 - 7.
 *
 * @author Jose Ayala
 * @version 1.0, 06/11/22
 * @since 2022-06-11
 */
public class DaysOfTheWeek {

	/**
	 * A method that accepts a number as a parameter and
	 * returns the corresponding day of the week.
	 * @param number The value 1-7 corresponding to the day of the week.
	 * @return The day of the week.
	 */
	public String dayOfTheWeek(int number) {
		
		String dayOfWeek = "";
		
		switch (number) {
		case 1:
			dayOfWeek = "Sunday";
			break;
		case 2:
			dayOfWeek = "Monday";
			break;
		case 3:
			dayOfWeek = "Tuesday";
			break;
		case 4:
			dayOfWeek = "Wednesday";
			break;
		case 5:
			dayOfWeek = "Thursday";
			break;
		case 6:
			dayOfWeek = "Friday";
			break;
		case 7:
			dayOfWeek = "Saturdy";
			break;
		default:
			dayOfWeek = "You entered an invalid number";
		}
		
		return dayOfWeek;
	}

}
