import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

class Solution{
	public static String addStrings(String a, String b){
		// Store a pointer for both strings 
		int i = a.length() - 1;
		int j = b.length() - 1;
		int carry = 0;
		int sum = 0;

		StringBuilder result = new StringBuilder();
		while (i >= 0 || j >= 0 || carry > 0){
			sum = carry;
			if (i >= 0){
				sum += a.charAt(i) - '0';
				i--;
			}

			if (j >= 0){
				sum += b.charAt(j) - '0';
				j--;
			}
			
			result.append(sum % 2);
			carry = sum / 2;
		}
		return result.reverse().toString();
	}

	public static void main(String[] args){
		// Test case 1
		String a = "11";
		String b = "1";
		String output = addStrings(a, b);
		System.out.println(output);

		// Test case 2
		String a1 = "1010";
		String a2 = "1011";
		String output2 = addStrings(a1, a2);
		System.out.println(output2);
	}
}
