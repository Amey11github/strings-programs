class StrringBuilderEx1
{
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("hello");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append("java");
		System.out.println(sb);

		sb.deleteCharAt(6);
        System.out.println(sb);

        sb.insert(3,"world");
        System.out.println(sb);

        sb.delete(2,4);
        System.out.println(sb);

        sb.ensureCapacity(50);
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.trimToSize();
        System.out.println(sb.length());
        System.out.println(sb.capacity());
	}
}