public class ArrayBinaryTreeTest {
    public static void main(String[] args) {
        ArrayBinaryTree<Integer> bt = new ArrayBinaryTree<>(20);

        bt.insert(1);
        bt.insert(2);
        bt.insert(3);
        bt.insert(4);
        bt.insert(5);

        System.out.println("\nLeft child of node 1 (index 0): " + bt.getLeftChild(0));
        System.out.println("Right child of node 1 (index 0): " + bt.getRightChild(0));

        System.out.print("Preorder: ");
        bt.preOrder(0);

        System.out.print("\nInorder: ");
        bt.inOrder(0);

        System.out.print("\nPostorder: ");
        bt.postOrder(0);
    }
}
