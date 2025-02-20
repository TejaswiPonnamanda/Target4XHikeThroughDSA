class Solution {

    private void dfs(int[] nums,int ind,List<Integer> temp,List<List<Integer>> ans)
    {
        //base case
        int n=nums.length;

        ans.add(new ArrayList<>(temp)); //dont X ans.add(temp);

        //         System.out.println("before: "+ans+"temp :"+temp+"at index: "+ind);


        for(int pos=ind;pos<nums.length;pos++ )//take+ not take but how to iterate on take and not take-->not possible right so iterante on ele of nums
        {

            if (pos != ind && nums[pos] == nums[pos - 1]) { //skip the duplicates, except for the first time
                continue;
            }
            temp.add(nums[pos]);  //
            //          System.out.println("after: "+ans+"temp :"+temp+"at index: "+ind);


            dfs(nums,pos+1,temp,ans);//explore right side elements

            temp.remove(temp.size()-1);
        }
        return ;

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> temp=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        dfs(nums,0,temp,ans);
        return ans;

    }
}