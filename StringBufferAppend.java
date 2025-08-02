class StringBufferAppend
{
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hello");

		sb.append("hello");
		System.out.println(sb);

		sb.append(true);
		System.out.println(sb);

		sb.append(1.1);
		System.out.println(sb);

		sb.append(1.23f);
		System.out.println(sb);

		sb.append(123344l);
		System.out.println(sb);

		sb.append('z');
		System.out.println(sb);

		char ch[]={'a','b','c'};
		sb.append(ch);
		System.out.println(sb);

		int [] arr={1,2,3,4};
		sb.append(arr);
		System.out.println(sb);


	}
}