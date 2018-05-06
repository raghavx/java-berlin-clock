package com.ubs.opsit.interviews;

public class BerlinClockTimeConverter implements TimeConverter {

	@Override
	public String convertTime(String aTime) {
		StringBuilder ret = new StringBuilder();
		try {

			TimeParser lt = new TimeParser(aTime);
			ret.append(calculateSecond(lt.getSecond()));
			ret.append(System.lineSeparator());
			ret.append(calculateHour(lt.getHour()));
			ret.append(System.lineSeparator());
			ret.append(calculateMinute(lt.getMinute()));
		} catch (InvalidTimeFormatException e) {
			return "Invalid";
		}
		return ret.toString();
	}

	private String calculateSecond(int second) {
		if (second % 2 == 0) {
			return Lights.Yellow.getRepresentation();
		}

		return Lights.Off.getRepresentation();
	}

	private String calculateMinute(int minute) {
		StringBuilder ret = new StringBuilder();
		int firstRow = minute / 5;
		// generate first row
		for (int i = 0; i < firstRow; i++) {
			switch (i) {
			case 2:
			case 5:
			case 8:
				ret.append(Lights.Red.getRepresentation());
				break;
			default:
				ret.append(Lights.Yellow.getRepresentation());
				break;
			}
		}
		// append off
		for (int i = firstRow; i < 11; i++) {
			ret.append(Lights.Off.getRepresentation());
		}
		// change the line
		ret.append(System.lineSeparator());
		// generate second row
		int secondRow = minute % 5;
		for (int i = 0; i < secondRow; i++) {
			ret.append(Lights.Yellow.getRepresentation());
		}
		// append off
		for (int i = secondRow; i < 4; i++) {
			ret.append(Lights.Off.getRepresentation());
		}

		return ret.toString();
	}

	private String calculateHour(int hour) {
		int firstRow = hour / 5;
		int secondRow = hour % 5;
		StringBuilder ret = new StringBuilder();
		// populate first row
		generateHourRow(ret, firstRow);
		// change line
		ret.append(System.lineSeparator());
		// populate second row
		generateHourRow(ret, secondRow);
		return ret.toString();
	}

	private void generateHourRow(StringBuilder ret, int row) {
		for (int i = 0; i < row; i++) {
			ret.append(Lights.Red.getRepresentation());
		}
		for (int i = row; i < 4; i++) {
			ret.append(Lights.Off.getRepresentation());
		}
	}

}
