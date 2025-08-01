class StringTask9
{
	public static void main(String[] args) {
		String str="swiss";
		nonRep(str);
	}

	public static void nonRep(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			int cnt=0;
			for(int j=i;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					cnt++;
				}

			}
			if(cnt==1)
			{
				System.out.println(str.charAt(i));
				break;
			}
			
		}
	}
}