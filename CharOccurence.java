class CharOccurence
{
	public static void main(String[] args) {
		String str="presentation";
		char ch='e';
		int cnt=0;

		for(int i=0;i<str.length()-1;i++)
		{
			char ch1=str.charAt(i);
			if(ch1 == ch)
			{
                cnt++;
			}
		}

		System.out.println("String :"+str);
		System.out.println("finding char :"+ch);
		System.out.println("count :"+cnt);
	}
}