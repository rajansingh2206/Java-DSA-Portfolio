class Solution {
    public String convertDateToBinary(String date) {
        String binYear=getBinary(date.substring(0,4));
        String binMonth=getBinary(date.substring(5,7));
        String binDay=getBinary(date.substring(8));
        return binYear+"-"+binMonth+"-"+binDay;
    }
    private String getBinary(String number){
        int n=Integer.parseInt(number);
        StringBuffer sb=new StringBuffer();
        while(n>=1){
            if(n%2==1)
                sb.append("1");
            else
                sb.append("0");
            n=n/2;
        }
        return sb.reverse().toString();
    }
}