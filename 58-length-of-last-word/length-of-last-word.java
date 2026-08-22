class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        int last=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
count=0;
            }
            else{
            count++;
             last=count;
            }
            
        }

        return last;
    }
}