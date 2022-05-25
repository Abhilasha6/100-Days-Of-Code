//day 74, find approach 2

public class MaxUnitsOnATruck {

    // public int maximumUnits(int[][] boxTypes, int truckSize) {
    // int max=0,sum=0;
    // for(int i=0;i<boxTypes.length;i++)
    // {
    // for(int j=1;j<boxTypes[i][j];j++)
    // {
    // int
    // int nb=boxTypes[i][j];
    // if(sum+boxTypes[i]<=truckSize)
    // {
    // max+=
    // }
    // }
    // }
    // }
    // }

    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int total[] = new int[1001];
        for (int i = 0; i < boxTypes.length; i++) {
            if (total[boxTypes[i][1]] == 0) {
                total[boxTypes[i][1]] = boxTypes[i][0];
            } else {
                total[boxTypes[i][1]] += boxTypes[i][0];
            }
        }
        int totalUnits = 0;
        for (int i = 1000; i >= 0 && truckSize > 0; i--) {
            if (total[i] != 0) {
                totalUnits += i * 1;
                total[i]--;
                truckSize--;
                i++;
            }
        }
        return totalUnits;
    }
}
