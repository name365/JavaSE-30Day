package github;

import org.junit.Test;

import java.time.*;
import java.util.Set;

/**
 * jdk 8中日期时间API的测试
 *
 * @author subei
 * @create 2020-05-10 17:19
 */
public class DatetimeTest2 {
	
	@Test
	public void test1(){
		//ZoneId:类中包含了所有的时区信息
		// ZoneId的getAvailableZoneIds():获取所有的ZoneId
		Set<String> zoneIds= ZoneId.getAvailableZoneIds();
		for(String s: zoneIds) {
			System.out.println(s);
		}
		// ZoneId的of():获取指定时区的时间
		LocalDateTime localDateTime= LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
		System.out.println(localDateTime);
		
		//ZonedDateTime:带时区的日期时间
		// ZonedDateTime的now():获取本时区的ZonedDateTime对象
		ZonedDateTime zonedDateTime= ZonedDateTime.now();
		System.out.println(zonedDateTime);
		// ZonedDateTime的now(ZoneId id):获取指定时区的ZonedDateTime对象
		ZonedDateTime zonedDateTime1= ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
		System.out.println(zonedDateTime1);
	}
}