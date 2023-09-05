package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxMinnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] input= {1,45,789,5,46,626,46};
/*max(input);
	   }
static void max(int[]input)

{  */
	 List <Integer> list=Arrays.asList(1,45,789,5,46,626,46); //1,45,789,5,46,626,46   direct values daldo error chale jayega
	
Integer max=list.stream().max(Comparator.comparing(e->Integer.valueOf(e))).get();
System.out.println(max);
}

//static void min(int []input)

// {
	List <Integer> list=Arrays.asList(1,45,789,5,46,626,46);
	int minimum=list.stream().min(Comparator.comparing(e->Integer.valueOf(e))).get();
// }
}
