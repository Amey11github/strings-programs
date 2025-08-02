class StringBufferRevWord2
{
	public static void main(String[] args) {
		String str="hello java world hie";
		String strArr[]=str.split(" ");

		StringBuffer sbOp=new StringBuffer();
		for(int i=0;i<strArr.length;i++)
		{
			StringBuffer sb=new StringBuffer(strArr[i]);
			StringBuffer str1=sb.reverse();
			sbOp.append(str1);
			sbOp.append(" ");
		}

		System.out.println(sbOp);

	}
}