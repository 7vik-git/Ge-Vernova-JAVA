import java.util.List;
import java.util.Arrays;
import java.util.stream.*;
public class LongestString{
	public static void main(String[] args){
		List<String> strings = Arrays.asList("Lenovo","Samsung","Apple","Sony");
		List<String> filteredList = strings.stream().sorted((a,b)->(b.length()-a.length())).collect(Collectors.toList());
	    System.out.print(filteredList);
	}
}