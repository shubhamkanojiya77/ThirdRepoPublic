package Stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Ascending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> list=Arrays.asList(1,45,789,5,46,626,46);
		
		List<Integer> sort =list.stream().sorted().collect(Collectors.toList());
		
		System.out.println(sort);
		
		//*************************
		
	List<Integer> revsorted=	list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
	
	System.out.println(revsorted);
	}

}
