class GFG 
{ 
  
// node of a BST 
static class Node 
{ 
    char data; 
    Node left, right; 
}; 
  
  
// function to get a new node 
static Node getNode(char data) 
{ 
    // Allocate memory 
    Node newNode = new Node(); 
      
    // put in the data  
    newNode.data = data; 
    newNode.left = newNode.right = null;  
    return newNode; 
} 
  
  
// function to construct a BST from 
// its level order traversal 
static Node LevelOrder(Node root , char data)  
{ 
    if(root == null) 
    {  
        root = getNode(data); 
        return root; 
    } 
    if(data <= root.data) 
    root.left = LevelOrder(root.left, data); 
    else
    root.right = LevelOrder(root.right, data); 
    return root;      
} 
  
static Node constructBst(char arr[], int n) 
{ 
    if(n == 0)return null; 
    Node root = null; 
  
    for(int i = 0; i < n; i++) 
    root = LevelOrder(root , arr[i]); 
      
    return root; 
} 
  
// function to print the inorder traversal 
static void inorderTraversal(Node root) 
{ 
    if (root == null) 
        return; 
      
    inorderTraversal(root.left); 
    System.out.print( root.data + " "); 
    inorderTraversal(root.right);  
} 
  
  
// Driver code 
public static void main(String args[]) 
{ 
    char arr[] = {'N', 'E', 'W', 'Y', 'O', 'R', 'K'}; 
    int n = arr.length; 
      
    Node root = constructBst(arr, n); 
      
    System.out.print( "Inorder Traversal: "); 
    inorderTraversal(root); 
} 
}  