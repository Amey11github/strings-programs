import java.util.*;

class QTalkEx{
	public static void main(String[] args) {
		String str="Ni@te_sh$";
		char [] n=str.toCharArray();
		System.out.println(Arrays.toString(n));
		reverse(n);	

		System.out.println(new String(n));
	}

	public static void reverse(char []  str)
	{
		char []n1=new char[str.length];
		int indx=0;
		for(int i=str.length-1;i>=0;i--)
		{
            if(isAlphabet(str[i]))
            {
            	n1[indx++]=str[i];
            }
		}

		indx=0;
	    for(int i=0;i<str.length;i++)
		{
            if(isAlphabet(str[i]))
            {
            	str[i]=n1[indx++];
            }
		}

	}

	public static boolean isAlphabet(char ch)
	{
		return (ch>='A'&& ch<='Z')||(ch>='a'&& ch<='z');
	}
}