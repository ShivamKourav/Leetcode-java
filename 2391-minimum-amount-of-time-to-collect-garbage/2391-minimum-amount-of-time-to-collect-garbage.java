class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int pickP = 0;
        int pickG = 0;
        int pickM = 0;

        int travelP = 0;
        int travelG = 0;
        int travelM = 0;

        int lastP = 0;
        int lastG = 0;
        int lastM = 0;

        // Calculate pick time and last house
        for (int last = 0; last < garbage.length; last++) {
            String curr = garbage[last];

            for (int j = 0; j < curr.length(); j++) {
                char ch = curr.charAt(j);

                if (ch == 'P') {
                    pickP++;
                    lastP = last;
                }

                if (ch == 'G') {
                    pickG++;
                    lastG = last;
                }

                if (ch == 'M') {
                    pickM++;
                    lastM = last;
                }
            }
        }

        // Calculate travel time
        for (int i = 0; i < lastP; i++) {
            travelP += travel[i];
        }

        for (int i = 0; i < lastG; i++) {
            travelG += travel[i];
        }

        for (int i = 0; i < lastM; i++) {
            travelM += travel[i];
        }

        int ans = (pickP + travelP) + (pickG + travelG) + (pickM + travelM);

        return ans;
    }
}