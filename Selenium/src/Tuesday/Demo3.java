package Tuesday;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3 extends BaseTest
{

		@Test
		public void TestA()
		{
			Reporter.log("@1", true);
		}
		@Test
		public void testb1(){
			Reporter.log("@t1",true);
		}
		@Test
		public void testb2(){
			Reporter.log("@t2",true);
		}

}
