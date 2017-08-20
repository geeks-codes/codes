/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/
    ArrayList<Integer> arr = new ArrayList<Integer>();
    boolean checkBST(Node root) 
    {
        if(root == null)
        {
            return true;
        }
        else
        {
            check_bst(root);
        }
        ArrayList<Integer> arr1 = new ArrayList<Integer>(arr);
        Collections.sort(arr);
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0;i<arr.size();i++)
        {
            if(hs.contains(arr1.get(i)))
            {
                return false;
            }
            hs.add(arr1.get(i));
            if(arr.get(i) == arr1.get(i))
            {
                continue;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
    void check_bst(Node node)
    {
        if(node == null)
        {
            return;
        }
        else
        {
            check_bst(node.left);
            arr.add(node.data);
            check_bst(node.right);
        }
    }
