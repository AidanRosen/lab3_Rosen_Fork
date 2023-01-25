import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ListTests {

    @Test 
	public void testMerge() {


        List<String> arrOne = new ArrayList<>();
        arrOne.add("a");
        arrOne.add("c");
        arrOne.add("e");
        List<String> arrTwo = new ArrayList<>();
        arrTwo.add("b");
        arrOne.add("d");
        arrOne.add("f");
        List<String> result = new ArrayList<>();
        result.add("a");
        result.add("b");
        result.add("c");
        result.add("d");
        result.add("e");
        result.add("f");

        List<String> testMerging = ListExamples.merge(arrOne, arrTwo);

        assertEquals(result, testMerging);
    }
}