class RemoveSpaceString
{
	public static void main(String[] args) {
		String str="I love java programming";
		String str1="";

		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch !=' ')
			{
				str1+=str.charAt(i);
			}
			
		}

		System.out.println("Removed space :"+str1);
	}
}