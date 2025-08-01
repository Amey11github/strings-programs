// Palindrome String

class StringTask2
{
	public static void main(String[] args) {
		String str="madam";

		if(isPalindrome(str))
		{
			System.out.println(str+" is palindrome");
		}
		else{
			System.out.println(str+" is not palindrome");
		}
	}

	public static boolean isPalindrome(String str)
	{
		int left=0,right=str.length()-1;

		if(!(str.charAt(left++)==str.charAt(right--)))
		{
			return false;
		}

		return true;
	}
}