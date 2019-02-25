package Tuesday;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA 
{
		@Test(invocationCount=2,priority=1)
		public void createUser()
		{
			Reporter.log("user created successfully",true);
		}
		
		@Test()
		public void deleteUser()
		{
			Reporter.log("user deleted successfully",true);
		}
		
		@Test(invocationCount=2,priority=0)
		public void editUser()
		{
			Reporter.log("user edited successfully",true);
		}

}
