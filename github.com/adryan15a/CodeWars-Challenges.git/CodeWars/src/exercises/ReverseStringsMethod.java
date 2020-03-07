package exercises;

public class ReverseStringsMethod {
	
	//Complete the solution so that it reverses the string value passed into it.

    //Kata.solution("world") //returns "dlrow"
	
	public static String solution(String str) {
		StringBuilder builder = new StringBuilder();
		
		// append a string into StringBuilder
		builder.append(str);
		
		//reverse StringBuilder
		builder = builder.reverse();
		
		//toString!
		String result = builder.toString();
		return result;
	}
	
	
	public static void main(String[]args) {
		
		String test = "I love to code.";
		System.out.println(solution(test));
	}
}
