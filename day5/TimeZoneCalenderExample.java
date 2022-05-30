package Time;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.TimeZone;

public class TimeZoneCalenderExample {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		String name1 = cal.getTimeZone().getDisplayName();
		System.out.println("현재 타임존 : " + name1);
		LocalTime now1 = LocalTime.now();
		System.out.println(now1);
		
		TimeZone tz = TimeZone.getTimeZone("GMT");
		cal.setTimeZone(tz);
		String name2 = cal.getTimeZone().getDisplayName();
		System.out.println("GMT 타임존: " + name2);
		LocalTime now2 = LocalTime.now(ZoneId.of("GMT"));
		System.out.println(now2);
	}

}
