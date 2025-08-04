import java.util.Arrays;
public class ConstructBinaryTreeFromPreorderAndInorderTraversal{
    public static void main(String[] args){
        int[] preOrder = {3, 9, 20, 15, 7};
        int[] inOrder = {9, 3, 15, 20, 7};
        TreeNode tree = new TreeNode();
        tree.root = buildTree(preOrder, inOrder);
        tree.display();
    }
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0){
            return null;
        }
        int root = preorder[0];
        int index = 0;
        for(int i = 0;i < inorder.length; i++){
            if(inorder[i]==root){
                index = i;
                break;
            }
        }
        TreeNode node = new TreeNode(root);

        node.left = buildTree(Arrays.copyOfRange(preorder, 1,index+1),Arrays.copyOfRange(inorder, 0, index));
        node.right = buildTree(Arrays.copyOfRange(preorder, index+1, preorder.length),Arrays.copyOfRange(inorder, index+1, inorder.length));
        return node;
    }
}