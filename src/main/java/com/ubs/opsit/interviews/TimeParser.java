package com.ubs.opsit.interviews;

public class TimeParser {

	private int hour, minute, second;

	public TimeParser(String time) {
		if (time == null) {
			throw new InvalidTimeFormatException("Time cannot be null");
		}
		String[] splits = time.split(":");
		try {
			this.hour = Integer.parseInt(splits[0]);
			this.minute = Integer.parseInt(splits[1]);
			this.second = Integer.parseInt(splits[2]);
		} catch (NumberFormatException e) {
			throw new InvalidTimeFormatException("Time should be a valid value!");
		}
		if (this.hour > 24 || this.hour < 0) {
			throw new InvalidTimeFormatException(
					"The value of hour should be between 0 & 24 inclusive. Invalid value =" + this.hour);
		}

		if (this.minute > 59 || this.minute < 0) {
			throw new InvalidTimeFormatException(
					"The value of hour should be between 0 & 60 inclusive. Invalid value =" + this.minute);
		}

		if (this.second > 59 || this.second < 0) {
			throw new InvalidTimeFormatException(
					"The value of hour should be between 0 & 60 inclusive. Invalid value =" + this.second);
		}
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}
}
