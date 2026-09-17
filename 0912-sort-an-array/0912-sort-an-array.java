class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums);
        return nums;
    }

    public static void mergeSort(int nums[]) {
        int n = nums.length;
        merge(nums , 0 , n-1);
    }

    public static void merge(int nums[] , int low , int high) {
        if(low<high) {
            int mid = low + (high - low)/2;
            merge(nums , low , mid);
            merge(nums , mid+1 , high);
            mergeTwo(nums , low , mid , high);
        }
    }

    public static void mergeTwo(int nums[] , int low , int mid , int high) {
        int arr[] = new int[high-low+1];

        int i = low;
        int j = (mid+1);

        int idx = 0;
        while(i<=mid && j<=high) {
            if(nums[i]<=nums[j]) {
                arr[idx] = nums[i++];
            }
            else {
                arr[idx] = nums[j++];
            }
            idx++;
        }

        while(i<=mid) {
            arr[idx++] = nums[i++];
        }

        while(j<=high) {
            arr[idx++] = nums[j++];
        }

        for(i = low ; i<=high ; i++) {
            nums[i] = arr[i-low];
        }
    }

}