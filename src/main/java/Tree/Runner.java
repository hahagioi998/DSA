package Tree;

public class Runner {

    public static void main(String[] args) {
        Tree intTree = new Tree();
        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);
        intTree.insert(10);

        intTree.traverseInOrder();
        System.out.println();
        System.out.println(intTree.get(27));
        System.out.println(intTree.get(22));
        System.out.println(intTree.get(50));
        System.out.println("MAX=" + intTree.max());
        System.out.println("MIN=" + intTree.min());

        intTree.traverseInOrder();
        intTree.delete(50);
        System.out.println();
        intTree.traverseInOrder();
        System.out.println();
        intTree.traversePreOrder();
        System.out.println();
        intTree.traversePostOrder();
    }
}
