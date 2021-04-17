import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculateTest {

	@Test
	void testCalcCGPA() {
		Calculate c = new Calculate();
		assertEquals(7.36, c.calcCGPA( new int[] {32,32,32,16,24,10,20,8,10}));
	}
	
	@Test
	void TestTEcalcCGPA() {
		Calculate c = new Calculate();
		assertEquals(7.7, c.TEcalcCGPA( new int[] {21,24,15,15,32,40,20,10}));
	}
	
	@Test
	void TestBEcalcCGPA() {
		Calculate c = new Calculate();
		assertEquals(9.0, c.BEcalcCGPA( new int[] {36,27,27,27,27,18,18,18}));
	}
	
	@Test
	void TestFEcalcSGPA() {
		Calculate c = new Calculate();
		assertEquals(8.42, c.FEcalcSGPA( new int[] {45,40,18,36,40,32,10}, new int[] {28,40,14,40,32,36,10}));
	}
	
	@Test
	void TestSEcalcSGPA() {
		Calculate c = new Calculate();
		assertEquals(7.68, c.SEcalcSGPA( new int[] {32,32,32,16,24,10,20,8,10}, new int[] {42,32,32,20,24,10,20,20}));
	}
	
	@Test
	void TestTEcalcSGPA() {
		Calculate c = new Calculate();
		assertEquals(8.3, c.TEcalcSGPA( new int[] {21,24,15,15,32,40,20,10}, new int[] {32,36,36,27,24,10,10,20,10}));
	}

}
