package array.interviewQuestions;

public class ReverseArray {
    public static void main(String[] args) {
        solve(new int[] {1, 2, 3, 4, 5});

    }

    public static void solve(int[] nums) {
        int lowIndex = 0;
        int highIndex = nums.length - 1;

        while (lowIndex < highIndex) {
            swap(nums, lowIndex, highIndex);
            lowIndex++;
            highIndex--;
        }
        for(int num : nums) {
            System.out.println(num);
        }
    }

    public static void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
