package DSAConcepts;



public class SearchDemo {

    //Linear Search logic
    public static int linearSearch(int[] nums, int target) {
        int steps = 0;
        for(int i = 0; i<nums.length; i++) {
            steps++;
            if (nums[i] == target) {
                System.out.println("No of steps in Linear: " + steps);
                return i;
            }
        }
        System.out.println("No of steps in Linear: " + steps);
        return -1;
    }

    //Binary search Logic with loop
//    public static int binarySearch(int[] nums, int target) {
//        //5,7,9,11,13,15
//        int steps = 0;
//        int left = 0;
//        int right = nums.length-1;
//
//        while(left <= right){
//            steps++;
//            int mid = (left+right)/2;
//
//            if(nums[mid] == target){
//                System.out.println("No of steps in Binary: " + steps);
//                return mid;
//            }
//            else if(nums[mid] < target){
//                left = mid+1;
//            }
//            else{
//                right = mid -1;
//            }
//        }
//        System.out.println("No of steps in Binary: " + steps);
//        return -1;
//    }


    //Binary search logic without loop
    public static int binarySearch(int[] nums, int target, int left, int right) {
        //5,7,9,11,13,15
        if(left>right){
            return -1;
        }
        int mid = (left + right) / 2;
        if(nums[mid] == target) {
            return mid;
        }
        else if(nums[mid] <target) {
            return binarySearch(nums, target, mid + 1, right);
        }
        else {
            return binarySearch(nums, target, left, mid-1);
        }

    }



    public static void main(String[] args){

        int nums[] = {5,7,9,11,13,15};
        int target = 11;

        //Linear Search result

        int result1 = linearSearch(nums, target);
        if(result1 != -1){
            System.out.println("Element found at index: " + result1);
        }
        else{
            System.out.println("Element not found");
        }

        //Binary Search result WITH LOOP
//        int result2 = binarySearch(nums, target);
//        if(result2 != -1){
//            System.out.println("Element found at index: " + result2);
//        }
//        else{
//            System.out.println("Element not found");
//        }

        //Binary Search result WITHOUT LOOP
        int result2 = binarySearch(nums, target, 0, nums.length-1);
        if(result2 != -1){
            System.out.println("Element found at index: " + result2);
        }
        else{
            System.out.println("Element not found");
        }

    }

}
