class StringBufferPalindrome
{
	public static void main(String[] args) {
		String str ="madam";
		StringBuffer sb=new StringBuffer(str);
		String rev=sb.reverse().toString();

		if(str.equals(rev))
			System.out.println("is palindrome");
		else
			System.out.println("is not palindrome");
	}
}