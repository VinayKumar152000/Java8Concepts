import java.util.*;
import java.util.stream.Collectors;

public class Demos {

	public static void main(String args[]) {

		// stream is sequence of objects
		// stream don't change original list,instead return a copy of modified list
		// streams can be collection or array
		List<Integer> number = Arrays.asList(9, 2, 8, 4);

		// map method of stream-> returns copy of array by performing the operations
		// we passed as lambda expression

		List<Integer> square = number.stream().map(x -> x * x).collect(Collectors.toList());
		System.out.println(square);

		// fiter method return result array based on predicate passed or fitering
		// criteria
//collect is used to return result we got after performing operation and the result
		// can be in any valid collection form
		List<Integer> evens = number.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());

		System.out.println(evens);

		// forEach -> iterate over the collection of values
		square.forEach(s -> System.out.println(s));

		// reduce -> used to reduce the elements of stream to single values,and
		// it takes binaryOperator as a paramter

		int even = number.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);
		// ans intially is 0 and i will have value of stream one by one
		System.out.println(even);

		// sorted used to sort stream
		List<Integer> sort = number.stream().sorted().collect(Collectors.toList());
		System.out.println(sort);

		// returns false if all elements not matches predicate -> allMatch
		// return true if stream is empty ,or all matches predicate and predicate is not
		// evaluated
		System.out.println(number.stream().allMatch(x -> x % 2 == 0));

		// return boolena if any element ofstream which matches the predicate
		// return false if stream is empty or if not match
		System.out.println(number.stream().anyMatch(x -> x % 2 == 0));
		
		//findAny -> return optional which contains any elment of stream,if stream
		//is empty optional is also empty
		System.out.println(number.stream().findAny().get());
		//
		//return first element of stream
		System.out.println(number.stream().findAny().get());

	}
}
