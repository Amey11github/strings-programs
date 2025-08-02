class StringBufferEx
{
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		System.out.println("Before enter data :");
		System.out.println("Capacity :"+sb.capacity());
		System.out.println("Length :"+sb.length());

		sb.append("1234567890123455");

        System.out.println("------------------------");
        System.out.println("After enter data :");
		System.out.println("Capacity :"+sb.capacity());
		System.out.println("Length :"+sb.length());
		System.out.println("------------------------");
		sb.append("12");

		System.out.println("Capacity :"+sb.capacity());
		System.out.println("Length :"+sb.length());
		System.out.println("------------------------------");


		System.out.println("StringBuffer with empty constructor: ");
		StringBuffer sb1=new StringBuffer();
		System.out.println(sb1.capacity());
		System.out.println(sb1.length());
		System.out.println("------------------------------");

		System.out.println("StringBuffer with int capacity constructor: ");
		StringBuffer sb2=new StringBuffer(50);
		System.out.println(sb2.capacity());
		System.out.println(sb2.length());
		System.out.println("------------------------------");


		System.out.println("StringBuffer with string constructor: ");
		StringBuffer sb3=new StringBuffer("hello");
		System.out.println(sb3.capacity());
		System.out.println(sb3.length());
		System.out.println("------------------------------");
		

	}
}