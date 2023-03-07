package edu.uoc.ds.adt;


import edu.uoc.ds.adt.sequential.Stack;
import edu.uoc.ds.adt.sequential.StackArrayImpl;

public class PR0Stack {

    // Capacitat màxima de la seqüència.
    public final int CAPACITY = 10;

    private Stack<Integer> stack;

    public PR0Stack() {
        newStack();
    }

    public void newStack() {
        stack = new StackArrayImpl<Integer>(CAPACITY);
    }

    public void fillStack() {
        for (int i = 2; i <= 29; i++) {     // i number to check
            int j = 2;                      // j divisor
            while (i % j != 0) {
                j++;
            }
            if (j == i) {
                //System.out.print(i+" ");
                stack.push(i);
            }
        }
    }

    public String clearAllStack() {
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty())
            sb.append(stack.pop()).append(" ");
        return sb.toString();
    }

    public Stack<Integer> getStack() {
        return this.stack;
    }
}
