
public class pronicnumber {

	public static void main(String[] args) 
	
	{
		int num =30;
		int ans =0;
		
		for(int i =0;i<num;i++)
		{
			if(i*(i+1)==num)
			{
				ans =1;
				break;
			}
		}
		
		if(ans ==1)
		{
			System.out.println("its is a pronic number");
		}
		else
		{
			System.out.println("its is a not pronic number");
		}

	}
	
	

}
