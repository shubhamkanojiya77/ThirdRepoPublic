package Stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FrequencyOfElementmorethanone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*	}
static void frequency(int [] input)
{  */
	List<Integer> numberlist = Arrays.asList(1,45,789,5,46,626,46);

Set frequency=numberlist.stream().filter(e->Collections.frequency(numberlist,e)>1).collect(Collectors.toSet());

System.out.println(frequency);

//****************************************
Set<Integer> duplicate=new HashSet<Integer> ();

Set dup=duplicate.stream().filter(e->!duplicate.add(e)).collect(Collectors.toSet());
System.out.println(dup);
}
}
