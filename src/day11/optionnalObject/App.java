package day11.optionnalObject;

import java.util.Optional;

public class App {

	public static Optional<Double> average(int... scores) {
		if (scores.length == 0)
			return Optional.empty();
		int sum = 0;
		for (int score : scores)
			sum += score;
		return Optional.of((double) sum / scores.length);
	}

	public static void main(String[] args) {
		// System.out.println(average(90, 100)); // Optional[95.0]
		// System.out.println(average()); // Optional.empty

		// Optional<Double> avg1= average(90, 100);
		// double v1 = avg1.get(); // si existe
		// System.out.println(v1);

		Optional<Double> avg2 = average();
		
		/*
		 * if (avg2.isPresent()) { double v2 = avg2.get();
		 * System.out.println("Element Moy : "+v2); } else
		 * System.out.println("Element vide");
		 */
		// avg2.ifPresent(System.out::println);
		// double x = avg2.orElse(-1.5);
		// System.out.println(x);

		// Optional o = Optional.ofNullable(null);
		// Optional o = Optional.ofNullable("OCP");
		// System.out.println(o);

		try {
			Optional<Double> opt = average();
			System.out.println(opt.orElseThrow(() -> new IllegalStateException("Pas de valeur")));
		} catch (IllegalStateException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
