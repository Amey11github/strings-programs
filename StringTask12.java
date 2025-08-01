class StringTask12
{
	public static void main(String[] args) {
		String str="java is fun";

		rev(str);
	}

	public static void rev(String str)
	{
		String [] str1=str.split(" ");
		String strOp="";
		for(int i=0;i<str1.length;i++)
		{
			strOp+=reverse(str1[i])+" ";
		}
		System.out.println(strOp.trim());
	}

	public static String reverse(String str)
	{
		String str1="";
		for(int i=str.length()-1;i>=0;i--)
		{
			str1+=str.charAt(i);
		}
		return str1;
	}
}