package ProgramPractice;

public class parentclass implements interface1{

	int[] numbers= {9,3,5,7,0,8,6,1,4,2};
	int n=numbers.length;

	int temp;
		
	public static void main(String[] args)
	{
		//interface1 A=new parentclass();
	   parentclass parentclass = new parentclass();
		System.out.println("Ascending order:");

	   parentclass.ascending();
		System.out.println("Descending order:");
		//A.ascending();
	  // parentclass.descending();
	}


	@Override
	public void ascending() 
	{	
		int b;
		for(int i=0;i<numbers.length;i++)
		{
			for (int j=0;j<numbers.length;j++)
			{
				b = j + 1;
				
					if (b == numbers.length)
					{
						continue;

					}
					else if (numbers[j] < numbers[j+1])
					{
						continue;
					}
					else
					{
						temp = numbers[j];
						numbers[j] = numbers[j+1];
						numbers[j+1] = temp;
						
					}
				}
	     }
		for (int j=0;j<numbers.length;j++)
		{
		 System.out.println(numbers[j]);
		}

}


	@Override
	public  void descending()
	{
		   //System.out.println("Length of int array:" + n);

		int b;
		for(int i=numbers.length;i>0;i++)
		{
			for (int j=numbers.length-1;j>=0;j--)
			{
				
				
					if (j == 0)
					{
						continue;

					}
					else if (numbers[j] > numbers[j-1])
					{
						continue;
					}
					else
					{
						temp = numbers[j];
						numbers[j] = numbers[j-1];
						numbers[j-1] = temp;	
					}
				}
			}
		for (int j=numbers.length;j>0;j--)
		{	
			 System.out.println(numbers[j-1]);
			}
	}
}
