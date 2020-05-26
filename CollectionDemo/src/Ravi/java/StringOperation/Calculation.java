package Ravi.java.StringOperation;

public class Calculation {
	
	private int upstair;
	private int downstrair;
	private int totalstair;
	
	
	
	public Calculation(int upstair, int downstrair, int totalstair) {
		
		this.upstair = upstair;
		this.downstrair = downstrair;
		this.totalstair = totalstair;
	}

	public  void Processor()
	{
		for(int i=0; i<= totalstair; i++)
		{
		int oneday= totalstair- upstair;
		int night= oneday+downstrair;
		
		if(night< totalstair) 
		{
			
		}
		}
		
		
		
	}	

	public static void main(String[] args) {
		
	}
}
