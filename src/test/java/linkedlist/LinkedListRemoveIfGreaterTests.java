package linkedlist;

import com.operr.assignment.util.LinkedList;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by chien on 8/28/17.
 */
public class LinkedListRemoveIfGreaterTests {

    @Test
    public void testRemoveIfGreater1() {

        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);

        linkedList.removeIfGreaterThan(4);
        int[] result = linkedList.toArray();
        Assert.assertArrayEquals(result, new int[]{1, 2, 3, 4});
        Assert.assertEquals(linkedList.getSize(),4);
    }

    @Test
    public void testRemoveIfGreater2() {

        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);
        linkedList.removeIfGreaterThan(1);
        int[] result = linkedList.toArray();
        Assert.assertArrayEquals(result, new int[]{1});
        Assert.assertEquals(linkedList.getSize(),1);
    }

    @Test
    public void testRemoveIfGreater3() {

        LinkedList linkedList = new LinkedList();


        linkedList.removeIfGreaterThan(4);
        int[] result = linkedList.toArray();
        Assert.assertArrayEquals(result, new int[]{});
        Assert.assertEquals(linkedList.getSize(),0);
    }

    @Test
    public void testRemoveIfGreater4() {

        LinkedList linkedList = new LinkedList();
        linkedList.append(1);


        linkedList.removeIfGreaterThan(4);
        int[] result = linkedList.toArray();
        Assert.assertArrayEquals(result, new int[]{1});
        Assert.assertEquals(linkedList.getSize(),1);
    }

    @Test
    public void testRemoveIfGreater5() {

        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);

        linkedList.removeIfGreaterThan(2);
        int[] result = linkedList.toArray();
        Assert.assertArrayEquals(result, new int[]{1, 2});
        Assert.assertEquals(linkedList.getSize(),2);
    }


    @Test
    public void testRemoveIfGreater6() {

        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(1);

        linkedList.removeIfGreaterThan(1);
        int[] result = linkedList.toArray();
        Assert.assertArrayEquals(result, new int[]{1, 1});
        Assert.assertEquals(linkedList.getSize(),2);
    }

    @Test
    public void testRemoveIfGreater7() {

        LinkedList linkedList = new LinkedList();
        linkedList.append(3);
        linkedList.append(1);
        linkedList.append(1);

        linkedList.removeIfGreaterThan(1);
        int[] result = linkedList.toArray();
        Assert.assertArrayEquals(result, new int[]{1, 1});
        Assert.assertEquals(linkedList.getSize(),2);
    }

    @Test
    public void testRemoveIfGreater8() {

        LinkedList linkedList = new LinkedList();
        linkedList.append(3);
        linkedList.append(1);
        linkedList.append(1);

        linkedList.removeIfGreaterThan(0);
        int[] result = linkedList.toArray();
        Assert.assertArrayEquals(result, new int[]{});
        Assert.assertEquals(linkedList.getSize(),0);
    }
}
