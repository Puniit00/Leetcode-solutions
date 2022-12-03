class Solution {
    public int maxVowels(String s, int k) {
        int max = 0;
        int vowel =0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))) vowel++; 
        }
        
        max = vowel;
        
        for(int i=k;i<s.length();i++){
            if(isVowel(s.charAt(i-k))) vowel--;
            if(isVowel(s.charAt(i))) vowel++;
            
            if(max < vowel) max = vowel;
        }
        
        return max;
    }
    
    private boolean isVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') return true;
        return false;
    }
}