class Solution {
    public int romanToInt(String s) {
        int num= 0;
        int n = s.length() - 1;
        int i,j = 0;
        int previous = 0;
    for( i= n; i >= 0; i--)
    {  
         if (s.charAt(i)=='I')
            num=1;
        else if (s.charAt(i)== 'V')
            num=5;
        else if (s.charAt(i)== 'X')
            num=10;
        else if (s.charAt(i)== 'L')
            num=50;
        else if (s.charAt(i)== 'C')
            num=100;
        else if (s.charAt(i)== 'D')
            num=500;
        else if(s.charAt(i)== 'M')
            num=1000;
       
        if(num < previous)
        {
            j -= num; 
        }
        else{
            j +=num;
        }
         previous = num;
    }
        
        
     
            
            
    return j;
    
} }  
    