import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {

	@Test 
	public void test() {
    
        LinkedList list = new LinkedList();
        list.append(5);
        list.append(6);
        list.append(7);

        System.out.println(list.toString());
        //assertEquals(" 5 6 7", list.toString());
}
}