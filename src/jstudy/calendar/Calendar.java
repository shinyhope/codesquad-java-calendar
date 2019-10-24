package jstudy.calendar;

import java.util.Scanner;

public class Calendar {

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] LEAP_MAX_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public boolean isLeapYear(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			return true;
		}
		return false;
	}

	public int getMaxDaysOfMonth(int year, int month) {
		if (isLeapYear(year)) {
			return LEAP_MAX_DAYS[month - 1];
		} else {
			return MAX_DAYS[month - 1];
		}

	}

	public void printCalendar(int year, int month, int weekday) {
		System.out.printf(" << %4d %3d >>\n", year, month);
		System.out.println("SU MO TU WE TH FR SA");
		System.out.println("--------------------");

		int maxDay = getMaxDaysOfMonth(year, month);
		for (int j = 0; j < weekday; j++) {
			System.out.print("   ");
		}
		int displayFlag = 0;
		for (int i = 1; i <= maxDay; i++) {
			System.out.printf("%3d", i);

			if (displayFlag == 0) {
				if (i % (7 - weekday) == 0) {
					System.out.println();
					displayFlag++;
				}

			} else {
				if ((i + weekday) % 7 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println();
		System.out.println();

	}

	public static void main(String[] args) {

		String PROMPT = "cal> ";
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		int month = 1;
		while (true) {
			System.out.println("달을 입력하세요.");
			System.out.print(PROMPT);
			month = scanner.nextInt();
			if (month == -1) {
				break;
			}
			if (month > 12) {
				continue;
			}
		}
		System.out.println("bye.");
		scanner.close();

	}

}
