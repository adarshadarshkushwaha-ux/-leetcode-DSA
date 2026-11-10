import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates); // enables early stopping
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int remaining, int start,
                           List<Integer> current, List<List<Integer>> result) {
        if (remaining == 0) {
            result.add(new ArrayList<>(current)); // copy, since current keeps changing
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > remaining) break; // sorted, so the rest are too large

            current.add(candidates[i]);
            backtrack(candidates, remaining - candidates[i], i, current, result); // i, not i+1: reuse allowed
            current.remove(current.size() - 1); // undo the choice
        }
    }
}