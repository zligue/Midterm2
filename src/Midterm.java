public class Midterm {

    static int[] reverseItPlease(int[] input){
        int temp;
        //Swapping the first element with the last one in the array
        for(int i = 0; i < input.length / 2; i++){
            temp = input[i];
            input[i] = input[input.length - 1 - i]; // Setting the element of the new Array to the last index of the input minus i
            input[input.length - 1 - i] = temp;
        }
        return input;
    }

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};
        System.out.println("Normal Array forwards");
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }

        nums = reverseItPlease(nums);
        System.out.println("Array Reversed");
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }

    }
}
