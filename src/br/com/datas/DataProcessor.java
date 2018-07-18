package br.com.datas;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author julio
 * @since
 */
public class DataProcessor {

	public static String getOrdersCanceledForRangeDays(String rangeDays, String dataCompare) {
		Date today = new Date();
		String strGeneral = "yyyy-MM-dd";
		SimpleDateFormat formatDate = new SimpleDateFormat(strGeneral);
		String todayProcessed = formatDate.format(today);
		// TODO testes
		// todayProcessed = "2019-01-10";

		String yearToday = todayProcessed.substring(0, 4);
		String monthToday = todayProcessed.substring(5, 7);
		String dayToday = todayProcessed.substring(8, 10);
		System.out.println("hoje:         " + yearToday + " - " + monthToday + " - " + dayToday);

		String yearCompare = dataCompare.substring(0, 4);
		String monthCompare = dataCompare.substring(5, 7);
		String dayCompare = dataCompare.substring(8, 10);
		System.out.println("data compare: " + yearCompare + " - " + monthCompare + " - " + dayCompare);

		if (Integer.parseInt(yearCompare) == Integer.parseInt(yearToday)) {
			if (Integer.parseInt(monthCompare) > Integer.parseInt(monthToday)) {
				System.out.println("Mes superior ao mes atual");
				return "false";
			} else if (Integer.parseInt(monthCompare) == Integer.parseInt(monthToday)) {
				System.out.println("-------------------------");
				System.out.println("mesmo mes");
				int result = calculateDaysIn_SAME_MONTH(dayToday, dayCompare);
				if (result < 0) {
					System.out.println("Dia de comparacao superior ao dia atual");
					return "false";
				}
				if (result > Integer.parseInt(rangeDays)) {
					System.out.println("result: "+ result);
					return "true";
				}
			} else if (Integer.parseInt(monthCompare) < Integer.parseInt(monthToday)) {
				System.out.println("-------------------------");
				System.out.println("mes anterior");
				int result = calculateDaysIn_DIFFERENT_MONTH(dayToday, dayCompare);
				System.out.println("result: "+ result);
				if (result > Integer.parseInt(rangeDays))
					return "true";
			}
		} else if (Integer.parseInt(yearCompare) < Integer.parseInt(yearToday)) {
			System.out.println("-------------------------");
			System.out.println("ano anterior");
			if (monthCompare.equalsIgnoreCase("12") && monthToday.equalsIgnoreCase("01")) {
				int result = calculateDaysIn_DIFFERENT_MONTH(dayToday, dayCompare);
				if (result < 0) {
					System.out.println("Dia de comparacao superior ao dia atual");
					return "false";
				}
				System.out.println("result: "+ result);
				if (result > Integer.parseInt(rangeDays))
					return "true";
			} else {
				return "true";
			}
		}
		return "false";
	}
	
	private static int calculateDaysIn_SAME_MONTH(String dayToday, String dayCompare) {
		int dayCompareConvert = Integer.parseInt(dayCompare);
		
		int dayTodayConvert = Integer.parseInt(dayToday);
		System.out.println("dayCompare: " + dayCompareConvert + " dayToday: " + dayTodayConvert);

		int result =  dayTodayConvert - dayCompareConvert;
		return result;
	}

	private static int calculateDaysIn_DIFFERENT_MONTH(String dayToday, String dayCompare) {
		int dayCompareConvert = Integer.parseInt(dayCompare);
		dayCompareConvert = 30 - dayCompareConvert;

		int dayTodayConvert = Integer.parseInt(dayToday);
		System.out.println("dayCompare: " + dayCompareConvert + " dayToday: " + dayTodayConvert);

		int result =  dayTodayConvert - dayCompareConvert;
		return result;
	}

	public static void main(String[] args) {
		String dataCompare = "2018-07-10";
		String rangeDaysStr = "7";
		System.out.println("range days: " + rangeDaysStr);
		System.out.println(getOrdersCanceledForRangeDays(rangeDaysStr, dataCompare));
	}

}
