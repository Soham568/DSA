class Solution {
    void swap(int[]arr,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public void sortColors(int[] arr) {
        int n = arr.length;
        int left = 0,mid = 0,right = n-1;
        while (mid<=right) {
            if (arr[mid] == 0 ) {
                swap(arr,mid, left);
                left++;
                mid++;
            }else if (arr[mid]==2) {
                swap(arr,mid, right);
                right--;
            }
            else mid++;
        }
    }
}