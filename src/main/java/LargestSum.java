
import java.util.Collections;
import java.util.List;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
         if (nums == null || nums.size() < 2) {
            return -1;
        }

        Collections.sort(nums, Collections.reverseOrder());

        if (nums.get(0).equals(nums.get(1))) {
            return nums.get(0) + nums.get(1);
        }

        int secLargest = -1;
        for (int i = 1; i < nums.size(); i++) {
            if (!nums.get(i).equals(nums.get(0))) {
                secLargest = nums.get(i);
                break;
            }
        }

        if(secLargest == -1){
          return nums.get(0) * 2;
        }
        
        return nums.get(0) + secLargest;
    }
}