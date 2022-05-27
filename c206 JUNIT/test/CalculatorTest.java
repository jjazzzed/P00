import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	@Before 
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
	
	
	
	
	@Test
		public void testAdd() {
			int a = 4321;
			int b = 1234;
				
			Calculator cal = new Calculator();
			int actual = cal.add(a, b); 
				 
			int expected = 5555;
			assertEquals (expected, actual);
			}
	
	@Test
	public final void testsubstract() {
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual= cal.substract(a, b); 
			 
		int expected = 3087;
		assertEquals (expected, actual);
		}
	
	

	@Test
	public final void testMultiply() {
		int a = 10;
		int b = 2;
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b); 
			 
		int expected = 20;
		assertEquals(expected, actual);
		}
		
	@Test
	public void testDivide() {
		int a = 10;
		int b = 2;
		Calculator cal = new Calculator();
		int actuallll = cal.divide(a, b);
			 
		int expectedddd = 5;
		assertEquals(expectedddd, actuallll);
		}
		
		
		
	}
	
	
	
	
	


