import java.util.Scanner;
public class FlattenBinaryTreeToLinkedList{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        TreeNode tree = new TreeNode();
        tree.populate(s);
        tree.display();
        flatten(tree.root);
        tree.display();
    }
    public static void flatten(TreeNode root){
        TreeNode current = root;
        while(current != null){
            TreeNode temp = current.left;
            if(temp != null){
                while(temp.right != null){
                    temp = temp.right;
                }
                temp.right = current.right;
                current.right = current.left;
                current.left = null;
            }
            current = current.right;
        }
    }
}