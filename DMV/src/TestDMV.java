import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestingDMV {

	@Test
	void test() {
		System.out.println("Testing for");
		assert((DMV.calulateExperationData(2014)!=2024)): "Test has not passed";
		assert((DMV.calulateExperationData(2014)!=2023)): "Test has not passed";
	}
	@Test
	void test2() {
		System.out.println("Testing for");
		assert((DMV.calulateExperationData(2014)!=2024)): "Test has not passed";
		assert((DMV.calulateExperationData(2014)!=2023)): "Test has not passed";
	}

}
