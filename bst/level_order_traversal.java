   /* 
    class Node 
       int data;
       Node left;
       Node right;
   */
   TreeMap<Integer, ArrayList<Integer>> tm = new TreeMap<Integer, ArrayList<Integer>>();
   void levelOrder(Node root) 
   {
       if(root == null)
       {
           return;
       }
       else
       {
            print_order(root,0);
            Set set = tm.entrySet();
            Iterator itr = set.iterator();
            while(itr.hasNext())
            {
                Map.Entry me = (Map.Entry)itr.next();
                ArrayList<Integer> arr1 = (ArrayList<Integer>)me.getValue();
                for(int i=0;i<arr1.size();i++)
                {
                    System.out.print(arr1.get(i)+" ");
                }
            }
       }
   }
   void print_order(Node node, int level)
   {
       if(node == null)
       {
           return;
       }
       else
       {
           if(tm.containsKey(level))
           {
               ArrayList<Integer> arr = new ArrayList<Integer>(tm.get(level));
               arr.add(node.data);
               tm.put(level,arr);
           }
           else
           {
               ArrayList<Integer> arr = new ArrayList<Integer>();
               arr.add(node.data);
               tm.put(level,arr);
           }
           print_order(node.left,level+1);
           print_order(node.right,level+1);
       }
   }
