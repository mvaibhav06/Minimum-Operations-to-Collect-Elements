import java.util.List;

public class MinOperationsToCollectElements {
    public static int minOperations(List<Integer> nums, int k) {
        int index = Integer.MAX_VALUE;

        for(int i=1; i<=k; i++){
            int a = nums.lastIndexOf(i);
            if(index > a){
                index = a;
            }
        }
        return nums.size()-index;
    }

    public static void main(String[] args) {
        List<Integer> nums = List.of(3,2,5,3,1);
        System.out.println(minOperations(nums, 3));
    }
}
