class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> flag=new ArrayList<>();
        int[] dup=new int[candies.length];
        for(int i=0;i<candies.length;i++){
            dup[i]=candies[i];
        }
        Arrays.sort(dup);
        for(int i=0;i<candies.length;i++){
            if(((candies[i])+extraCandies)>=dup[candies.length-1]){
                flag.add(true);
            }
            else{
                flag.add(false);
            }
        }
        return flag;
    }
}