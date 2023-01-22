package day12;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class FlatList {

	public static void main(String[] args) {
		
		List<Integer> vide = Arrays.asList();
		// Creating a list of Prime Numbers
        List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11,13);
          
        // Creating a list of Odd Numbers
        List<Integer> OddNumbers = Arrays.asList(1, 3, 5);
          
        // Creating a list of Even Numbers
        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);
  
        List<List<Integer>> listOfListofInts =
                Arrays.asList(PrimeNumbers, OddNumbers,vide, EvenNumbers);
  
        System.out.println("The Structure before flattening is : " +
                                                  listOfListofInts);
          
        // Using flatMap for transformating and flattening.
        List<Integer> listofInts  = listOfListofInts.stream()
                                    .flatMap(list -> list.stream())
                                    .collect(Collectors.toList());
  
        System.out.println("The Structure after flattening is : " +
                                                         listofInts);
        /*
        Stream.generate(() -> "Olaf Lazisson")
        .filter(n -> n.length() == 4).peek(System.out::println).limit(2).sorted().forEach(System.out::println);
*/
        
        Stream<Integer> numbers = Stream.of(10,20,30);
        numbers.limit(4).forEach(System.out::println);

	}

}
