import org.junit.Assert;
import org.junit.Test;

public class StackTests extends Assert {
    @Test
    public void testPushPop() {
        Stack<Integer> stack = new Stack<Integer>(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.pop().intValue());
        assertEquals(2, stack.pop().intValue());
        assertEquals(1, stack.pop().intValue());
    }

    @Test
    public void testisEmpty()
    {
        Stack<Integer> stack = new Stack<Integer>(10);
        assertEquals(true, stack.isEmpty());
        stack.push(1);
        assertEquals(false, stack.isEmpty());
    }

    @Test
    public void testsearch()
    {
        Stack<Integer> stack = new Stack<Integer>(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(1, stack.search(3));


    }


}