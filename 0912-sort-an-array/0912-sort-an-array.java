class Solution {
    public int[] sortArray(int[] nums) {
        //Merge Sort
        mergeSort(nums , 0 , nums.length - 1);

        return nums;
    }

    public static void mergeSort(int nums[] , int low , int high) {
        if(low < high) {
            int mid = low + (high - low)/2;

            mergeSort(nums , low , mid);
            mergeSort(nums , mid + 1 , high);

            merge(nums , low  , mid , high);
        }
    }

    public static void merge(int nums[] , int low , int mid , int high) {
        int temp[] = new int[high - low + 1];

        int i = low;
        int j = mid+1;
        int idx = 0;

        while(i<=mid && j<=high) {
            if(nums[i] <= nums[j]) {
                temp[idx++] = nums[i++];
            }
            else {
                temp[idx++] = nums[j++];
            }
        }

        while(i <= mid) {
            temp[idx++] = nums[i++];
        }

        while(j<=high) {
            temp[idx++] = nums[j++];
        }

        for(int k = low ; k<=high ; k++) {
            nums[k] = temp[k - low];
        }
    }

}