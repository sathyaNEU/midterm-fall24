import org.example.MyCircularQueue;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyCircularQueueTest {

    @Test
    public void testEmptyFront() {
        MyCircularQueue myCQ = new MyCircularQueue(3);
        assertEquals(myCQ.Front(), -1);
    }

    @Test
    public void testEmptyRear() {
        MyCircularQueue myCQ = new MyCircularQueue(3);
        assertEquals(myCQ.Rear(), -1);
    }

    @Test
    public void testIsEmpty() {
        MyCircularQueue myCQ = new MyCircularQueue(3);
        assertTrue(myCQ.isEmpty());
    }

    @Test
    public void testEnqueueTrue() {
        MyCircularQueue myCQ = new MyCircularQueue(3);
        assertTrue(myCQ.enQueue(1));
    }

    @Test
    public void testEnqueueFalse() {
        MyCircularQueue myCQ = new MyCircularQueue(3);
        assertTrue(myCQ.enQueue(1));
        assertTrue(myCQ.enQueue(1));
        assertTrue(myCQ.enQueue(1));
        assertFalse(myCQ.enQueue(1));
    }

    @Test
    public void testDequeueTrue() {
        MyCircularQueue myCQ = new MyCircularQueue(3);
        myCQ.enQueue(1);
        assertTrue(myCQ.deQueue());
    }

    @Test
    public void testDequeueFalse() {
        MyCircularQueue myCQ = new MyCircularQueue(3);
        assertFalse(myCQ.deQueue());
    }

    @Test
    public void testIsFull() {
        MyCircularQueue myCQ = new MyCircularQueue(3);
        myCQ.enQueue(1);
        myCQ.enQueue(2);
        myCQ.enQueue(3);
        assertTrue(myCQ.isFull());
    }

    @Test
    public void test1() {
        MyCircularQueue myCQ = null;
        String[] ops = new String[]{"MyCircularQueue", "enQueue", "enQueue", "enQueue", "enQueue", "Rear", "isFull", "deQueue", "enQueue", "Rear"};
        int[][] input = new int[][]{{3}, {1}, {2}, {3}, {4}, {}, {}, {}, {4}, {}};
        String[] expected = new String[]{"", "true", "true", "true", "false", "3", "true", "true", "true", "4"};

        for (int i = 0; i < ops.length; i++) {
            if (ops[i].equals("MyCircularQueue")) {
                myCQ = new MyCircularQueue(input[i][0]);
            } else if (ops[i].equals("enQueue")) {
                assertEquals(myCQ.enQueue(input[i][0]), Boolean.parseBoolean(expected[i]));
            } else if (ops[i].equals("deQueue")) {
                assertEquals(myCQ.deQueue(), Boolean.parseBoolean(expected[i]));
            } else if (ops[i].equals("Rear")) {
                assertEquals(myCQ.Rear(), Integer.parseInt(expected[i]));
            } else if (ops[i].equals("Front")) {
                assertEquals(myCQ.Front(), Integer.parseInt(expected[i]));
            } else if (ops[i].equals("isEmpty")) {
                assertEquals(myCQ.isEmpty(), Boolean.parseBoolean(expected[i]));
            } else if (ops[i].equals("isFull")) {
                assertEquals(myCQ.isFull(), Boolean.parseBoolean(expected[i]));
            }
        }
    }

    @Test
    public void test2() {
        MyCircularQueue myCQ = null;
        String[] ops = new String[]{"MyCircularQueue", "enQueue", "enQueue", "enQueue", "isFull"};
        int[][] input = new int[][]{{3}, {0}, {0}, {0}, {}};
        String[] expected = new String[]{"", "true", "true", "true", "true"};
        for (int i = 0; i < ops.length; i++) {
            if (ops[i].equals("MyCircularQueue")) {
                myCQ = new MyCircularQueue(input[i][0]);
            } else if (ops[i].equals("enQueue")) {
                assertEquals(myCQ.enQueue(input[i][0]), Boolean.parseBoolean(expected[i]));
            } else if (ops[i].equals("deQueue")) {
                assertEquals(myCQ.deQueue(), Boolean.parseBoolean(expected[i]));
            } else if (ops[i].equals("Rear")) {
                assertEquals(myCQ.Rear(), Integer.parseInt(expected[i]));
            } else if (ops[i].equals("Front")) {
                assertEquals(myCQ.Front(), Integer.parseInt(expected[i]));
            } else if (ops[i].equals("isEmpty")) {
                assertEquals(myCQ.isEmpty(), Boolean.parseBoolean(expected[i]));
            } else if (ops[i].equals("isFull")) {
                assertEquals(myCQ.isFull(), Boolean.parseBoolean(expected[i]));
            }
        }
    }

    @Test
    public void test3() {
        MyCircularQueue myCQ = null;
        String[] ops = new String[]{"MyCircularQueue","Rear","enQueue","enQueue","enQueue","Rear","isFull","deQueue","enQueue"};
        int[][] input = new int[][]{{3},{},{2},{3},{4},{},{},{},{4}};
        String[] expected = new String[]{"", "-1", "true", "true", "true", "4", "true", "true", "true"};
        for (int i = 0; i < ops.length; i++) {
            if (ops[i].equals("MyCircularQueue")) {
                myCQ = new MyCircularQueue(input[i][0]);
            } else if (ops[i].equals("enQueue")) {
                assertEquals(myCQ.enQueue(input[i][0]), Boolean.parseBoolean(expected[i]));
            } else if (ops[i].equals("deQueue")) {
                assertEquals(myCQ.deQueue(), Boolean.parseBoolean(expected[i]));
            } else if (ops[i].equals("Rear")) {
                assertEquals(myCQ.Rear(), Integer.parseInt(expected[i]));
            } else if (ops[i].equals("Front")) {
                assertEquals(myCQ.Front(), Integer.parseInt(expected[i]));
            } else if (ops[i].equals("isEmpty")) {
                assertEquals(myCQ.isEmpty(), Boolean.parseBoolean(expected[i]));
            } else if (ops[i].equals("isFull")) {
                assertEquals(myCQ.isFull(), Boolean.parseBoolean(expected[i]));
            }
        }
    }
}