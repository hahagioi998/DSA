package MaxHeap;

public class Runner {

    public static void main(String[] args) {
        Heap heap = new Heap(9);
        heap.insert(22);
        heap.insert(19);
        heap.insert(18);
        heap.insert(15);
        heap.insert(3);
        heap.insert(14);
        heap.insert(4);
        heap.insert(12);
        System.out.println(heap.toString());
        heap.insert(20);
        System.out.println(heap.toString());

    }
}
