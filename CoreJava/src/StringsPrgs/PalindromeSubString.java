package StringsPrgs;

public class PalindromeSubString {

	public static void main(String[] args) 
	{
		        String input = "ababa";
		        int palindromeCount = countPalindromeSubstrings(input);
		        System.out.println("Number of palindrome substrings: " + palindromeCount);
		    }

		    public static int countPalindromeSubstrings(String input) {
		        int count = 0;

		        for (int i = 0; i < input.length(); i++) {
		            
		            count += countPalindromesAroundCenter(input, i,i);
		            count += countPalindromesAroundCenter(input, i, i + 1);
		        }

		        return count;
		    }

		    private static int countPalindromesAroundCenter(String input, int left, int right) {
		        int count = 0;

		        while (left >= 0 && right < input.length() && input.charAt(left) == input.charAt(right)) {
		          
		            left--;
		            right++;
		            count++;
		        }

		        return count;
		    }
		}
