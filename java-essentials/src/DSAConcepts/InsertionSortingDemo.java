package DSAConcepts;

public class InsertionSortingDemo{
    public static void main(String[] args){
        int[] numbers = {5,6,4,3,7,2};
//        System.out.println("before sorting list elements are: ");
//        for(int number: numbers){
//            System.out.print(number + " ");
//        }
        //Selection sorting logic
        int j;
        int key;
        for(int i = 1; i<numbers.length; i++){
            key = numbers[i];
            j= i-1;
            while(j>=0 && numbers[j]>key){
                numbers[j+1] = numbers[j];
                j= j-1;
            }
            numbers[j+1] = key;
//            System.out.println();
//            System.out.println("list of elements in the iteration " + i + " are: ");
//            for(int number: numbers){
//                System.out.print(number + " ");
//            }
        }
        System.out.println();
        System.out.println("after sorting list elements are: ");
        for(int number: numbers){
            System.out.print(number + " ");
        }
    }
}
