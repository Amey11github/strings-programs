class StringTask10
{
	public static void main(String[] args) {
		String str="programming";
		removeDup(str);
	}
	public static void removeDup(String str)
	{
		String str1="";
		boolean [] track=new boolean[str.length()];

		for(int i=0;i<str.length();i++)
		{
			int cnt=0;
			for(int j=i;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j) && !track[j])
				{
					cnt++;
					track[j]=true;
				}
				
			}
			if(cnt>=1)
				{
					str1+=str.charAt(i);
				}
		}
		System.out.println(str1);
	}
}