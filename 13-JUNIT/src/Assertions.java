import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class Assertions {
	
	@Rule
	public ErrorCollector errCol=new ErrorCollector();

	@Test
	public void testApp() {
//		System.out.println("A");
//		Assert.assertEquals("Hello", "Hello");
//		Assert.assertTrue(30<2);
//		

		System.out.println("A");

		try {
			Assert.assertEquals("Hello", "Hello123");

		} catch (Throwable t) {
			errCol.addError(t);
			System.out.println("Error");
		}
		System.out.println("B");
		
		try {
			Assert.assertTrue("Link not Present",false);
		}catch(Throwable t) {
			errCol.addError(t);
			System.out.println(t);
		}
	}
}
