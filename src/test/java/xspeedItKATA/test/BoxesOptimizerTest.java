package xspeedItKATA.test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import xspeedItKATA.BoxesOptimizer;

public class BoxesOptimizerTest {

	@Test(expected=IllegalArgumentException.class)
	public void sould_thrown_exception_when_contains_big_element() throws Exception {
		BoxesOptimizer.optimizeBoxes(10, 1, 6, 3, 8, 40, 1, 6, 8, 9, 5, 2, 5, 7, 7, 3);		
	}
	@Test(expected=IllegalArgumentException.class)
	public void sould_thrown_exception_when_contains_negative_element() throws Exception {
		BoxesOptimizer.optimizeBoxes(10, 1, 6, 3, 8, 4, -4, 6, 8, 9, 5, 2, 5, 7, 7, 3);		
	}
	@Test
	public void test_optimize() throws Exception {
		assertEquals("[19, 64, 37, 82, 163, 8, 55, 7]", BoxesOptimizer.optimizeBoxes(10, 1, 6, 3, 8, 4, 1, 6, 8, 9, 5, 2, 5, 7, 7, 3).toString());
	}
}
