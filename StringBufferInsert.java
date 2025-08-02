import java.util.*;
class StringBufferInsert
{
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("java");

		sb.insert(0,"hello");//1
		System.out.println(sb);

		sb.insert(0,1.0);//2
		System.out.println(sb);

		sb.insert(2,63637l);//3
		System.out.println(sb);

		sb.insert(3,'a');//4
		System.out.println(sb);

		sb.insert(8,true);//5
		System.out.println(sb);

		char [] ch={'a','b','c'};
		sb.insert(4,ch);//6
		System.out.println(sb);

		sb.insert(9,ch,1,2);//7
		System.out.println(sb);

		sb.insert(0,1.0f);//8
		System.out.println(sb);

		sb.insert(3,1234567);//9
		System.out.println(sb);

		StringBuilder sb1=new StringBuilder("StringBuilder");
		sb.insert(3,sb1);//10
		System.out.println(sb);

		sb.insert(3,sb1,2,5);//11
		System.out.println(sb);

		Stack <Integer> stack=new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		sb.insert(5,stack);//12
		System.out.println(sb);

		int [] arr={10,20,30,40};
		sb.insert(9,arr);//13
		System.out.println(sb);

	}
}