import java.util.Scanner;
public class FindBottomLeftTreeValue{
    static int classLevel = 0;
    static int bottomLeft = 0;
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        TreeNode tree = new TreeNode();
        tree.populate(s);
        tree.display();
        System.out.println(findBottomLeftValue(tree.root));
    }
    public static int findBottomLeftValue(TreeNode root) {
        findBottomLeft(root, 1, true);
        return bottomLeft;
    }
    public static void findBottomLeft(TreeNode node, int level, boolean isLeft){
        if(node == null){
            return;
        }
        if(node.left == null && node.right == null && level > classLevel){
            classLevel = level;
            bottomLeft = node.val;
        }
        findBottomLeft(node.left, level+1, true);
        findBottomLeft(node.right, level+1, false);
    }
}