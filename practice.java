

// class Hello{
//     public static void main(String[] args) {
        
//         int n=0 ,sum  = 0;
//         int i=1;
//         for(i=20; i<=40; i++){
//             if (i%2==0){
//                 sum=sum+i;
//                 n++;
//             }
//             i++;

//         }
//         System.out.println(sum +" " + n);
        

        
//     }
// }



// import java.util.ArrayList;
// import java.util.List;
// import java.util.Stack;

// class Solution 
// {
//     public List<Integer> preorderTraversal(TreeNode root) 
//     {
//         // This list will store the final preorder traversal
//         List<Integer> out = new ArrayList<>();

//         // Stack is used to simulate recursion
//         Stack<TreeNode> stack = new Stack<>();

//         // If tree is empty, return empty list
//         if (root == null) {
//             return out;
//         }

//         // Put the root node into the stack
//         stack.add(root);

//         // Continue until stack becomes empty
//         while (!stack.isEmpty()) 
//         {
//             // Remove the top node from the stack
//             TreeNode node = stack.pop();

//             // Visit the node
//             out.add(node.val);

//             // Add right child first
//             if (node.right != null) {
//                 stack.add(node.right);
//             }

//             // Add left child second
//             if (node.left != null) {
//                 stack.add(node.left);
//             }
//         }

//         return out;
//     }
// }


// /**
//  * Definition for a binary tree node.
//  */
// class TreeNode {

//     int val;
//     TreeNode left;
//     TreeNode right;

//     TreeNode() {
//     }

//     TreeNode(int val) {
//         this.val = val;
//     }

//     TreeNode(int val, TreeNode left, TreeNode right) {
//         this.val = val;
//         this.left = left;
//         this.right = right;
//     }
// }





// import java.util.ArrayList;
// import java.util.List;

// class Solution {

//     public void inorderHelper(TreeNode node, List<Integer> out)
//     {

//         // Base case
//         if (node == null) {
//             return;
//         }

//         // Left
//         inorderHelper(node.left, out);

//         // Root / Current node
//         out.add(node.val);

//         // Right
//         inorderHelper(node.right, out);
//     }

//     public List<Integer> inorderTraversal(TreeNode root) {

//         List<Integer> out = new ArrayList<>();

//         if (root == null) {
//             return out;
//         }

//         inorderHelper(root, out);

//         return out;
//     }
// }

// class TreeNode {

//     int val;
//     TreeNode left;
//     TreeNode right;

//     TreeNode(int val) {
//         this.val = val;
//     }
// }



// S()                                                                     
// {
//     if(INPUT=='a')
//     {
//         Advance();
//         if(B()==SUCCESS)
//         {
//             if(INPUT=='c')
//             {
//                 Advance();
//                 return SUCCESS;
//             }
//             return FAILURE;
//         }
//         return FAILURE;
//     }
//     return FAILURE;
// }

// B()
// {
//     if(INPUT=='b')
//     {
//         Advance();
//         if(INPUT=='c')
//         {
//             Advance();
//             return SUCCESS;
//         }
//         return SUCCESS;
//     }
//     return FAILURE;
// }

// //---------------------------------------------------------------------------------------------------------------------------------------------

// S()
// {
//     if(INPUT=='a')
//     {
//         Advance();
//         if(A()==SUCCESS)
//         {
//             if(INPUT=='d')
//             {
//                 Advance();
//                 return SUCCESS;
//             }
//             return FAILURE;
//         }
//         else if(B()==SUCCESS)
//         {
//             return SUCCESS;
//         }
//         return FAILURE;
//     }
//     return FAILURE;
// }

class Hello 
{
    static void changeValue(int a)
    {
        a = a*100 ;
        System.out.println("inside change value function "+ a);
    }
    public static void main(String[] args) 
    {
       int a = 10;
       System.out.println("before changing value "+ a);
       changeValue(a);
       System.out.println("after changing value "+ a);
    }
}