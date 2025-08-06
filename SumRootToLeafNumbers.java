import java.util.Scanner;
public class SumRootToLeafNumbers{
    public static void main(String[] args){
        TreeNode tree = new TreeNode();
        Scanner s = new Scanner(System.in);
        tree.populate(s);
        tree.display();
        System.out.println(sumNumbers(tree.root));
    }
    static int total = 0;
    public static int sumNumbers(TreeNode root) {
        sumNumbersRecur(root, root.val);
        return total;
    }
    public static void sumNumbersRecur(TreeNode node, int num){
        if(node.left == null && node.right == null){
            total += num;
            return;
        }
        if(node.left != null){
            sumNumbersRecur(node.left, (num*10)+node.left.val);
        }
        if(node.right != null){
            sumNumbersRecur(node.right, (num*10)+node.right.val);
        }
    }
}