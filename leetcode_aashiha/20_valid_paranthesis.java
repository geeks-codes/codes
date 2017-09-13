class Solution 
{
    public boolean isValid(String s) 
    {
        char[] arr = s.toCharArray();
        //System.out.println("String : "+s+"  "+arr.length);
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<arr.length;i++)
        {
            if((arr[i] == '{') || (arr[i] == '[') || (arr[i] == '('))
            {
                st.push(arr[i]);
               // System.out.println("***"+st);
            }
            else if(st.isEmpty() == true)
            {
                return false;
            }
            else if(arr[i] == '}')
            {
                if(st.peek() != '{')
                {
                    return false;
                }
                st.pop();
            }
            else if(arr[i] == ')')
            {
                if(st.peek() != '(')
                {
                    return false;
                }
                st.pop();
            }
            else if(arr[i] == ']')
            {
                if(st.peek() != '[')
                {
                    return false;
                }
                st.pop();
            }
        }
        if(st.isEmpty() != true)
        {
            return false;
        }
        return true;
    }
}
