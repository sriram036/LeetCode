import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InorderSuccessorInBST {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        TreeNode tree = new TreeNode();
        tree.populate(scanner);
        tree.display();
        TreeNode p = tree.root.left;
        System.out.println(inorderSuccessor(tree.root, p).val);
    }
    public static TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if(root == null){
            return null;
        }
        TreeNode successor = null;
        List<TreeNode> list = new ArrayList<>();
        inorderSuccessorRecur(root, p, successor, list);
        if(!list.isEmpty()){
            return list.get(0);
        }
        return successor;
    }
    public static void inorderSuccessorRecur(TreeNode root, TreeNode p, TreeNode successor, List<TreeNode> list){
        if(root == null){
            return;
        }
        if(p.val >= root.val){
            inorderSuccessorRecur(root.right, p, successor, list);
        }
        else{
            successor = root;
            if(list.isEmpty()){
                list.add(root);
            }
            else{
                list.set(0, root);
            }
            inorderSuccessorRecur(root.left, p, successor, list);
        }
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode root;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    public void populate(Scanner scanner){
        System.out.println("Enter value for root node : ");
        int val = scanner.nextInt();
        root = new TreeNode(val);
        populate(scanner, root);
    }
    private void populate(Scanner scanner, TreeNode node){
        System.out.println("Want to Enter left of " + node.val);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value of " + node.val + " Left");
            int leftVal = scanner.nextInt();
            node.left = new TreeNode(leftVal);
            populate(scanner, node.left);
        }

        System.out.println("Want to Enter right of " + node.val);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value of " + node.val + " Right");
            int rightVal = scanner.nextInt();
            node.right = new TreeNode(rightVal);
            populate(scanner, node.right);
        }
    }
    public void display(){
        List<Integer> list = new ArrayList<>();
        display(root, list);
        System.out.println(list);
    }
    private void display(TreeNode node, List<Integer> list){
        if(node == null){
            // list.add(null);
            return;
        }
        list.add(node.val);
        display(node.left, list);
        display(node.right, list);
    }
}