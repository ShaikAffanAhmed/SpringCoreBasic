package practice;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class java8String {
	
	public static void main(String[] args) {
		
		String s="i am santhosh i am santhosh i am working in eidiko";
		
		Map<String, Long> map= Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream().filter(x->x.getValue()>1).collect(Collectors.toMap(x->x.getKey(), x->x.getValue()));
		System.out.println(map);
	}
}

