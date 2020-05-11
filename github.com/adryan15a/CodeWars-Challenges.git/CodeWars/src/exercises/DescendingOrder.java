package exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DescendingOrder {

	/*
	 * Your task is to make a function that can take any non-negative integer as a
	 * argument and return it with its digits in descending order. Essentially,
	 * rearrange the digits to create the highest possible number.
	 * 
	 * Examples: Input: 21445 Output: 54421
	 * 
	 * Input: 145263 Output: 654321
	 * 
	 * Input: 123456789 Output: 987654321
	 */

	public static int sortDesc(final int num) {
	
		//use of arrayList to hold data;
		List<String> numbers = new ArrayList<String>();
		
		//go throw the string and separate.
		for (int i = 0; i < String.valueOf(num).length(); i++) {
			
			numbers.add(i, String.valueOf(num).substring(i, i + 1));
		}

		//sort the array
		Collections.sort(numbers, Collections.reverseOrder());
		
		String numbersString = "";
		
		for(String cifra : numbers) {
			numbersString= numbersString.concat(cifra);
		}

		return Integer.parseInt(numbersString);
	}

}
