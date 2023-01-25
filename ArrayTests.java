import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test 
	public void testReverseInPlaceNew() {
    int[] input1 = {3, 2, 1};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{1, 2, 3}, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedNew() {
    int[] input1 = {1, 2, 3};
    assertArrayEquals(new int[]{3, 2, 1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = {1, 2, 3, 1}; //https://stackoverflow.com/questions/5939788/junit-assertequalsdouble-expected-double-actual-double-epsilon
    assertEquals(2.5, ArrayExamples.averageWithoutLowest(input1), 0.1);
  }

  @Test
  public void testAverageWithoutLowestHargen() {
    double[] input1 = {1, 2}; //https://stackoverflow.com/questions/5939788/junit-assertequalsdouble-expected-double-actual-double-epsilon
    assertEquals(2.0, ArrayExamples.averageWithoutLowest(input1), 0.1);
  }
}
