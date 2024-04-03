package TestPractice;

import org.testng.annotations.Test;

public class TestDay1 
{
	@Test(priority=0)
		public void first()
		{
			System.out.println("First test case----");
		}
	
	@Test(priority=1)
	public void Second()
	{
		System.out.println("Second test case----");
	}
	
	
}
