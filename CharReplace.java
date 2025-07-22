class CharReplace
{
	public static void main(String[] args) {
		String str="presentation";
		char ch='e';
		String newStr="";

		for(int i=0;i<=str.length()-1;i++)
		{
			char ch1=str.charAt(i);
			if(ch1 == ch)
			{
               newStr+='*';
			}
			else{
				 newStr+=ch1;
			}
		}

		System.out.println("String :"+str);
		System.out.println("new String :"+newStr);

	}
}