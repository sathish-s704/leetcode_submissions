class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l1=new ArrayList<>();
		for(int i=1;i<=numRows;i++){
		    List<Integer> l2=new ArrayList<>();
		    int x=1;
		    for(int k=1;k<=i;k++){
		        l2.add(x);
		        x=x*(i-k)/k;
		    }
		    l1.add(l2);
		}
		return l1;
    }
}