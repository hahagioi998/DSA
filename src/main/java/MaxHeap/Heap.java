package MaxHeap;

import java.util.Arrays;

public class Heap {

    private int[] heap;
    private int size;

    @Override
    public String toString() {
        return "Heap{" +
                "heap=" + Arrays.toString(heap) +
                ", size=" + size +
                '}';
    }

    public Heap(int capacity) {
        heap = new int[capacity];
    }

    public boolean isFull() {
        return heap.length == size;
    }

    public int getParent(int index) {
        return (index - 1) / 2;
    }

    public void insert(int value) {
        if (isFull()) {
            throw new IndexOutOfBoundsException("Heap is Full");
        }
        heap[size] = value;
        fixHeapAbove(size);
        size++;
    }

    private void fixHeapAbove(int index) {
        int newValue = heap[index];
        while (index > 0 && newValue > heap[getParent(index)]) {
            heap[index] = heap[getParent(index)];
            index = getParent(index);
        }
        heap[index] = newValue;
    }

}
