package jstudy.calendar;

import java.util.Scanner;

public class Prompt {

	public int parseDay(String weekday) {
		System.out.println(">> ##" + weekday);
		if (weekday.equals("su"))
			return 0;
		else if (weekday.equals("mo"))
			return 1;
		else if (weekday.equals("tu"))
			return 2;
		else if (weekday.equals("we"))
			return 3;
		else if (weekday.equals("th"))
			return 4;
		else if (weekday.equals("fr"))
			return 5;
		else if (weekday.equals("sa"))
			return 6;
		else
			return 0;

	}

	public void runPrompt() {

		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		int month = 1;
		int year = 2017;
		int weekday = 0;

		while (true) {
			System.out.println("연도을 입력하세요. -1 종료");
			System.out.print("YEAR > ");
			year = scanner.nextInt();

			if (year == -1) {
				break;
			}

			System.out.println("달을 입력하세요.");
			System.out.print("MONTH > ");
			month = scanner.nextInt();

			System.out.println("첫째날의 요일을 입력하세요.");
			String str_weekday = scanner.next();
			weekday = parseDay(str_weekday);
			System.out.println(">>" + weekday);

			if (month > 12 || month < 1) {
				System.out.println("잘못 입력 하셨쒀요.");
				continue;
			}
			cal.printCalendar(year, month, weekday);

		}
		System.out.println("bye.");
		scanner.close();

	}

	public static void main(String[] args) {

		Prompt p = new Prompt();
		p.runPrompt();

	}

}
