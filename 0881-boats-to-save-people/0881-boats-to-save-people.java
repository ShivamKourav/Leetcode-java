class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int l = people.length;
        int[] weight = new int[limit + 1];

        for (int i = 0; i < l; i++) {
            weight[people[i]]++;
        }

        int count = 0;
        int left = 1;
        int right = limit;
        
        while (left <= right) {
            while (left <= right && weight[left] <= 0) {
                left++;
            }
            while (left <= right && weight[right] <= 0) {
                right--;
            }

            if (left > right) {
                break;
            }

            if (left + right > limit) {
                count += weight[right];
                weight[right] = 0;
            } else {
                if (left == right) {
                    count += (weight[left] - 1) / 2 + 1;
                    break;
                }
                int sum = Math.min(weight[left], weight[right]);
                count += sum;
                weight[left] -= sum;
                weight[right] -= sum;
            }
        }

        return count;
    }
}