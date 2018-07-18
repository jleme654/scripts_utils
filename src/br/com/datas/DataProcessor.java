package br.com.datas;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author julio
 * @since 
 */
public class DataProcessor {

	public static String getDateMajorActualForRangeDays(String rangeDays, String dataCompare) {
		Date today = new Date();
		String strGeneral = "yyyy-MM-dd";
		SimpleDateFormat formatDate = new SimpleDateFormat(strGeneral);
		String todayProcessed = formatDate.format(today);

		String yearToday = todayProcessed.substring(0, 4);
		String monthToday = todayProcessed.substring(5, 7);
		String dayToday = todayProcessed.substring(8, 10);
		System.out.println(yearToday + " - " + monthToday + " - " + dayToday);

		String yearCompare = dataCompare.substring(0, 4);
		String monthCompare = dataCompare.substring(5, 7);
		String dayCompare = dataCompare.substring(8, 10);
		System.out.println(yearCompare + " - " + monthCompare + " - " + dayCompare);

		if (Integer.parseInt(yearCompare) == Integer.parseInt(yearToday)) {
			if (Integer.parseInt(monthCompare) == Integer.parseInt(monthToday)) {
				int diffConvert = Integer.parseInt(dayCompare) - Integer.parseInt(dayToday);
				if (Math.abs(diffConvert) > Integer.parseInt(rangeDays)) {
					System.out.println(Integer.parseInt(dayToday) - Integer.parseInt(dayCompare));
					return "true";
				}
			} else if (Integer.parseInt(monthCompare) < Integer.parseInt(monthToday)) {
				int dayCompareConvert = Integer.parseInt(dayCompare);
				dayCompareConvert = 30 - dayCompareConvert;

				int dayTodayConvert = Integer.parseInt(dayToday);
				System.out.println("dayCompare: " + dayCompareConvert + " dayToday: " + dayTodayConvert);
				int result = dayCompareConvert + dayTodayConvert;
				System.out.println(result);
				if (result > Integer.parseInt(rangeDays))
					return "true";
			}
		}
		return "false";
	}

	public static void main(String[] args) {
		String dataCompare = "2018-07-10";
		System.out.println(getDateMajorActualForRangeDays("7", dataCompare));
	}

}
