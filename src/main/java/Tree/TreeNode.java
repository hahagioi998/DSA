package Tree;

public class TreeNode {
    private int value;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int value) {
        this.value = value;
    }

    public int min() {
        if (leftChild == null) {
            return value;
        } else {
            return leftChild.min();
        }
    }

    public int max() {
        if (rightChild == null) {
            return value;
        } else {
            return rightChild.max();
        }
    }

    public TreeNode get(int data) {
        if (data == value) {
            return this;
        }
        if (data < value) {
            if (leftChild != null) {
                return leftChild.get(data);
            }
        }
        if (data > value) {
            if (rightChild != null) {
                return rightChild.get(data);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "value=" + value +
                '}';
    }

    public void insert(int data) {
        if (value == data) {
            return;
        }
        if (data < value) {
            if (this.leftChild == null) {
                this.leftChild = new TreeNode(data);
            } else {
                this.leftChild.insert(data);
            }
        }
        if (data > value) {
            if (this.rightChild == null) {
                this.rightChild = new TreeNode(data);
            } else {
                this.rightChild.insert(data);
            }
        }
    }

    //root first then left node then right node
    public void traversePreOrder() {
        System.out.print(value + ",");
        if (leftChild != null) {
            leftChild.traversePreOrder();
        }
        if (rightChild != null) {
            rightChild.traversePreOrder();
        }
    }

    //left node first then right then root
    public void traversePostOrder() {
        if (leftChild != null) {
            leftChild.traversePostOrder();
        }
        if (rightChild != null) {
            rightChild.traversePostOrder();
        }
        System.out.print(value + ",");
    }

    //left node first then root then right node
    public void traverseInOrder() {
        if (leftChild != null) {
            leftChild.traverseInOrder();
        }
        System.out.print(value + " , ");
        if (rightChild != null) {
            rightChild.traverseInOrder();
        }
    }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
}
