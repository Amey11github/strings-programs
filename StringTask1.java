// reverse the string

class StringTask1
{
	public static void main(String[] args) {
		String str="hello";
		reverse(str);
	}
	public static void reverse(String str)
	{
		String op="";

		for(int i=str.length()-1;i>=0;i--)
		{
			op+=str.charAt(i);
		}
		System.out.println(op);
	}
}