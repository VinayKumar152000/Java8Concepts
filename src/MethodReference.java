import java.util.*;
import java.util.function.Consumer;

public class MethodReference {

	public static void main(String args[]) {
		ArrayList<Integer> arrL = new ArrayList<Integer>();
		arrL.add(1);
		arrL.add(2);
		arrL.add(3);
		arrL.add(4);

//		int arrL[]={2,35,2,6};

		// in order to print without lambda we need to create Consumerinterface obj

		Consumer<Integer> con = new Consumer<Integer>() {
			public void accept(Integer i) {
				System.out.println(i);

			}

		};

		arrL.forEach(con);
		// printing using lambda expression
//			arrL.forEach((games) -> {
//				System.out.println(games);
//			});

		// method refernce refering println

//		arrL.forEach(System.out::println);
	}
}
