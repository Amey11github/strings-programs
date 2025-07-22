class StringPalindrome
{
	public static void main(String[] args) {
		String str="madam";
		if(palindrome(str))
		{
			System.out.println(str+" is palindrome");
		}
		else{
			System.out.println(str+" is not palindrome");
		}
	}
	public static boolean palindrome(String str)
	{
		String str1=str;
		

		if(str.equals(reverse(str)))
			return true;

		return false;

	}
	public static String reverse(String str)
	{
		String str1="";
		for(int i=str.length()-1;i>=0;i--)
		{
			str1+=str.charAt(i);
		}
		return str1;
	}
}