package module_7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * <h1>Days of the Week Test</h1>
 * A program that tests the return values of the DayOfTheWeek class.
 *
 * @author Jose Ayala
 * @version 1.0, 06/11/22
 * @since 2022-06-11
 */
class DaysOfTheWeekTest {

	// Create an instance of the module_5 DaysOfTheWeek class
	DaysOfTheWeek daysOfTheWeek = new DaysOfTheWeek();

	/**
	 * Test 1 = Sunday.
	 * 
	 * @result Entering a value of 1 will return Sunday
	 */
	@Test
	void sundayTest() {
		assertEquals(daysOfTheWeek.dayOfTheWeek(1), "Sunday");
	}

	/**
	 * Test 2 = Monday.
	 * 
	 * @result Entering a value of 2 will return Monday
	 */
	@Test
	void mondayTestt() {
		assertEquals(daysOfTheWeek.dayOfTheWeek(2), "Monday");
	}

	/**
	 * Test 3 = Tuesday.
	 * 
	 * @result Entering a value of 3 will return Tuesday
	 */
	@Test
	void tuesdayTest() {
		assertEquals(daysOfTheWeek.dayOfTheWeek(3), "Tuesday");
	}

	/**
	 * Test 4 = Wednesday.
	 * 
	 * @result Entering a value of 4 will return Wednesday
	 */
	@Test
	void wednesdayTest() {
		assertEquals(daysOfTheWeek.dayOfTheWeek(4), "Wednesday");
	}

	/**
	 * Test 5 = Thursday.
	 * 
	 * @result Entering a value of 5 will return Thursday
	 */
	@Test
	void thursdayTest() {
		assertEquals(daysOfTheWeek.dayOfTheWeek(5), "Thursday");
	}

	/**
	 * Test 6 = Friday.
	 * 
	 * @result Entering a value of 6 will return Friday
	 */
	@Test
	void fridayTest() {
		assertEquals(daysOfTheWeek.dayOfTheWeek(6), "Friday");
	}

	/**
	 * Test 7 = Saturday.
	 * 
	 * @result Entering a value of 7 will return Saturday
	 */
	@Test
	void saturdayTest() {
		assertEquals(daysOfTheWeek.dayOfTheWeek(7), "Saturday");
	}

	/**
	 * Test 0 = Invalid.
	 * 
	 * @result Entering a value of 0 will return an invalid number message
	 */
	@Test
	void zeroTest() {
		assertEquals(daysOfTheWeek.dayOfTheWeek(0), "You entered an invalid number");
	}

	/**
	 * Test 10 = Invalid.
	 * 
	 * @result Entering a value of 10 will return an invalid number message
	 */
	@Test
	void tenTest() {
		assertEquals(daysOfTheWeek.dayOfTheWeek(10), "You entered an invalid number");
	}

}
