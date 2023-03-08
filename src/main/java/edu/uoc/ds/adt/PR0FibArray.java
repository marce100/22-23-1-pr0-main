package edu.uoc.ds.adt;

public class PR0FibArray {

    public final int CAPACITY = 20;

    private int[] fibArray;

    public PR0FibArray() {
        newFibArray();
    }

    public void newFibArray() {
        fibArray = new int[CAPACITY];
        fillFibArray();
    }

    /**
     * Fill the array with the Fibonacci sequence, do not use the
     * resursive method on page 57 because it is too slow
     */
    public void fillFibArray() {
        int a = 0, b = 1;   // Current, next
        fibArray[0] = a;
        fibArray[1] = b;
        for (int i = 2; i < 20; i++)
            fibArray[i] = (a = (b = a + b) - a) * 0 + b;
    }

    /**
     * Sequential search
     */
    public int getIndexOf(int n){
        for (int i = 0; i < CAPACITY; i++)
            if (n==this.fibArray[i])
                return i;
        return -1;
    }

    /**
     * Binary search
     */
    public int binarySearch(int key){
        int lo = 0;
        int hi = this.fibArray.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < this.fibArray[mid])
                hi = mid - 1;
            else if (key > this.fibArray[mid])
                lo = mid + 1;
            else
                return mid;
        }
        return -1;
    }

    public int[] getArray() {
        return this.fibArray;
    }
}
