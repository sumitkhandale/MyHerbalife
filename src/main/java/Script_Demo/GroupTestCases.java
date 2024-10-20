package Script_Demo;

import org.testng.annotations.Test;

public class GroupTestCases {
	@Test(groups = { "Sanity" })
	public void TestCase01() {
		System.out.println("Test case 1");
	}

	@Test(groups = { "Smoke" })
	public void TestCase02() {
		System.out.println("Test case 2");

	}

	@Test(groups = { "Retesting" })
	public void TestCase03() {
		System.out.println("Test case 3");

	}

	@Test(groups = { "Sanity", "Smoke" })
	public void TestCase04() {
		System.out.println("Test case 4");

	}

	@Test(groups = { "Sanity", "Smoke", "Retesting" })
	public void TestCase05() {
		System.out.println("Test case 5");

	}

	@Test(groups = { "Smoke", "Retesting" })
	public void TestCase06() {
		System.out.println("Test case 6");

	}

	@Test(groups = { "Sanity", "Retesting" })
	public void TestCase07() {
		System.out.println("Test case 7");

	}
}
