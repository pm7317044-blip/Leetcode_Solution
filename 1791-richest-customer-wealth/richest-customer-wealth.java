class Solution { 
    public int maximumWealth(int[][] accounts) { 
        int maximumWealth = 0; 
        
        for (int i = 0; i < accounts.length; i++) { 
            int rowsum = 0; 
            for (int j = 0; j < accounts[i].length; j++) { 
                rowsum = rowsum + accounts[i][j]; 
            } 
            maximumWealth = Math.max(maximumWealth, rowsum); 
        } 
        return maximumWealth; 
    } 
}
