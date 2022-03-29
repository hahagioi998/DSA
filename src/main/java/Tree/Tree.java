package Tree;


public class Tree {
    private TreeNode root;

    public int max() {
        if (root == null) {
            return Integer.MAX_VALUE;
        } else {
            return root.max();
        }
    }

    public void delete(int data) {
        root = delete(root, data);
    }

    private TreeNode delete(TreeNode subtreeRoot, int data) {
        if (subtreeRoot == null) {
            return subtreeRoot;
        }
        if (data < subtreeRoot.getValue()) {
            subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(), data));
        } else if (data > subtreeRoot.getValue()) {
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), data));
        } else {
            //case 1 and 2 : node to delete has 1 or 0 children
            if (subtreeRoot.getLeftChild() == null) {
                return subtreeRoot.getRightChild();
            } else if (subtreeRoot.getRightChild() == null) {
                return subtreeRoot.getLeftChild();
            }

            //case 3: node to delete has two children
            //replace the value in the subtreeNode with smallest value from the right subtreee
            subtreeRoot.setValue(subtreeRoot.getRightChild().min());

            //delete the node that has smallest value in the rightSUbTree
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), subtreeRoot.getValue()));

        }
        return subtreeRoot;

    }

    public int min() {
        if (root == null) {
            return Integer.MIN_VALUE;
        } else {
            return root.min();
        }
    }

    public TreeNode get(int data) {
        if (root != null) {
            return root.get(data);
        } else {
            return null;
        }
    }

    public void insert(int data) {
        if (root == null) {
            root = new TreeNode(data);
        } else {
            root.insert(data);
        }
    }

    public void traverseInOrder() {
        if (root != null) {
            root.traverseInOrder();
        }
    }

}
