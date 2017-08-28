package linkedlist;

import com.operr.assignment.util.LinkedList;
import org.junit.Assert;
import org.junit.Test;


public class LinkedListAppendTests {

    @Test
    public void testAppend1() {

        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);
        int[] result = linkedList.toArray();

        Assert.assertArrayEquals(result, new int[]{1, 2, 3, 4, 5});
        Assert.assertEquals(linkedList.getSize(),5);
    }


    @Test
    public void testAppend2() {

        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        int[] result = linkedList.toArray();

        Assert.assertArrayEquals(result, new int[]{1});
        Assert.assertEquals(linkedList.getSize(),1);
    }

    @Test
    public void testAppend3() {

        LinkedList linkedList = new LinkedList();
        linkedList.append(5);
        linkedList.append(4);
        int[] result = linkedList.toArray();

        Assert.assertArrayEquals(result, new int[]{5, 4});
        Assert.assertEquals(linkedList.getSize(),2);
    }


    @Test
    public void testAppend4() {

        LinkedList linkedList = new LinkedList();
        int[] result = linkedList.toArray();

        Assert.assertArrayEquals(result, new int[]{});
        Assert.assertEquals(linkedList.getSize(),0);
    }
}
