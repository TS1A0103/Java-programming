package DSAConcepts;

public class BubbleSortingDemo {
    public static void main(String[] args){
        int temp;
        int[] nums = new int[7];
        nums[0] = 2;
        nums[1] = 9;
        nums[2] = 6;
        nums[3] = 5;
        nums[4] = 24;
        nums[5] = 21;
        nums[6] = 0;
        System.out.println("Array before sorting");
        for (int num : nums) {
            System.out.print(num + " "); //2 9 6 5 24 21 0
        }
        for(int i=0; i<nums.length; i++){
            for(int j= 0; j<nums.length-i-1; j++){
                if(nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
            System.out.println();
            for (int num : nums) {
                System.out.print(num + " ");//Variable array
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Array after sorting");
        for (int num : nums) {
            System.out.print(num + " ");//2 5 6 9 21 24
        }
    }
}
