package DSAConcepts;

public class SelectionSortDemo {
    public static void main(String[] args){
        int[] nums = {15,16,7,8,4,25,2,3};
        int temp ;
        System.out.println("Array before sorting");
        for(int num: nums){
            System.out.print(num + " ");
        }
//Selection sorting logic
        for(int i =0; i<nums.length; i++){
            int minIndex = i;
            for(int j=i+1; j<nums.length; j++){
                if(nums[minIndex]>nums[j]){
                    minIndex = j;
                }
            }
            temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;

            System.out.println();
            for(int num: nums) {
                System.out.print(num + " ");
            }
        }
        System.out.println("Array after sorting");
        for(int num: nums) {
            System.out.print(num + " ");
        }
    }

}
