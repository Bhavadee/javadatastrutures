class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        int m = matrix.length;
        int n = matrix[0].length;
        int r1= 0;
        int r2 = m-1;
        int c1 = 0;
        int c2 = n-1;
        while(c1<=c2 && r1 <= r2){

        for(int c = c1;c <=c2;c++)
        {
            list.add(matrix[r1][c]);
        }
        for(int r = r1+1;r<= r2;r++)
        {
            list.add(matrix[r][c2]);
        }
        if(r1<r2 && c1 < c2){
         for(int c = c2 -1;c >= c1;c--)
        {
            list.add(matrix[r2][c]);
        }
         for(int r = r2 -1;r > r1;r--)
        {
            list.add(matrix[r][c1]);
        }
        }
        r1++;
        c1++;
        r2--;
        c2--;
        }
        return list;
    }
}   
          

 

            
       