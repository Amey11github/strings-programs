class StringTask8
{
	public static void main(String[] args) {
		String str="banana";
		char ch1='a';
		char ch2='o';

		replace(str,ch1,ch2);
	}

	public static void replace(String str,char ch1,char ch2)
	{
		String str1="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch1)
			{
				str1+=ch2;
			}
			else{
				str1+=str.charAt(i);
			}

		}

		System.out.println(str1);
	}
}