package exercises;

public class Isogram {

	/*
	 * An isogram is a word that has no repeating letters, consecutive or
	 * non-consecutive. Implement a function that determines whether a string that
	 * contains only letters is an isogram. Assume the empty string is an isogram.
	 * Ignore letter case.
	 * 
	 * isIsogram "Dermatoglyphics" == true isIsogram "aba" == false isIsogram
	 * "moOse" == false -- ignore letter case
	 */

	public static boolean isIsogram(String str) {

		boolean result = true;
		str = str.toLowerCase();
		char[] array = str.toCharArray();
		int l = array.length;

		if (l == 0) {
			return result = true;
		}
		
		for (int i = 0; i < l - 1; i++) {
			
			for (int j = i + 1; j < l; j++) {
				
				if(array[i] == array[j]) {
					result = false;
					break;
				}
			}
		}
		return result;
	}

}
