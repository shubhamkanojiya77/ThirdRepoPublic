package Stream;

import java.util.Arrays;
import java.util.List;

public class sumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> list=Arrays.asList(1,45,789,5,46,626,46);
		
		int sumofarray = list.stream().reduce((a,b)->(a+b)).get();
		System.out.println(sumofarray);
	}

}
