package Tuesday;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 extends BaseTest
{
	@Test
	public void TestA()
	{
		Reporter.log("@1", true);
	}

}
