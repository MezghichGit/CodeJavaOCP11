package chapitre5;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodDurationInstant {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.of(2000, 4, 10);
		/*
		 * Period period = Period.of(4, 1, 10); ld = ld.plus(period);
		 * System.out.println(ld); Period saison = Period.ofMonths(3); ld =
		 * ld.plus(saison); System.out.println(ld);
		 */
		System.out.println(ld);
		// ld = ld.plusDays(2).plusMonths(3).plusYears(3);
		Period period = Period.ofDays(2).ofMonths(3).ofYears(2);
	
		System.out.println(ld.plus(period));
		/*
		 * Duration daily = Duration.ofDays(1); // PT24H Duration hourly =
		 * Duration.ofHours(1); // PT1H System.out.println(daily);
		 * System.out.println(hourly);
		 */
		/*
		 * Duration daily = Duration.of(1, ChronoUnit.HALF_DAYS); Duration hourly =
		 * Duration.of(1, ChronoUnit.HOURS); System.out.println(daily);
		 * System.out.println(hourly); LocalDate d1 = LocalDate.of(2023, 1, 14);
		 * LocalDate d2 = LocalDate.of(2023, 1, 15);
		 * System.out.println(ChronoUnit.DAYS.between(d1, d2));
		 */

		Instant now = Instant.now();
		
		for (int i = 0; i < 100; i++) {
			System.out.println("i=" + i);
		}
		
		Instant later = Instant.now();
		
		Duration duration = Duration.between(now, later);
		
		System.out.println(duration);
		System.out.println(duration.toMillis());
		long epochSeconds = 157_680_000;
		Instant instant = Instant.ofEpochSecond(epochSeconds); // % 1970
		System.out.println(instant);
		Instant nextDay = instant.plus(1, ChronoUnit.DAYS);
		System.out.println(nextDay);

	}

}
