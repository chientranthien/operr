package linkedlist;

import com.operr.assignment.util.LinkedList;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by chien on 8/28/17.
 */
public class LinkedListRemoveTests {
    @Test
    public void testRemove1() {

        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);

        linkedList.remove();
        int[] result = linkedList.toArray();
        Assert.assertArrayEquals(result, new int[]{1, 2, 3, 4});
        Assert.assertEquals(linkedList.getSize(),4);
    }

    @Test
    public void testRemove2() {

        LinkedList linkedList = new LinkedList();

        linkedList.remove();
        int[] result = linkedList.toArray();
        Assert.assertArrayEquals(result, new int[]{});
        Assert.assertEquals(linkedList.getSize(),0);
    }

    @Test
    public void testRemove3() {

        LinkedList linkedList = new LinkedList();
        linkedList.append(1);

        linkedList.remove();
        int[] result = linkedList.toArray();
        Assert.assertArrayEquals(result, new int[]{});
        Assert.assertEquals(linkedList.getSize(),0);
    }
}
