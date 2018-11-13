package roomcount.checking.ValidTypeObjects;

import roomcount.checking.*;

public class ValidTime {
	public int hours = -1;
	public int minutes = -1;
	public boolean isValidTime = false;
	String originalInput = new String();

	public ValidTime(String input) {
		originalInput = input;
		if( Validation.isValid(ValidTypesEnum.V_TIME, input) ) {
			isValidTime = true;
			// Do conversion
		}
	}

	public ValidTime(int _hours, int _minutes) {
		this.hours   = _hours;
		this.minutes = _minutes;
	}
}
