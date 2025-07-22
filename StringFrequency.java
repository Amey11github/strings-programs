class StringFrequency
{
	public static void main(String[] args) {
		String str="apple";

		boolean b[]=new boolean[str.length()];

		for(int i=0;i<=str.length();i++)
		{
			int cnt=0;
			for(int j=i+1;j<=str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j) || b[i]==false)
				{
                    cnt++;
                    b[i]=true;
				}
			}
			System.out.print(str.charAt(i)+" : "+cnt+" ");
		}
	}
}