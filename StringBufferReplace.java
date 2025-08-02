//Q 1. WAJP to replace all vowels with their positions in the string.

class StringBufferReplace
{
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("hello java from world");

		for(int i=0;i<sb.length();i++)
		{
			char ch=sb.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				sb.replace(i,i+1,i+"");
		}
		System.out.println(sb);
	}
}