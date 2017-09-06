//O(n) -> in worst case O(2n)
//pwwkew -> returns 3 (wke)
//Longest unique substring
class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        char[] arr = s.toCharArray();
        int max = 0, length=0;
        for(int i=0;i<arr.length;i++)
        {
            HashSet<Character> hs = new HashSet<Character>();
            int curr = i+1;
            length = 1;
            hs.add(arr[i]);
            if(curr<arr.length)
            {
                while(hs.contains(arr[curr]) == false)
                {
                    hs.add(arr[curr]);
                    curr = curr + 1;
                    length = length + 1;
                    if(curr == arr.length)
                        break;
                }
            }
            if(length > max)
            {
                max = length;
            }
        }
        return max;
    }
}
