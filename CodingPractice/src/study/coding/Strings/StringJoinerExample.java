package study.coding.Strings;
import java.util.StringJoiner;
public class StringJoinerExample {

	/*  o/p = A,B,C
		    =  P:Q
		    = A,B,C,P:Q      
	*/
	public static void main(String[] args) {

		/*StringJoiner is used to construct a sequence of characters 
		separated by a delimiter and optionally starting with a supplied 
		prefix and ending with a supplied suffix. */
		
		StringJoiner sj1 = new StringJoiner(",", "[", "]");  //when we want our output to be prefixed and suffixed by something then we do this
		sj1.add("A").add("B").add("C");
		System.out.println(sj1);
		
		StringJoiner sj2 = new StringJoiner(":");
		sj2.add("P").add("Q");
		System.out.println(sj2);
		
		//now we have to merge both the strings
		sj1 = sj1.merge(sj2);
		System.out.println("After merging "+sj1);
	}

}
