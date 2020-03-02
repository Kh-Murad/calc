package calc;

import org.junit.Assert;
import org.junit.Test;

public class test {
	
	@Test
	public void testSum_BothNumbersArePositive_ShouldReturnPositiveNumber() {
		
		int a = 10; 
		int b = 20;
		
		add calc= new add();
		
		
		int result = calc.sum(a, b); 
		
		 
		Assert.assertTrue(result > 0);
		
	}
}
