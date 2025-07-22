class ReverseString
{
	public static void main(String[] args) {
		String str="hello programming";
		String rev=reverse(str);
		System.out.println(str);
		System.out.println(rev);
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