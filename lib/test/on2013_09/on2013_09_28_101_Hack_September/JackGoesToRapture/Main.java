package on2013_09.on2013_09_28_101_Hack_September.JackGoesToRapture;

import net.egork.chelper.tester.NewTester;

import org.junit.Assert;
import org.junit.Test;

public class Main {
	@Test
	public void test() throws Exception {
		if (!NewTester.test("lib/test/on2013_09/on2013_09_28_101_Hack_September/JackGoesToRapture/JackGoesToRapture.task"))
			Assert.fail();
	}
}