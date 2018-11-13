package roomcount.checking.ValidTypeObjects;

import roomcount.checking.*;

public class ValidDate {
	public int day   = -1;
	public int month = -1;
	public int year  = -1;
	public boolean isValidDate = false;
	String originalInput = new String();

	/**
	 * Generate valid date object
	 * @param input
	 */
	public ValidDate(String input) {
		originalInput = input;
		if(Validation.isValid(ValidTypesEnum.V_DATE, input)) {
			isValidDate = true;
			// Do conversion
		}
	}

	/**
	 * Generate valid date object from given day, month, and year
	 * @param day
	 * @param month
	 * @param year
	 */
	public ValidDate(int _day, int _month, int _year) {
		this.day   = _day;
		this.month = _month;
		this.year  = _year;
	}

}
