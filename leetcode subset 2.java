class Solution {
     public void findSubsets(List<List<Integer>> ansList,List<Integer>ds,int[]nums,int ind)
     {
         ansList.add(new ArrayList<>(ds));
         for(int i= ind;i<nums.length;i++){
             if(i>ind && nums[i]==nums[i-1]) continue;
             ds.add(nums[i]);
             findSubsets(ansList,ds,nums,i+1);
              ds.remove(ds.size()-1);
         }
     }
     public List<List<Integer>> subsetsWithDup(int[] nums) {
         Arrays.sort(nums);
         List<List<Integer>> ansList= new ArrayList<>();
         findSubsets(ansList ,new ArrayList<>(),nums,0);
         return ansList;
     }
 }