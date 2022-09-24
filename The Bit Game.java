class Solution {
    public static int swapBitGame(long N) {
        // code here
        
        String s = Long.toBinaryString(N);
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                c++;
            }
        }
        if(c%2==1){
            return 1;
        }
        else{
            return 2;
        }
        
        
        
    }
}
