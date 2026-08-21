class Solution { 
    public boolean isPalindrome(int x) { 
        
        if (x < 0) {
            return false;
        }

        int p = x; 
        int digit; // यहाँ से " " हटा दिया
        int rev = 0; 
        
        while (x > 0) { 
            digit = x % 10;     
            rev = rev * 10 + digit;
            x = x / 10;         
        } 
        
    
        if (rev == p) { 
            return true; 
        } else { 
            return false; 
        } 
    } 
}
