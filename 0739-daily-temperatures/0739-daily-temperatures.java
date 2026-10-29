class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(n-1);
        res[n-1] = 0;
        for(int i = n-2;i>=0;i--){
            while(!st.isEmpty() && temperatures[st.peek()]<=temperatures[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                res[i] = st.peek() - i;
            }
            else res[i] = 0;

            st.push(i);
        }
        return res;
    }
}