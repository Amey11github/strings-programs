// Remove space from string

class StringTask4
{
	public static void main(String[] args) {
		String str="java is fun";
		spaceRemover(str);
	}

	public static void spaceRemover(String str)
	{
		String str1="";

		for(char ch : str.toCharArray())
		{
			if(ch==' ')continue;
			str1+=ch;
		}
		System.out.println(str1);
	}
}