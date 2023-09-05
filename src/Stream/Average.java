package Stream;

import java.util.Arrays;
import java.util.List;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> list=Arrays.asList(1,45,789,5,46,626,46);
		
	double avg=	list.stream().mapToInt(e->e).average().getAsDouble();	
	System.out.println(avg);
	}

}
