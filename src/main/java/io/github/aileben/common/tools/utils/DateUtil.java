package io.github.aileben.common.tools.utils;

import org.joda.time.DateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	public static final String DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";
	public static final String MINUTE_PATTERN = "yyyy-MM-dd HH:mm";
	public static final String HOUR_PATTERN = "yyyy-MM-dd HH:mm:ss";
	public static final String DATE_PATTERN = "yyyy-MM-dd";
	public static final String MONTH_PATTERN = "yyyy-MM";
	public static final String YEAR_PATTERN = "yyyy";
	public static final String MINUTE_ONLY_PATTERN = "mm";
	public static final String HOUR_ONLY_PATTERN = "HH";


	/**
	 * 获取当前时间
	 * @return
	 */
	public final static Date now(){
		return DateTime.now().toDate();
	}


	/**
	 * 生成默认的时间字符串类型
	 * @return
	 */
	public final static String defaultNow(){
		return DateTime.now().toString(DateUtil.DATE_TIME_PATTERN);
	}

	/**
	 * 获取当前时间-字符串格式
	 * @param pattern
	 * @return
	 */
	public final static String now(final String pattern){
		return DateTime.now().toString(pattern);
	}


	/**
	 * 格式化时间格式
	 * @param date
	 * @param pattern
	 * @return
	 */
	public final static String format(final Date date,final String pattern){
		final DateTime dateTime = new DateTime(date);
		return dateTime.toString(pattern);
	}


	/**
	 * 格式化为固定格式 - DATE_PATTERN
	 * @param date
	 * @return
	 */
	public final static String format(final Date date){
		final DateTime dateTime = new DateTime(date);
		return dateTime.toString(DateUtil.DATE_PATTERN);
	}


	/**
	 *
	 * @param date
	 * @param pattern
	 * @return
	 */
	public final static Date parse(final String date,String pattern){
		if (pattern == null || pattern.isEmpty()) {
			pattern = DateUtil.DATE_PATTERN;
		}
		final SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		try {
			return sdf.parse(date);
		} catch (ParseException e) {
		}
		return null;
	}


	public final static Date plusHours(final Date date,int count){
		final DateTime dateTime = new DateTime(date);
		return dateTime.plusHours(count).toDate();
	}

	public final static Date minusHours(final Date date,int count){
		final DateTime dateTime = new DateTime(date);
		return dateTime.minusHours(count).toDate();
	}


	public final static Date plusDay(final Date date,int count){
		final DateTime dateTime = new DateTime(date);
		return dateTime.plusDays(count).toDate();
	}

	public final static Date minusDay(final Date date,int count){
		final DateTime dateTime = new DateTime(date);
		return dateTime.minusDays(count).toDate();
	}


	public final static Date plusMonth(final Date date,int count){
		final DateTime dateTime = new DateTime(date);
		return dateTime.plusMonths(count).toDate();
	}

	public final static Date minusMonth(final Date date,int count){
		final DateTime dateTime = new DateTime(date);
		return dateTime.minusMonths(count).toDate();
	}



	public final static Date plusYears(final Date date,int count){
		final DateTime dateTime = new DateTime(date);
		return dateTime.plusYears(count).toDate();
	}

	public final static Date minusYears(final Date date,int count){
		final DateTime dateTime = new DateTime(date);
		return dateTime.minusYears(count).toDate();
	}


}
