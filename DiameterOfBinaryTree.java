import java.util.Scanner;
public class DiameterOfBinaryTree{
    static int diameter = 0;
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        TreeNode tree = new TreeNode();
        tree.populate(s);
        tree.display();
        System.out.println(diameterOfBinaryTree(tree.root));
    }
    public static int diameterOfBinaryTree(TreeNode root) {
        findHeight(root);
        if(root.left == null && root.right == null){
            return 0;
        }
        return diameter+1;
    }
    public static int findHeight(TreeNode node){
        if(node == null){
            return -1;
        }
        int left = findHeight(node.left);
        int right = findHeight(node.right);
        int temp = left + right+1;
        diameter = Math.max(diameter, temp);
        return Math.max(left, right)+1;
    }
}