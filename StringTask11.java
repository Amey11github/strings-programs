class StringTask11
{
	public static void main(String[] args) {
		String str="hello from world programming java";
		String [] arr=str.split(" ");
		int max=Integer.MIN_VALUE;
		String strOp="";
		for(int i=0;i<arr.length;i++)
		{
            if(arr[i].length()>max)
            {
            	max=arr[i].length();
            	strOp=arr[i];
            }
		}
		System.out.println("Max length String : "+strOp+" : length :"+max);
	}
}