import java.util.*;

interface Parser {
	String parser(String str);
}

class StringParser {

	public static String convert(String s) {

		if (s.length() <= 3) {
			s= s.toUpperCase();
		}
		return s;

	}

}

class MyPrinter {

	public void print(String str, Parser p) {
		str= p.parser(str);
		System.out.println(str);
	}
}

//suppose we need to have parsing logic to parse a string,we can pass that logic as
//argument
public class Lambda {

	public static void main(String args[]) {

		String str = "VinKumar";
		MyPrinter mp = new MyPrinter();
//		mp.print(str, new Parser() {
//			public String parser(String str) {
//				return StringParser.convert(str);
//			}
//
//		});
		
		
		//using lambda expression
//		mp.print(str, (s) -> {
////			     str= "vinakumar";not possible
//				return StringParser.convert(s);
//		});
//		
		//using method reference
		
		mp.print(str, 
		 StringParser :: convert
);

	}
}
