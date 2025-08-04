class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0)
                    j++;
                else if (sum > 0)
                    k--;
                else {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1])
                        j++;
                    while (j < k && nums[k] == nums[k + 1])
                        k--;
                }
            }
        }
        // Set<List<Integer>> set=new HashSet<>();
        // Set<Integer> tempSet;
        // for(int i=0;i<n;i++)
        // {
        //     tempSet=new HashSet<>();
        //     for(int j=i+1;j<n;j++)
        //     {
        //         int thirdElement=-nums[i]-nums[j];
        //         if(tempSet.contains(thirdElement)){
        //             List<Integer> triplet=Arrays.asList(nums[i],nums[j],thirdElement);
        //             Collections.sort(triplet);
        //             set.add(triplet);
        //         }
        //         tempSet.add(nums[j]);
        //     }
        // }
        // BruteForce
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=i+1;j<n;j++)
        //     {
        //         for(int k=j+1;k<n;k++)
        //         {
        //             if(nums[i]+nums[j]+nums[k]==0)
        //             {
        //                 set.add(Arrays.asList(nums[i],nums[j],nums[k]));
        //             }
        //         }
        //     }
        // }
        // ans.addAll(set);
        return ans;
    }
}