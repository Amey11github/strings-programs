class StringTask7
{
	public static void main(String[] args) {
		String str1="silent";
		String str2="listenr";

		if(isAnagram(str1,str2))
		{
			System.out.println("is anagram");
		}
		else{
			System.out.println("is not anagram");
		}
	}

	public static boolean isAnagram(String str1,String str2)
	{
		if(str1.length()!= str2.length())return false;
		
		char [] arr1=str1.toCharArray();
		char [] arr2=str2.toCharArray();

		bubbleSort(arr1);
		bubbleSort(arr2);

		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]!=arr2[i])return false;


		}
		return true;
	}

	public static char[] bubbleSort(char [] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					char temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}

		return arr;
	}
}