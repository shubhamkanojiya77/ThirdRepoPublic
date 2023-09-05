package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1,45,789,5,46,626,46);
	List <Integer>even=list.stream().filter(e->e%2==0).collect(Collectors.toList());
	System.out.println(even);
	
	
	//*****************************
	List <Integer>odd=list.stream().filter(e->e%2!=0).collect(Collectors.toList());
	System.out.println(odd
	);
	
	}

}
