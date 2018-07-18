class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        first.add(nums[0]);
        list.add(first);
        for(int i = 1; i < nums.length; i++){
            List<List<Integer>> newlist = new ArrayList<>();
            for(List<Integer> temp : list){
                for(int j = 0; j < temp.size() + 1; j++){
                    List<Integer> newtemp = new ArrayList<>(temp);
                    newtemp.add(j, nums[i]);
                    newlist.add(newtemp);
                }
            }
            list = newlist;
        }
        return list;
    }
}
