package git2;

import org.junit.Test;

import java.time.*;

public class JDK8APITest {
	
	@Test
	public void test2(){
		//Duration:用于计算两个“时间”间隔，以秒和纳秒为基准
		LocalTime localTime= LocalTime.now();
		LocalTime localTime1= LocalTime.of(15, 23, 32);
		//between():静态方法，返回Duration对象，表示两个时间的间隔
		Duration duration= Duration.between(localTime1, localTime);
		System.out.println(duration);
		
		System.out.println(duration.getSeconds());
		System.out.println(duration.getNano());
		
		LocalDateTime localDateTime= LocalDateTime.of(2016, 6, 12, 15, 23, 32);
		LocalDateTime localDateTime1= LocalDateTime.of(2017, 6, 12, 15, 23, 32);
		
		Duration duration1= Duration.between(localDateTime1, localDateTime);
		System.out.println(duration1.toDays());
	}
	
	@Test
	public void test(){
		//Period:用于计算两个“日期”间隔，以年、月、日衡量
		LocalDate localDate= LocalDate.now();
		LocalDate localDate1= LocalDate.of(2028, 3, 18);
		
		Period period= Period.between(localDate, localDate1);
		System.out.println(period);System.out.println(period.getYears());
		
		System.out.println(period.getMonths());
		System.out.println(period.getDays());
		
		Period period1= period.withYears(2);
		System.out.println(period1);
	}
}
