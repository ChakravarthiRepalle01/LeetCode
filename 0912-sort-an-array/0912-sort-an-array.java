class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        mergeSort(0 , n-1 , nums);
        return nums;
    }

    public static void mergeSort(int low , int high , int nums[]) {
        if(low < high) {
            int mid = low + (high - low)/2;
            mergeSort(low , mid , nums);
            mergeSort(mid+1 , high , nums);
            merge(low , mid , high , nums);
        }
    }

    public static void merge(int low , int mid , int high , int nums[]) {
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

        while(i<=mid) temp[idx++] = nums[i++];

        while(j<=high) temp[idx++] = nums[j++];

        for(int k = low ; k<=high ; k++) {
            nums[k] = temp[k - low];
        }

    }

}