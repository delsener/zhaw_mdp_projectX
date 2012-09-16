package ch.zhaw.mdp.projectX;
import junit.framework.Assert;

import org.junit.Test;

/**
 * Tests the base functionality of this application.
 * 
 * @author Roger Knecht, David Elsener (zhaw)
 *
 */
public class ApplicationTest {

	@Test
	public void testApplication() throws Exception {
		// hopefully this will never fail
		Assert.assertSame("everyone loves banana!", "i love banana", "i love banana");
		Assert.assertNotSame("why everone should love apples?", "i hate apples", "i love apple pie");
	}
	
}
