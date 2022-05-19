//day 68

public class TheKweakestRowsInMatrix {
        public int[] kWeakestRows(int[][] mat, int k) {
            int rows = mat.length;
            int cols = mat[0].length;
            int arr[] = new int[rows];
            //stores no. of 1's each row has in an array
            for(int i = 0; i < rows; i++){
                int count1 = 0;
                for(int j = 0; j < cols; j++){
                    if(mat[i][j] == 1){ //checks for all elements in the row
                        count1++;
                    }
                }
                arr[i] = count1;
            }   
            
            int ans[] = new int[k];
            for(int i = 0; i < k; i++){
                int min = 101; //bcz as per constraints m<=100
                int minIndex = 0;
                for(int j = 0; j < arr.length; j++){
                    if(arr[j] < min){
                        min = arr[j];
                        minIndex = j;
                    }
                }
                ans[i] = minIndex;
                arr[minIndex] = 101; //bcz as per constraints m<=100 & to avoid duplication we need to change the value
            }
            
            return ans;
            
        }
}
