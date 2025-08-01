class StringTask6
{
	public static void main(String[] args) {
		String str="java is fun";
		toUpperCase(str);
	}
	public static void toUpperCase(String str)
	{
		String str1="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch==' ')
			{
				str1+=' ';
			}
			else{
		     	str1+=(char)(ch-32);
			}
		}
		System.out.println(str1);
	}
}