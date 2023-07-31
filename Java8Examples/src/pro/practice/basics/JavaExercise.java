package pro.practice.basics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaExercise {
public static void main(String[] args) {
	
	List<Integer>list=Arrays.asList(5,63,42,8,32,98,68,42,172);
	
	//Even numbers
	List<Integer> even = list.stream().filter(a->a%2==0).collect(Collectors.toList());
	System.out.println(even);
	
	//Odd numbers
	List<Integer> odd = list.stream().filter(a->a%2!=0).collect(Collectors.toList());
	System.out.println(odd);
	
//Sorting	
 List<Integer> collect = list.stream().sorted().collect(Collectors.toList());
 System.out.println(collect);
 
 //Sorting using Comparator
 List<Integer> collect2 = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
 System.out.println(collect2);
 
 //Reverse Sorting
 List<Integer> collect3 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
 System.out.println(collect3);
 
 //startsWith
 List<Integer> collect4 = list.stream().filter(a->String.valueOf(a).startsWith("6")).collect(Collectors.toList());
 System.out.println(collect4);
 
 //endsWith
 List<Integer> collect5 = list.stream().filter(a->String.valueOf(a).endsWith("2")).collect(Collectors.toList());
 System.out.println(collect5);
 
 //remove duplicate
 Set<Integer>hs=new HashSet<>();
 Set<Integer> collect6 = list.stream().filter(a->!hs.add(a)).collect(Collectors.toSet());
 System.out.println(collect6);
 
 //Unique Number
 List<Integer> collect7 = list.stream().distinct().collect(Collectors.toList());
 System.out.println(collect7);
 
 //Min
 OptionalInt min = list.stream().mapToInt(Integer::intValue).min();
 System.out.println(min);
 
 //Max
 OptionalInt max = list.stream().mapToInt(Integer::intValue).max();
 System.out.println(max);
 
 //Sum
 int sum = list.stream().mapToInt(Integer::intValue).sum();
 System.out.println(sum);
 
 //Average
 OptionalDouble average = list.stream().mapToDouble(Integer::intValue).average();
 System.out.println(average);
 
 //character count
 String name="Marish Mokal";
 Map<String, Long> collect8 = Arrays.asList(name.split("")).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
 System.out.println(collect8);
 
 //word count
 Map<String, Long> collect9 = Arrays.asList(name.split(" ")).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
 System.out.println(collect9);
 
 //Count
 long count = list.stream().count();
 System.out.println(count);
 
 
 //Increase By 1
 List<Integer> collect10 = list.stream().map(a->a+1).collect(Collectors.toList());
 System.out.println(collect10);
 
 
 
 
 
	
	
}
}
