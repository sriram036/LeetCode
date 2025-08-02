import java.util.Scanner;
public class InvertBinaryTree{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        TreeNode tree = new TreeNode();
        tree.populate(s);
        tree.display();
        tree.root = invertTree(tree.root);
        tree.display();
    }
    public static TreeNode invertTree(TreeNode root) {
        swap(root);
        return root;
    }
    public static TreeNode swap(TreeNode node){
        if(node == null){
            return null;
        }
        TreeNode left = swap(node.left);
        TreeNode right = swap(node.right);
        node.left = right;
        node.right = left;
        return node;
    }

}