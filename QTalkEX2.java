class QTalkEX2
{
	public static void main(String[] args) {
		String str="alphxxdida";
		int cnt=0;

		String rev=rverse(str);
		System.out.println("original :"+str);
		System.out.println("reversed :"+rev);
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)==rev.charAt(i))
				cnt++;
		}
		System.out.println("unchanged count :"+cnt);
	}

	public static String rverse(String str)
	{
		String rev1="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev1+=str.charAt(i);
		}

		return rev1;
	}
}