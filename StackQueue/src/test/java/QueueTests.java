import org.junit.Assert;
import org.junit.Test;

public class QueueTests extends Assert {

    @Test
    public void testAddPoll() {
        Queue<Integer> queue = new Queue<Integer>(3);

        assertEquals(true, queue.add(1));
        assertEquals(true, queue.add(2));
        assertEquals(true, queue.add(3));
        assertEquals(false, queue.add(4));

        assertEquals(1, queue.poll().intValue());
        assertEquals(2, queue.poll().intValue());
        assertEquals(3, queue.poll().intValue());

    }

}
