
package io.github.mharbol.leetcode;

/**
 * CircularDeque
 * Solution class for Leet Code 641
 */
public class CircularDeque {

    private final int k;
    private int[] arr;
    private int cap = 0;
    private int frontIdx = 0;


    /**
     * Creates a new CircularDeque with capacity {@code k}.
     */
    public CircularDeque(int k) {
        this.k = k;
        this.arr = new int[k];
    }

    /**
     * Inserts an item on the front of this deque if possible.
     * 
     * @param value the value to insert
     * @return true if the insertion was successful, otherwise false
     */
    public boolean insertFront(int value) {
        if (k == cap) {
            return false;
        }
        frontIdx = (frontIdx - 1 + k) % k;
        arr[frontIdx] = value;
        cap++;
        return true;
    }

    /**
     * Inserts an item on the end of this deque if possible.
     * 
     * @param value the value to insert
     * @return true if the insertion was successful, otherwise false
     */
    public boolean insertLast(int value) {
        if (k == cap) {
            return false;
        }
        arr[(frontIdx + cap) % k] = value;
        cap++;
        return true;
    }

    /**
     * "Deletes" the item at the front of this deque if possible.
     *
     * @return true of the deletion was successful, otherwise false.
     */
    public boolean deleteFront() {
        if (0 == cap) {
            return false;
        }
        cap--;
        frontIdx = (frontIdx + 1) % k;
        return true;
    }

    /**
     * "Deletes" the item at the rear of this deque if possible.
     *
     * @return true of the deletion was successful, otherwise false.
     */
    public boolean deleteLast() {
        if (0 == cap) {
            return false;
        }
        cap--;
        return true;
    }

    /**
     * Get the item at the front of this deque.
     *
     * @return the value at the front of this deque if available, otherwise -1
     */
    public int getFront() {
        return (0 == cap) ? -1 : arr[frontIdx];
    }

    /**
     * Get the item at the rear of this deque.
     *
     * @return the value at the rear of this deque if available, otherwise -1
     */
    public int getRear() {
        return (0 == cap) ? -1 : arr[(frontIdx + cap - 1) % k];
    }

    /**
     * Check if this deque is empty.
     *
     * @return true if there are no items in this deque, otherwise false
     */
    public boolean isEmpty() {
        return 0 == cap;
    }

    /**
     * Check if this deque is full
     *
     * @return true if this deque is filled, otherwise false
     */
    public boolean isFull() {
        return k == cap;
    }
}
