public class BinaryNode {
    protected int data;
    protected BinaryNode left;
    protected BinaryNode right;

    public BinaryNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        return "BinaryNode{" +
                "data=" + data +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
