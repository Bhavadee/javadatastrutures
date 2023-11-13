class Solution {
    public String intToRoman(int num) {
        String sol = "";
         String ones[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
         String ten[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
         String hun[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
         String th[] = {"","M","MM","MMM"};

        sol = th[num/1000] + hun[(num%1000)/100] + ten[(num%100)/10] + ones[(num%10)];

        return sol;
    }
}