class CountVowelConsonents
{
	public static void main(String[] args) {
		String str="Hello programming";
		int vow=0;
		int con=0;

		for(int i=0;i<str.length()-1;i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				vow++;
			}
			else{
				con++;
			}
		}

		System.out.println("vowel :"+vow);
		System.out.println("consonent :"+con);
	}
}