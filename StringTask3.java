//count consonent and vowels

class StringTask3
{
	public static void main(String[] args) {
		String str="hello java from world iodfnbcfegwb";

		countVowCons(str);
	}

	public static void countVowCons(String str)
	{
		int vcnt=0;
		int ccnt=0;

		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>97 || str.charAt(i)<112)
			{
				char ch=str.charAt(i);
				if(ch==' ')continue;
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				{
					vcnt++;
				}
				else
				{
					ccnt++;
				}
			}
		}

		System.out.println("Vowel :"+vcnt);
		System.out.println("Consonent :"+ccnt);
	}
}