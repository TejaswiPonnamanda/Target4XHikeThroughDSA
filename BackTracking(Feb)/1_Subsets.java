// class Solution {

//     private void dfs(int[] nums,int ind,List<Integer> temp,List<List<Integer>> ans)
//     {
//         //base case
//         int n=nums.length;
//         if(ind==n)
//         {
//             ans.add(new ArrayList<>(temp));
//             return;
//         }
//         //task and recursive case
//         temp.add(nums[ind]);
//         //take
//         dfs(nums,ind+1,temp,ans);

//         //pop back
//         temp.remove(temp.size()-1);

//         //not take
//         dfs(nums,ind+1,temp,ans);
//         return;
//     }
//     public List<List<Integer>> subsets(int[] nums)
//     {
//         List<Integer> temp=new ArrayList<>();
//         List<List<Integer>> ans=new ArrayList<>();
//         dfs(nums,0,temp,ans);
//         return ans;


//     }
// }

class Solution {

    private void dfs(int[] nums,int ind,List<Integer> temp,List<List<Integer>> ans)
    {
        //base case
        int n=nums.length;

        ans.add(new ArrayList<>(temp)); //dont X ans.add(temp);

        System.out.println("before: "+ans+"temp :"+temp+"at index: "+ind);


        /*
        [1,2,3,4]
        temp=[]
        ans=[[]]
        for pos=ind = 0 -->nums[0]=1 -->temp=[1]--->ans[[1]]  ---->
                = 1 -->nums[1]=2 -->temp[1,2]--->ans[[1],[1,2]]  ----->
                = 2 -->nums[2]=3 -->temp[1,2,3]-->ans[[1],[1,2],[1,2,3]]  ---->
                = 3 -->nums[3]=4 -->temp[1,2,3,4]--->ans[[1],[1,2],[1,2,3],[1,2,3,4]]  ---->

            pos=ind=1 --->[1,2,3]
            temp.pop_back()--->temp[1,2,3]
        for pos =  --->nums[0]=1

         */
        for(int pos=ind;pos<nums.length;pos++ )//take+ not take but how to iterate on take and not take-->not possible right so iterante on ele of nums
        {
            temp.add(nums[pos]);  //
            System.out.println("after: "+ans+"temp :"+temp+"at index: "+ind);
            dfs(nums,pos+1,temp,ans);//explore right side elements
            temp.remove(temp.size()-1);
        }
        return ;

    }
    public List<List<Integer>> subsets(int[] nums)
    {
        List<Integer> temp=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        dfs(nums,0,temp,ans);
        return ans;


    }
}