package Tuesday;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 extends BaseTest 
{
	@Test
	public void testb1(){
		Reporter.log("@t1",true);
	}
	@Test
	public void testb2(){
		Reporter.log("@t2",true);
	}

}
