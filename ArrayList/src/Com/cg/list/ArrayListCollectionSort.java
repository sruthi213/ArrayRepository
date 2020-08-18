package Com.cg.list;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Iterator;
	import java.util.List;
	public class ArrayListCollectionSort {
	//sorting the collection elements
	        public static void main(String[] args) {
	            List<Integer> numbers = new ArrayList<>();
	            numbers.add(13);
	            numbers.add(7);
	            numbers.add(18);
	            numbers.add(5);
	            numbers.add(2);
	            numbers.add(0);
	            System.out.println("Before : " + numbers);
	            // Sorting an ArrayList using Collections.sort() method
	            Collections.sort(numbers);
	            Iterator itr = numbers.iterator();
	            while (itr.hasNext())
	 	        {
	                 Integer result = (Integer) itr.next();
	                 
	                 System.out.println(result);
	            }
	            System.out.println("After : " + numbers);
	            System.out.println("@@@@@@");
	        }
	    }










