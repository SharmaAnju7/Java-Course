import java.util.*;

class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(20);
        nums.add(40);
        nums.add(80);
        nums.add(10);

        System.out.println("Original ArrayList:");
        for (int i : nums) {
            System.out.println(i);
        }

        nums.remove(0);
        System.out.println("After removing element at index 0:");
        for (int i : nums) {
            System.out.println(i);
        }

        Collections.sort(nums);
        System.out.println("After sorting:");
        for (int j : nums) {
            System.out.println(j);
        }

        // Check if the ArrayList contains a specific element (e.g., 40)
        if (nums.contains(40)) {
            System.out.println("ArrayList contains 40.");
        }
    }
}
