class Solution {
    public int numTeams(int[] rating) {
        
	if (rating.length < 3) return 0;

	int N = rating.length;

	int[] leftTree = new int[(int) 1e5 + 1];
	int[] rightTree = new int[(int) 1e5 + 1];

	for (int r : rating) update(rightTree, r, 1);

	int res = 0;
	for (int r : rating) {
		update(rightTree, r, -1);
		res += (getPrefixSum(leftTree, r - 1) * getSuffixSum(rightTree, r + 1));  // count increase
		res += (getSuffixSum(leftTree, r + 1) * getPrefixSum(rightTree, r - 1));  // count decrease
		update(leftTree, r, 1);
	}

	return res;
}

private void update(int[] BIT, int index, int val) {
	while (index < BIT.length) {
		BIT[index] += val;
		index += index & (-index);
	}
}

private int getPrefixSum(int[] BIT, int index) {
	int sum = 0;
	while (index > 0) {
		sum += BIT[index];
		index -= index & (-index);
	}
	return sum;
}

private int getSuffixSum(int[] BIT, int index) {
	return getPrefixSum(BIT, (int) 1e5) - getPrefixSum(BIT, index - 1);
}
}